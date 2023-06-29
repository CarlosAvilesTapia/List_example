package com.example.listexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.example.listexample.databinding.ActivitySecondBinding;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

// Creación de clase Binding.
private ActivitySecondBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Creación de una instancia de la clase Binding para ser usada en el layout.
        binding = ActivitySecondBinding.inflate(getLayoutInflater());

        // Llamado al método para generar la vista.
        setContentView(binding.getRoot());

        // Se crea un listado para agregar platos a un menú
        List<String> plates = new ArrayList<String>();

        plates.add("Sanguche de pescado");
        plates.add("Sopaipillas con pebre");
        plates.add("Pan con papas fritas");
        plates.add("Papapleto");
        plates.add("Sanguche de potito");
        plates.add("Choripan");
        plates.add("Salchipapas");
        plates.add("Sushipleto");
        plates.add("Anticuchos");
        plates.add("Papas fritas");
        plates.add("Pizza del día");
        plates.add("Sopaipleto");
        plates.add("Perol");
        plates.add("Empanada de queso");
        plates.add("Cigarros sueltos");
        plates.add("Galletas carioca");
        plates.add("Melvin");
        plates.add("Pipeño");
        plates.add("Happy cola");
        plates.add("Jugos naturales");

        // Se crea una instancia de la clase ArrayAdapter para que adapte el listado creado.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, plates);

        // Mediante view binding se llama al método setAdapter para que produzca la vista del listado creado.
        binding.platesList.setAdapter(adapter);
    }
}
