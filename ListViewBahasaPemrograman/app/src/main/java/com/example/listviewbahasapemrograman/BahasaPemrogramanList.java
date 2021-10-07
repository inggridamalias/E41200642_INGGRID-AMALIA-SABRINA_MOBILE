package com.example.listviewbahasapemrograman;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class BahasaPemrogramanList extends ArrayAdapter<String> {

    private Activity context;
    private String[] bahasapemrograman;
    private Integer[] icon;

    //membuat constructor
    public BahasaPemrogramanList(@NonNull Activity context, String[] bahasapemrograman, Integer[] icon) {
        super(context, R.layout.list_single,bahasapemrograman);
        this.context = context;
        this.bahasapemrograman = bahasapemrograman;
        this.icon = icon;
    }
    //create view
    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_single, null, true);
        TextView txtBahasapemrograman = rowView.findViewById(R.id.bahasapemrograman);
        ImageView ivIcon = rowView.findViewById(R.id.icon);
        txtBahasapemrograman.setText(bahasapemrograman[position]);
        ivIcon.setImageResource(icon[position]);
        return rowView;
    }
}
