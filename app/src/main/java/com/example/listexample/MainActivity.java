package com.example.listexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.listexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Creación de clase Binding.
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Creación de una instancia de la clase Binding para ser usada en el layout.
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        // Llamado al método para generar la vista.
        setContentView(binding.getRoot());

        // Enlace del botón del diseño mediante view binding.
        binding.menuButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Creación de una instancia de la clase Intent de tipo explícito para enlazar ambas activities.
                Intent explicitIntent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(explicitIntent);
            }
        });
    }
}
