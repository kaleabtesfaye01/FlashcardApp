package com.example.flashcardapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

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

        findViewById(R.id.add).setOnClickListener(view -> {
            Intent intent = new Intent(this, AddCardActivity.class);
            MainActivity.this.startActivityForResult(intent, 1);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1 && resultCode == RESULT_OK) {
            String question = data.getExtras().getString("question");
            String answer = data.getExtras().getString("answer");
            ((TextView) findViewById(R.id.flashcard_question)).setText(question);
            ((TextView) findViewById(R.id.flashcard_answer)).setText(answer);
        }
    }
}