package com.edugof.mijnspaanserecepten;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class RecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
        Intent myIntent = getIntent();
        Long recipeId = myIntent.getLongExtra("recipeId", 0);
        String recipeName = getResources().getResourceEntryName(recipeId.intValue());

        Toast.makeText(RecipeActivity.this, "" + recipeName, Toast.LENGTH_SHORT).show();
    }
}
