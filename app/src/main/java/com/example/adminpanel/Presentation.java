package com.example.adminpanel;

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

public class Presentation extends AppCompatActivity {

    EditText preEdit;
    Button preBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_presentation);

        preEdit = findViewById(R.id.presentationEditID);
        preBtn = findViewById(R.id.presentationsubmitID);

        preBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("Presentation");

                EditText editText = findViewById(R.id.presentationEditID);
                String message = editText.getText().toString();
                myRef.setValue(message);
            }
        });
    }
}