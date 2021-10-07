package com.example.spinner.inventory;

import com.example.spinner.R;

import java.util.ArrayList;
import java.util.List;

public class Data {
    //membuat method untuk mengembalikan data
    public static List<BahasaPemrograman> getBahasaPemrogramanList() {
        List<BahasaPemrograman> bahasaPemrogramanList = new ArrayList<>();

        BahasaPemrograman C = new BahasaPemrograman();
        C.setBahasapemrograman("C");
        C.setImage(R.drawable.c);
        bahasaPemrogramanList.add(C);

        BahasaPemrograman Chash = new BahasaPemrograman();
        Chash.setBahasapemrograman("C#");
        Chash.setImage(R.drawable.chash);
        bahasaPemrogramanList.add(Chash);

        BahasaPemrograman Cplus = new BahasaPemrograman();
        Cplus.setBahasapemrograman("C++");
        Cplus.setImage(R.drawable.cplus);
        bahasaPemrogramanList.add(Cplus);

        BahasaPemrograman Java = new BahasaPemrograman();
        Java.setBahasapemrograman("Java");
        Java.setImage(R.drawable.java);
        bahasaPemrogramanList.add(Java);

        BahasaPemrograman JavaScript = new BahasaPemrograman();
        JavaScript.setBahasapemrograman("JavaScript");
        JavaScript.setImage(R.drawable.javascript);
        bahasaPemrogramanList.add(JavaScript);

        BahasaPemrograman PHP = new BahasaPemrograman();
        PHP.setBahasapemrograman("PHP");
        PHP.setImage(R.drawable.php);
        bahasaPemrogramanList.add(PHP);

        BahasaPemrograman Ruby = new BahasaPemrograman();
        Ruby.setBahasapemrograman("Ruby");
        Ruby.setImage(R.drawable.ruby);
        bahasaPemrogramanList.add(Ruby);

        return bahasaPemrogramanList;
    }
}
