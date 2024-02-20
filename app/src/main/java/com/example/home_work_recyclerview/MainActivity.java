package com.example.home_work_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int[] images = {
            R.drawable.icon1,
            R.drawable.icon2,
            R.drawable.icon3,
            R.drawable.icon4,
            R.drawable.icon5,
            R.drawable.icon6,
            R.drawable.icon7,
            R.drawable.icon8,
            R.drawable.icon9,
            R.drawable.icon10,
            R.drawable.icon11,
            R.drawable.icon12,
            R.drawable.icon13,
            R.drawable.icon14,
            R.drawable.icon15,
            R.drawable.icon16,
            R.drawable.icon17,
            R.drawable.icon18,
            R.drawable.icon19,
            R.drawable.icon20
    };



    ArrayList<CardModel> models = new ArrayList<>();;

    CardAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpModel();
        adapter = new CardAdapter(this, models);
        RecyclerView recyclerView = findViewById(R.id.reView);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setUpModel(){
        String [] text = getResources().getStringArray(R.array.HomeWork);
        for (int i = 0 ; i<text.length; i++){
            models.add(new CardModel(text[i], images[i]));
        }
    }
}