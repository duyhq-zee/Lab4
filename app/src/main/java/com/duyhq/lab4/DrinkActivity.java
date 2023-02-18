package com.duyhq.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DrinkActivity extends AppCompatActivity {
    String foodText = "";
    String drinkText = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();

        foodText = intent.getStringExtra("foodText");
        drinkText = intent.getStringExtra("drinkText");
    }

    public void onClick0(View view) {
        Intent intent = new Intent(this, MainActivity.class);

        drinkText = "Pepsi";

        intent.putExtra("foodText", foodText);
        intent.putExtra("drinkText", drinkText);

        startActivity(intent);

        finish();
    }

    public void onClick1(View view) {
        Intent intent = new Intent(this, MainActivity.class);

        drinkText = "Heineken";

        intent.putExtra("foodText", foodText);
        intent.putExtra("drinkText", drinkText);

        startActivity(intent);

        finish();
    }

    public void onClick2(View view) {
        Intent intent = new Intent(this, MainActivity.class);

        drinkText = "Tiger";

        intent.putExtra("foodText", foodText);
        intent.putExtra("drinkText", drinkText);

        startActivity(intent);

        finish();
    }

    public void onClick3(View view) {
        Intent intent = new Intent(this, MainActivity.class);

        drinkText = "Sài Gòn Đỏ";

        intent.putExtra("foodText", foodText);
        intent.putExtra("drinkText", drinkText);

        startActivity(intent);

        finish();
    }
}