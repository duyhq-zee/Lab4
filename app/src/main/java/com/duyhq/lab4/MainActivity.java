package com.duyhq.lab4;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String foodText = "";
    String drinkText = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("Log", "Created");

        Intent intent = getIntent();

        String foodTmp = intent.getStringExtra("foodText");

        if (foodTmp != null && foodTmp != "") {
            foodText = foodTmp;
            TextView textTV = findViewById(R.id.food_text_tv);
            textTV.setText(foodText);
        }

        String drinkTmp = intent.getStringExtra("drinkText");

        if (drinkTmp != null && drinkTmp != "") {
            drinkText = drinkTmp;
            TextView textTV = findViewById(R.id.drink_text_tv);
            textTV.setText(drinkText);
        }
    }

    public void onClickFoodButton(View view) {
        Intent intent = new Intent(this, FoodActivity.class);

        intent.putExtra("foodText", foodText);
        intent.putExtra("drinkText", drinkText);

        startActivity(intent);

//        finish();
    }

    public void onClickDrinkButton(View view) {
        Intent intent = new Intent(this, DrinkActivity.class);

        intent.putExtra("foodText", foodText);
        intent.putExtra("drinkText", drinkText);

        startActivity(intent);

//        finish();
    }

    public void onClickExitButton(View view) {
        finishAffinity();
        System.exit(0);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("Log", "Started");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i("Log", "Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i("Log", "Paused");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        Log.i("Log", "Instance state saved");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        Log.i("Log", "Instance state restored");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("Log", "Stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("Log", "Destroy");
    }
}