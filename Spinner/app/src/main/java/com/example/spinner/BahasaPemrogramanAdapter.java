package com.example.spinner;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.spinner.inventory.BahasaPemrograman;

import java.util.List;

public class BahasaPemrogramanAdapter extends BaseAdapter {
    private Context context;
    private List<BahasaPemrograman> bahasaPemrogramanList;

    public BahasaPemrogramanAdapter(Context context, List<BahasaPemrograman> bahasaPemrogramanList) {
        this.context = context;
        this.bahasaPemrogramanList = bahasaPemrogramanList;
    }
    @Override
    public int getCount() {
        return bahasaPemrogramanList !=null ? bahasaPemrogramanList.size() : 0;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View rootView = LayoutInflater.from(context).inflate(R.layout.item_bahasapemrograman, viewGroup, false);

        TextView txtBahasaPemrograman = rootView.findViewById(R.id.bahasapemrograman);
        ImageView image = rootView.findViewById(R.id.image);

        txtBahasaPemrograman.setText(bahasaPemrogramanList.get(i).getBahasapemrograman());
        image.setImageResource(bahasaPemrogramanList.get(i).getImage());

        return rootView;
    }
}
