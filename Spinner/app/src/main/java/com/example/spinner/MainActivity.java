package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

import com.example.spinner.inventory.Data;

public class MainActivity extends AppCompatActivity {

    //membuat objek
    private Spinner spinner_bahasapemrograman;
    //membuat turunan dari kelas adapter
    private BahasaPemrogramanAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner_bahasapemrograman = findViewById(R.id.spinner_bahasapemrograman);
        //inisialisasi turunan dari kelas adapter
        adapter = new BahasaPemrogramanAdapter(MainActivity.this, Data.getBahasaPemrogramanList());
        spinner_bahasapemrograman.setAdapter(adapter);
    }
}