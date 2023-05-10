package com.example.deliveryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class IdiomActivity extends AppCompatActivity {

    private Button btnIdiom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idiom);

        btnIdiom = findViewById(R.id.button_apply_language);

        btnIdiom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(IdiomActivity.this, "Cambiaste de idioma", Toast.LENGTH_SHORT).show();

            }
        });
    }
}