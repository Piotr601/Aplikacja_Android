package com.example.pam_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Polecane extends AppCompatActivity {

    ListView listView;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_polecane);
        listView = (ListView) findViewById(R.id.listView);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("🌺 Ogród Japoński \n     ⭐⭐⭐⭐⭐");
        arrayList.add("🌸 Ogród Botaniczny \n     ⭐⭐⭐⭐⭐");
        arrayList.add("🐿 Park Południowy \n     ⭐⭐⭐⭐");
        arrayList.add("🌳 Park Grabiszyński \n     ⭐⭐⭐⭐");
        arrayList.add("🐦 Park Skowroni \n     ⭐⭐⭐⭐");
        arrayList.add("🌷 Park Szczytnicki \n     ⭐⭐⭐⭐");
        arrayList.add("⛲ Park Zachodni\n     ⭐⭐⭐");
        arrayList.add("🌻 Park Wschodni\n     ⭐⭐⭐");
        arrayList.add("⛰ Park Andersa\n     ⭐⭐");
        arrayList.add("🏞 Park Juliusza Słowackiego\n     ⭐⭐");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(arrayAdapter);
    }
}