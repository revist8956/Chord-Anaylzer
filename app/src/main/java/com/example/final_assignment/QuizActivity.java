package com.example.final_assignment;

import static com.example.final_assignment.MapInfo.checker;
import static com.example.final_assignment.MapInfo.chord_map;
import static com.example.final_assignment.MapInfo.chord_number;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import java.util.ArrayList;
import java.util.HashMap;


public class QuizActivity extends AppCompatActivity {
// mediaPlayer
    MediaPlayer mp = new MediaPlayer();
    HashMap<String, MediaPlayer> mediaPlayer_hm = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);


// actionbar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("QUIZ");
        actionBar.setDisplayHomeAsUpEnabled(true);

        quiz_change();


        mediaPlayer_hm.put("C", MediaPlayer.create(this, R.raw.c4));
        mediaPlayer_hm.put("C#", MediaPlayer.create(this, R.raw.db4));
        mediaPlayer_hm.put("D", MediaPlayer.create(this, R.raw.d4));
        mediaPlayer_hm.put("D#", MediaPlayer.create(this, R.raw.eb4));
        mediaPlayer_hm.put("E", MediaPlayer.create(this, R.raw.e4));
        mediaPlayer_hm.put("F", MediaPlayer.create(this, R.raw.f4));
        mediaPlayer_hm.put("F#", MediaPlayer.create(this, R.raw.gb4));
        mediaPlayer_hm.put("G", MediaPlayer.create(this, R.raw.g4));
        mediaPlayer_hm.put("G#", MediaPlayer.create(this, R.raw.ab4));
        mediaPlayer_hm.put("A", MediaPlayer.create(this, R.raw.a4));
        mediaPlayer_hm.put("A#", MediaPlayer.create(this, R.raw.bb4));
        mediaPlayer_hm.put("B", MediaPlayer.create(this, R.raw.b4));


    }

// quiz 문제 바꾸기
    int rand = 0;
    int randomquizValue = 0;
    int i = 0;

    ArrayList remove_double = new ArrayList();
    public void quiz_change() {
        rand = (int) (Math.random()*chord_map.size()+1);
        while (remove_double.contains(rand)){
            rand = (int) (Math.random()*chord_map.size()+1);
        }
        if (!remove_double.contains(rand)) {
            remove_double.add(rand);
            randomquizValue = (int) remove_double.get(i);
            i+=1;
        }
        TextView tv_question = findViewById(R.id.tv_show_chord);
        Button bt_C = findViewById(R.id.bt_C);
        Button bt_Db = findViewById(R.id.bt_Csharp);
        Button bt_D = findViewById(R.id.bt_D);
        Button bt_Eb = findViewById(R.id.bt_Dsharp);
        Button bt_E = findViewById(R.id.bt_E);
        Button bt_F = findViewById(R.id.bt_F);
        Button bt_Gb = findViewById(R.id.bt_Fsharp);
        Button bt_G = findViewById(R.id.bt_G);
        Button bt_Ab = findViewById(R.id.bt_Gsharp);
        Button bt_A = findViewById(R.id.bt_A);
        Button bt_Bb = findViewById(R.id.bt_Asharp);
        Button bt_B = findViewById(R.id.bt_B);


        tv_question.setText(chord_number.get(randomquizValue));
        checking_chord.clear();
        bt_C.setBackgroundColor(getResources().getColor(R.color.purple_500));
        bt_Db.setBackgroundColor(getResources().getColor(R.color.purple_500));
        bt_D.setBackgroundColor(getResources().getColor(R.color.purple_500));
        bt_Eb.setBackgroundColor(getResources().getColor(R.color.purple_500));
        bt_E.setBackgroundColor(getResources().getColor(R.color.purple_500));
        bt_F.setBackgroundColor(getResources().getColor(R.color.purple_500));
        bt_Gb.setBackgroundColor(getResources().getColor(R.color.purple_500));
        bt_G.setBackgroundColor(getResources().getColor(R.color.purple_500));
        bt_Ab.setBackgroundColor(getResources().getColor(R.color.purple_500));
        bt_A.setBackgroundColor(getResources().getColor(R.color.purple_500));
        bt_Bb.setBackgroundColor(getResources().getColor(R.color.purple_500));
        bt_B.setBackgroundColor(getResources().getColor(R.color.purple_500));

    }


// 버튼 onClick

    ArrayList<String> checking_chord = new ArrayList<>();


    public void bt_C_onClick (View view){
        Button bt_C = findViewById(R.id.bt_C);
        bt_C.setBackgroundColor(getResources().getColor(R.color.purple_200));
        mediaPlayer_hm.get("C").start();
        if (!checking_chord.contains("C")) {
            checking_chord.add("C");
            }
        }
    public void bt_Db_onClick (View view){
        Button bt_Db = findViewById(R.id.bt_Csharp);
        bt_Db.setBackgroundColor(getResources().getColor(R.color.purple_200));
        mediaPlayer_hm.get("C#").start();
        if (!checking_chord.contains("C#")) {
            checking_chord.add("C#");
        }
    }
    public void bt_D_onClick (View view){
        Button bt_D = findViewById(R.id.bt_D);
        bt_D.setBackgroundColor(getResources().getColor(R.color.purple_200));
        mediaPlayer_hm.get("D").start();
        if (!checking_chord.contains("D")) {
            checking_chord.add("D");
        }
    }
    public void bt_Eb_onClick (View view){
        Button bt_Eb = findViewById(R.id.bt_Dsharp);
        bt_Eb.setBackgroundColor(getResources().getColor(R.color.purple_200));
        mediaPlayer_hm.get("D#").start();
        if (!checking_chord.contains("D#")) {
            checking_chord.add("D#");
        }
    }
    public void bt_E_onClick (View view){
        Button bt_E = findViewById(R.id.bt_E);
        bt_E.setBackgroundColor(getResources().getColor(R.color.purple_200));
        mediaPlayer_hm.get("E").start();
        if (!checking_chord.contains("E")) {
            checking_chord.add("E");
        }
    }
    public void bt_F_onClick (View view){
        Button bt_F = findViewById(R.id.bt_F);
        bt_F.setBackgroundColor(getResources().getColor(R.color.purple_200));
        mediaPlayer_hm.get("F").start();
        if (!checking_chord.contains("F")) {
            checking_chord.add("F");
        }
    }
    public void bt_Gb_onClick (View view){
        Button bt_Gb = findViewById(R.id.bt_Fsharp);
        bt_Gb.setBackgroundColor(getResources().getColor(R.color.purple_200));
        mediaPlayer_hm.get("F#").start();
        if (!checking_chord.contains("F#")) {
            checking_chord.add("F#");
        }
    }
    public void bt_G_onClick (View view){
        Button bt_G = findViewById(R.id.bt_G);
        bt_G.setBackgroundColor(getResources().getColor(R.color.purple_200));
        mediaPlayer_hm.get("G").start();
        if (!checking_chord.contains("G")) {
            checking_chord.add("G");
        }
    }
    public void bt_Ab_onClick (View view){
        Button bt_Ab = findViewById(R.id.bt_Gsharp);
        bt_Ab.setBackgroundColor(getResources().getColor(R.color.purple_200));
        mediaPlayer_hm.get("G#").start();
        if (!checking_chord.contains("G#")) {
            checking_chord.add("G#");
        }
    }
    public void bt_A_onClick (View view){
        Button bt_A = findViewById(R.id.bt_A);
        bt_A.setBackgroundColor(getResources().getColor(R.color.purple_200));
        mediaPlayer_hm.get("A").start();
        if (!checking_chord.contains("A")) {
            checking_chord.add("A");
        }
    }
    public void bt_Bb_onClick (View view){
        Button bt_Bb = findViewById(R.id.bt_Asharp);
        bt_Bb.setBackgroundColor(getResources().getColor(R.color.purple_200));
        mediaPlayer_hm.get("A#").start();
        if (!checking_chord.contains("A#")) {
            checking_chord.add("A#");
        }
    }
    public void bt_B_onClick (View view){
        Button bt_B = findViewById(R.id.bt_B);
        bt_B.setBackgroundColor(getResources().getColor(R.color.purple_200));
        mediaPlayer_hm.get("B").start();
        if (!checking_chord.contains("B")) {
            checking_chord.add("B");
        }
    }


    int correct = 0;
    int wrong = 0;

    public void bt_submit_onClick (View view) {
        if (checking_chord.size()==0){
            Toast.makeText(getApplicationContext(), "코드를 입력해주세요.", Toast.LENGTH_SHORT).show();
        }
        else if (checker(chord_map.get(chord_number.get(randomquizValue)), checking_chord)) {
            Toast.makeText(getApplicationContext(), "정답입니다!", Toast.LENGTH_SHORT).show();
            correct+=1;
            quiz_change();
        }

        else {
            Toast.makeText(getApplicationContext(), "오답입니다!", Toast.LENGTH_SHORT).show();
            wrong+=1;
            quiz_change();
        }
        result_screen();
    }

    public void bt_reset_onClick (View view) {
        Button bt_C = findViewById(R.id.bt_C);
        Button bt_Db = findViewById(R.id.bt_Csharp);
        Button bt_D = findViewById(R.id.bt_D);
        Button bt_Eb = findViewById(R.id.bt_Dsharp);
        Button bt_E = findViewById(R.id.bt_E);
        Button bt_F = findViewById(R.id.bt_F);
        Button bt_Gb = findViewById(R.id.bt_Fsharp);
        Button bt_G = findViewById(R.id.bt_G);
        Button bt_Ab = findViewById(R.id.bt_Gsharp);
        Button bt_A = findViewById(R.id.bt_A);
        Button bt_Bb = findViewById(R.id.bt_Asharp);
        Button bt_B = findViewById(R.id.bt_B);
        checking_chord.clear();
        bt_C.setBackgroundColor(getResources().getColor(R.color.purple_500));
        bt_Db.setBackgroundColor(getResources().getColor(R.color.purple_500));
        bt_D.setBackgroundColor(getResources().getColor(R.color.purple_500));
        bt_Eb.setBackgroundColor(getResources().getColor(R.color.purple_500));
        bt_E.setBackgroundColor(getResources().getColor(R.color.purple_500));
        bt_F.setBackgroundColor(getResources().getColor(R.color.purple_500));
        bt_Gb.setBackgroundColor(getResources().getColor(R.color.purple_500));
        bt_G.setBackgroundColor(getResources().getColor(R.color.purple_500));
        bt_Ab.setBackgroundColor(getResources().getColor(R.color.purple_500));
        bt_A.setBackgroundColor(getResources().getColor(R.color.purple_500));
        bt_Bb.setBackgroundColor(getResources().getColor(R.color.purple_500));
        bt_B.setBackgroundColor(getResources().getColor(R.color.purple_500));
    }

    public void result_screen() {
        if (correct + wrong == 7) {
            remove_double.clear();
            i = 0;

            Intent intent = new Intent(this, ResultScreen.class);
            intent.putExtra("correct", correct);
            intent.putExtra("wrong", wrong);
            startActivity(intent);
            finish();
        }
    }

}

