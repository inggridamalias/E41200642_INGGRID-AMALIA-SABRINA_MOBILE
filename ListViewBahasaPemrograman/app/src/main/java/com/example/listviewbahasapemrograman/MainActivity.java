package com.example.listviewbahasapemrograman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView list;
    //menginputkan bahasa pemrograman
    String[] bahasapemrograman = {"C","C#","C++","Java","JavaScript","Objective-C","PHP","Phyton","Ruby"};
    Integer[] icon = {R.drawable.c, R.drawable.chash, R.drawable.cplus, R.drawable.java, R.drawable.javascript, R.drawable.objectivec, R.drawable.php, R.drawable.phyton, R.drawable.ruby};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BahasaPemrogramanList adapter = new BahasaPemrogramanList(MainActivity.this, bahasapemrograman, icon);
        list = findViewById(R.id.list);
        //mengeset adapter
        list.setAdapter(adapter);
    }
}