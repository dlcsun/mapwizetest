package com.example.mapwizetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
//import android.view.View;

public class Homepage extends AppCompatActivity {
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        setTitle("");

        button = findViewById(R.id.button);
        button.setOnClickListener(view -> openMainActivity());
    }
    public void openMainActivity(){
        Intent intent = new Intent(Homepage.this, MainActivity.class );

        Homepage.this.startActivity(intent);

    }
}

