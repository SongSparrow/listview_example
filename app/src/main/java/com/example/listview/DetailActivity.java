package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        String studentId = intent.getStringExtra("studentId");
        ImageView imgDetail = findViewById(R.id.detail_img);
        imgDetail.setImageResource(R.drawable.ic_launcher_background);
        TextView textDetail = findViewById(R.id.detail_text);
        textDetail.setText(studentId);
    }
}
