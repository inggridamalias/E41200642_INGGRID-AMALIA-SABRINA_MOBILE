package com.example.recyclerview;

import android.content.Intent;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

//membuat class .MovieViewHolder di dalam class
public class MoviesRecyclerViewAdapter extends RecyclerView.Adapter<MoviesRecyclerViewAdapter.MovieViewHolder> {
    ArrayList<Movies> arrayListMovies;

    public MoviesRecyclerViewAdapter(ArrayList<Movies> arrayListMovies) {
        this.arrayListMovies = arrayListMovies;
    }

    //mengimplementasikan method
    @NonNull
    @Override
    public MoviesRecyclerViewAdapter.MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MoviesRecyclerViewAdapter.MovieViewHolder holder, int position) {
        //membuat sebuah konstanta
        final Movies movies = arrayListMovies.get(position);

        //set nilai yang tersimpan di dalam array list
        holder.textViewTitle.setText(movies.getTitle());
        holder.textViewRating.setText(String.valueOf(movies.getRating()));
        holder.textViewReleaseDate.setText(movies.getReleasedate());

        //memberi action pada list untuk memberikan detail
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailActivity.class);
                intent.putExtra("MOVIES", movies);
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayListMovies.size();
    }

    //deklarasikan class MovieViewHolder
    public class MovieViewHolder extends RecyclerView.ViewHolder {
        //deklarasikan widget/view yang berada di dalam item
        TextView textViewTitle, textViewRating, textViewReleaseDate;

        //membuat constructor matching super
        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            //memanggil findview
            textViewTitle = itemView.findViewById(R.id.tvTitle);
            textViewRating = itemView.findViewById(R.id.tvRating);
            textViewReleaseDate = itemView.findViewById(R.id.tvReleaseDate);

        }
    }

}
