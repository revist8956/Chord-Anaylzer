package com.example.final_assignment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_screen);


        Intent intent = new Intent(this.getIntent());
        int correct = intent.getIntExtra("correct", 0);
        int wrong = intent.getIntExtra("wrong", 0);
        TextView tv_result_correct = findViewById(R.id.tv_result_correct);
        TextView tv_result_wrong = findViewById(R.id.tv_result_wrong);
        tv_result_correct.setText("맞힌 개수: " + correct + "개");
        tv_result_wrong.setText("틀린 개수: " + wrong + "개");

    }

    public void bt_backhome_onClick(View view) {
        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);
        finish();
    }

    public void onBackPressed() {
        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);
        finish();
    }
}
