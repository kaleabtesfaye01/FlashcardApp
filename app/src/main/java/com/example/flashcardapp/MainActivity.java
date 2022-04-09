package com.example.flashcardapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.flashcard_question).setOnClickListener(view -> {
            findViewById(R.id.flashcard_question).setVisibility(View.INVISIBLE);
            findViewById(R.id.flashcard_answer).setVisibility(View.VISIBLE);
        });

        findViewById(R.id.flashcard_answer).setOnClickListener(view -> {
            findViewById(R.id.flashcard_answer).setVisibility(View.INVISIBLE);
            findViewById(R.id.flashcard_question).setVisibility(View.VISIBLE);
        });

        findViewById(R.id.option1).setOnClickListener(view -> {
            findViewById(R.id.option1).setBackgroundColor(ContextCompat.getColor(getBaseContext(), R.color.red));
            findViewById(R.id.option3).setBackgroundColor(ContextCompat.getColor(getBaseContext(), R.color.green));
        });

        findViewById(R.id.option2).setOnClickListener(view -> {
            findViewById(R.id.option2).setBackgroundColor(ContextCompat.getColor(getBaseContext(), R.color.red));
            findViewById(R.id.option3).setBackgroundColor(ContextCompat.getColor(getBaseContext(), R.color.green));
        });

        findViewById(R.id.option3).setOnClickListener(view -> findViewById(R.id.option3).setBackgroundColor(ContextCompat.getColor(getBaseContext(), R.color.green)));

        findViewById(R.id.show).setOnClickListener(view -> {
            findViewById(R.id.show).setVisibility(View.INVISIBLE);
            findViewById(R.id.hide).setVisibility(View.VISIBLE);
            findViewById(R.id.option1).setVisibility(View.VISIBLE);
            findViewById(R.id.option2).setVisibility(View.VISIBLE);
            findViewById(R.id.option3).setVisibility(View.VISIBLE);
        });

        findViewById(R.id.hide).setOnClickListener(view -> {
            findViewById(R.id.hide).setVisibility(View.INVISIBLE);
            findViewById(R.id.show).setVisibility(View.VISIBLE);
            findViewById(R.id.option1).setVisibility(View.INVISIBLE);
            findViewById(R.id.option2).setVisibility(View.INVISIBLE);
            findViewById(R.id.option3).setVisibility(View.INVISIBLE);
        });
    }
}