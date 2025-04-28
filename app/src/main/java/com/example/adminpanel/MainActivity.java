package com.example.adminpanel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextView dateView;
    public CardView card1, card2, card3, card4,card6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        dateView = findViewById(R.id.date_timeID);

        card1 = findViewById(R.id.assignmentCardID);
        card2 = findViewById(R.id.presentationCardID);
        card3 = findViewById(R.id.LabTaskCardID);
        card4 = findViewById(R.id.quizCardID);
        card6 = findViewById(R.id.noticeBoardCardID);

        Date currentTime = Calendar.getInstance().getTime();
        String formattedDate = DateFormat.getDateInstance(DateFormat.FULL).format(currentTime);
        dateView.setText(formattedDate);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Assignment.class);
                startActivity(intent);
                finish();
            }
        });
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Presentation.class);
                startActivity(intent);
                finish();
            }
        });
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), lab_task.class);
                startActivity(intent);
                finish();
            }
        });
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Quiz.class);
                startActivity(intent);
                finish();
            }
        });

        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), notice_board.class);
                startActivity(intent);
                finish();
            }
        });

    }
}