package com.google.vr.sdk.samples.simplepanowidget;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;

public class Galeria extends Activity {

    private final String image_titles[] = {
            "biblioteca_1",
            "biblioteca_2",
            "biblioteca_3",
            "biblioteca_4"
    };

    private final Integer image_ids[] = {
            R.drawable.biblioteca_1,
            R.drawable.biblioteca_2,
            R.drawable.biblioteca_3,
            R.drawable.biblioteca_4
    };

    private ArrayList<CreateList> prepareData(String option){

        ArrayList<CreateList> theimage = new ArrayList<>();
        for(int i = 0,j = 0; i< image_titles.length; i++){
            CreateList createList = new CreateList();
            // Se o texto clicado(Sem espaços) for igual ao texto inicial da imagem
            if(option.trim().toLowerCase().equals(image_titles[i].substring(0,image_titles[i].indexOf('_')))){
                createList.setImage_title(image_titles[j]);
                createList.setImage_ID(image_ids[j]);
                theimage.add(createList);
                j++;
            }

        }
        return theimage;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);
        Intent i = getIntent();
        String option = i.getStringExtra("option");

        setContentView(R.layout.activity_galeria);

        RecyclerView recyclerView = findViewById(R.id.imagegallery);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(),2);
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<CreateList> createLists = prepareData(option);
        MyAdapter adapter = new MyAdapter(getApplicationContext(), createLists);
        recyclerView.setAdapter(adapter);
    }
}
