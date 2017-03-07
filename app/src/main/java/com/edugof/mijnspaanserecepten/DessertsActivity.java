package com.edugof.mijnspaanserecepten;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class DessertsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);
    }

    public void requestRecipe(View view) {
        startActivity(new Intent(this, RecipeActivity.class));
    }
}
