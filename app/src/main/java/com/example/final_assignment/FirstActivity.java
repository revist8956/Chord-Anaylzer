package com.example.final_assignment;

import static com.example.final_assignment.MapInfo.getChord_map;
import static com.example.final_assignment.MapInfo.getChord_number;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        getChord_number();
        getChord_map();

    }

    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent();
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }


    public void bt_to_quiz_onClick(View view) {
        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);

    }

    public void bt_to_analyze_onClick(View view) {
        Intent intent = new Intent(this,AnalyzeActivity.class);
        startActivity(intent);
    }

}
