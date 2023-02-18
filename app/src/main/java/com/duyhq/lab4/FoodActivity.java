package com.duyhq.lab4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FoodActivity extends AppCompatActivity {
    String foodText = "";
    String drinkText = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();

        foodText = intent.getStringExtra("foodText");
        drinkText = intent.getStringExtra("drinkText");
    }

    public void onClick0(View view) {
        Intent intent = new Intent(this, MainActivity.class);

//        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);

        foodText = "Phở Hà Nội";

        intent.putExtra("foodText", foodText);
        intent.putExtra("drinkText", drinkText);

        startActivity(intent);

        finish();
    }

    public void onClick1(View view) {
        Intent intent = new Intent(this, MainActivity.class);

        foodText = "Bún bò Huế";

        intent.putExtra("foodText", foodText);
        intent.putExtra("drinkText", drinkText);

        startActivity(intent);

        finish();
    }

    public void onClick2(View view) {
        Intent intent = new Intent(this, MainActivity.class);

        foodText = "Mì Quảng";

        intent.putExtra("foodText", foodText);
        intent.putExtra("drinkText", drinkText);

        startActivity(intent);

        finish();
    }

    public void onClick3(View view) {
        Intent intent = new Intent(this, MainActivity.class);

        foodText = "Hủ tíu Sài Gòn";

        intent.putExtra("foodText", foodText);
        intent.putExtra("drinkText", drinkText);

        startActivity(intent);

        finish();
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