package com.example.listexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.listexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        binding.menuButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent explicitIntent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(explicitIntent);
            }
        });
    }
}