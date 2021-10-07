package com.example.autocompletetextviewbp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView autoCompleteTextView;

    //membuat List
    List<String> bahasapemrograman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        bahasapemrograman = new ArrayList<>();

        bahasapemrograman.add("C");
        bahasapemrograman.add("C#");
        bahasapemrograman.add("C++");
        bahasapemrograman.add("Java");
        bahasapemrograman.add("JavaScript");
        bahasapemrograman.add("Objective-C");
        bahasapemrograman.add("PHP");
        bahasapemrograman.add("Phyton");
        bahasapemrograman.add("Ruby");

        //membuat ArrayAdapter
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, bahasapemrograman);

        //set adapter
        autoCompleteTextView.setAdapter(arrayAdapter);

        //menetapkan jumlah karakter yang harus diketik sebelum saran ditampilkan
        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setTextColor(Color.BLACK);

    }
}