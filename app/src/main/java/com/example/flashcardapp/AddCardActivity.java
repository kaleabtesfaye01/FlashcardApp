package com.example.flashcardapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class AddCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);

        findViewById(R.id.cancel).setOnClickListener(view -> finish());

        findViewById(R.id.save).setOnClickListener(view -> {
            Intent data = new Intent();
            data.putExtra("question", ((EditText) findViewById(R.id.editQuestion)).getText().toString());
            data.putExtra("answer", ((EditText) findViewById(R.id.editAnswer)).getText().toString());
            setResult(RESULT_OK, data);
            finish();
        });
    }
}