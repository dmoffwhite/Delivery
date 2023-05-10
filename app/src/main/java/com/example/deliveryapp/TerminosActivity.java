package com.example.deliveryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TerminosActivity extends AppCompatActivity {

    private Button btnTerminos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terminos);

        btnTerminos = findViewById(R.id.btnTerminos);

        btnTerminos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(TerminosActivity.this, "Se ha aceptado los terminos y condiciones", Toast.LENGTH_SHORT).show();
            }
        });

    }
}