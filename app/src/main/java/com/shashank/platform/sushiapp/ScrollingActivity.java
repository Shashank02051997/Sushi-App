package com.shashank.platform.sushiapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ScrollingActivity extends AppCompatActivity implements AppBarLayout.OnOffsetChangedListener {

    ImageView sushiimg;
    TextView sushi_name,sushi_type,sushi_rate;
    RelativeLayout relativeLayout;
    int data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("");
        relativeLayout = findViewById(R.id.relativeLayout);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.app_bar);
        appBarLayout.addOnOffsetChangedListener(this);
        sushiimg = findViewById(R.id.sushiimg);
        sushi_name = findViewById(R.id.sushi_name);
        sushi_type = findViewById(R.id.sushi_type);
        sushi_rate = findViewById(R.id.sushi_rate);
        Intent intent = getIntent();
        data = Integer.parseInt(intent.getStringExtra("data"));
        if (data == 1) {
            sushiimg.setImageResource(R.drawable.sushi_img_1);
            sushi_name.setText("Sushi with shrimp");
            sushi_type.setText("Seaweed Sushi");
            sushi_rate.setText("850$");
        } else if (data == 2) {
            sushiimg.setImageResource(R.drawable.sushi_img_2);
            sushi_name.setText("Uramaki on chopping board");
            sushi_type.setText("Spicy Sushi");
            sushi_rate.setText("755$");
        } else if (data == 3) {
            sushiimg.setImageResource(R.drawable.sushi_img_3);
            sushi_name.setText("Seafoos dish filled pot");
            sushi_type.setText("Vegetable Sushi");
            sushi_rate.setText("550$");
        } else if (data == 4) {
            sushiimg.setImageResource(R.drawable.sushi_img_4);
            sushi_name.setText("Sushi with meat");
            sushi_type.setText("Seaweed Sushi");
            sushi_rate.setText("480$");
        }
    }

    @Override
    public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
        if (Math.abs(verticalOffset) == appBarLayout.getTotalScrollRange()) {
            // Collapsed
            relativeLayout.setVisibility(View.VISIBLE);
        } else if (verticalOffset == 0) {
            // Expanded
            relativeLayout.setVisibility(View.INVISIBLE);
        } else {
            // Somewhere in between
            relativeLayout.setVisibility(View.INVISIBLE);
        }

    }
}
