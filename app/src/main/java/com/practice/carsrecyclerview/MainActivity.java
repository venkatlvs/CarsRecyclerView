package com.practice.carsrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView rView;
    String[] s1, s2;
    int[] images = {R.drawable.bmwx1, R.drawable.bmwx3, R.drawable.bmwx4, R.drawable.bmwx5, R.drawable.bmwm3, R.drawable.bmwm4
            , R.drawable.bmwm5, R.drawable.bmwm7, R.drawable.bmwm8};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s1=getResources().getStringArray(R.array.Models);
        s2=getResources().getStringArray(R.array.Description);
        rView=findViewById(R.id.recyclrView);

        Radapter adp=new Radapter(this,s1,s2,images);
        rView.setAdapter(adp);
        rView.setLayoutManager(new LinearLayoutManager(this));
    }
}