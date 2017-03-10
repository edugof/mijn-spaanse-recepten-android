package com.edugof.mijnspaanserecepten;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class DessertsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);
        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent,
                                    View view,
                                    int position,
                                    long recipeId) {
                requestRecipe(recipeId);
            }
        });
    }

    public void requestRecipe(long recipeId) {
        Intent intent = new Intent(this, RecipeActivity.class);
        intent.putExtra("recipeId", recipeId);
        startActivity(intent);
    }
}
