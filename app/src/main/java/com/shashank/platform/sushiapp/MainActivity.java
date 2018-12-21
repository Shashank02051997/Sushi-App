package com.shashank.platform.sushiapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button order_now_btn_1, order_now_btn_2, order_now_btn_3, order_now_btn_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        order_now_btn_1 = findViewById(R.id.order_now_btn_1);
        order_now_btn_2 = findViewById(R.id.order_now_btn_2);
        order_now_btn_3 = findViewById(R.id.order_now_btn_3);
        order_now_btn_4 = findViewById(R.id.order_now_btn_4);
        order_now_btn_1.setOnClickListener(this);
        order_now_btn_2.setOnClickListener(this);
        order_now_btn_3.setOnClickListener(this);
        order_now_btn_4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(getApplicationContext(),ScrollingActivity.class);
        if (view.getId() == R.id.order_now_btn_1) {
              intent.putExtra("data","1");
        } else if (view.getId() == R.id.order_now_btn_2) {
            intent.putExtra("data","2");

        } else if (view.getId() == R.id.order_now_btn_3) {
            intent.putExtra("data","3");

        } else if (view.getId() == R.id.order_now_btn_4) {
            intent.putExtra("data","4");

        }
        startActivity(intent);
    }
}
