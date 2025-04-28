package com.example.adminpanel;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Assignment extends AppCompatActivity {

    EditText editText;
    Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_assignment);

        editText = (EditText) findViewById(R.id.assignmentEditID);
        button = (Button)findViewById(R.id.assignmentsubmitID);


       button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 FirebaseDatabase database = FirebaseDatabase.getInstance();
                 DatabaseReference myRef = database.getReference("Assignment");
                 EditText editText = findViewById(R.id.assignmentEditID);
                 String message = editText.getText().toString();
                 myRef.setValue(message);
            }


        });


    }
    //public void buttonClicked(View view){

       // FirebaseDatabase database = FirebaseDatabase.getInstance();
       // DatabaseReference myRef = database.getReference("Assignment");

       // EditText editText = findViewById(R.id.assignmentEditID);
       // String message = editText.getText().toString();
       // myRef.setValue(message);
    //}
}