package com.example.adminpanel;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Quiz extends AppCompatActivity {

    EditText quizEdit;
    Button quizBtn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_quiz);
        getSupportActionBar().setTitle("Quiz");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        quizEdit = findViewById(R.id.quizEditID);
        quizBtn = findViewById(R.id.quizsubmitID);

        quizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("Quiz");

                EditText editText = findViewById(R.id.quizEditID);
                String message = editText.getText().toString();
                myRef.setValue(message);
            }
        });


    }
}