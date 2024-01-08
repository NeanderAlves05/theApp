package com.example.theapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private boolean buttonPressed=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton pressButton = findViewById(R.id.button);
        pressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cambia lo stato del pulsante
                buttonPressed = !buttonPressed;

                // Aggiorna l'immagine del pulsante in base allo stato
                if (buttonPressed) {
                    pressButton.setBackgroundResource(R.drawable.pressed_button);
                } else {
                    pressButton.setBackgroundResource(R.drawable.button);
                }
            }
        });
    }
}