package com.example.listviewproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    RecyclerView lsDish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lsDish=findViewById(R.id.lsDish);

        ArrayList<Dish> arr = new ArrayList<>();

        Random r = new Random();

        arr.add(new Dish(R.drawable.bestila,10,"Bestilla"));
        arr.add(new Dish(R.drawable.burger,r.nextInt(10)*5,"Burger"));
        arr.add(new Dish(R.drawable.pizza,r.nextInt(10)*5,"Pizza"));
        arr.add(new Dish(R.drawable.chiken_rise,r.nextInt(10)*5,"Chiken Rise"));
        arr.add(new Dish(R.drawable.salade_chiken,r.nextInt(10)*5,"Salade Chiken"));
        arr.add(new Dish(R.drawable.shawarma,r.nextInt(10)*5,"Shawarma"));
        arr.add(new Dish(R.drawable.tajine,r.nextInt(10)*5,"Tajine"));
        arr.add(new Dish(R.drawable.salmon,r.nextInt(10)*5,"Salmon"));

        DishRecyclerViewAdapter adapter = new DishRecyclerViewAdapter(this,arr);
        lsDish.setLayoutManager(new LinearLayoutManager(this));
        lsDish.setAdapter(adapter);
    }

}