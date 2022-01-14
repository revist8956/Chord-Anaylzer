package com.example.final_assignment;

import static com.example.final_assignment.MapInfo.getReverse_chord_map;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class AnalyzeActivity extends AppCompatActivity {
// mediaPlayer
    MediaPlayer mp = new MediaPlayer();
    HashMap<String, MediaPlayer> mediaPlayer_hm = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analyze);



        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("ANALYZE");
        actionBar.setDisplayHomeAsUpEnabled(true);

        checking_chord.clear();
        show_result();

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

    static ArrayList<String> checking_chord = new ArrayList<>();

    public void show_result() {
        TextView tv_show_chord = findViewById(R.id.tv_show_chord);
        tv_show_chord.setText(getReverse_chord_map());
    }

    public void bt_C_onClick(View view) {
        Button bt_C = findViewById(R.id.bt_C);
        bt_C.setBackgroundColor(getResources().getColor(R.color.purple_200));
        mediaPlayer_hm.get("C").start();
        if (!checking_chord.contains("C")) {
            checking_chord.add("C");
        }
        show_result();
    }
    public void bt_Db_onClick(View view) {
        Button bt_Db = findViewById(R.id.bt_Csharp);
        bt_Db.setBackgroundColor(getResources().getColor(R.color.purple_200));
        mediaPlayer_hm.get("C#").start();
        if (!checking_chord.contains("C#")) {
            checking_chord.add("C#");
        }
        show_result();
    }
    public void bt_D_onClick(View view) {
        Button bt_D = findViewById(R.id.bt_D);
        bt_D.setBackgroundColor(getResources().getColor(R.color.purple_200));
        mediaPlayer_hm.get("D").start();
        if (!checking_chord.contains("D")) {
            checking_chord.add("D");
        }
        show_result();
    }
    public void bt_Eb_onClick(View view) {
        Button bt_Eb = findViewById(R.id.bt_Dsharp);
        bt_Eb.setBackgroundColor(getResources().getColor(R.color.purple_200));
        mediaPlayer_hm.get("D#").start();
        if (!checking_chord.contains("D#")) {
            checking_chord.add("D#");
        }
        show_result();
    }
    public void bt_E_onClick(View view) {
        Button bt_E = findViewById(R.id.bt_E);
        bt_E.setBackgroundColor(getResources().getColor(R.color.purple_200));
        mediaPlayer_hm.get("E").start();
        if (!checking_chord.contains("E")) {
            checking_chord.add("E");
        }
        show_result();
    }
    public void bt_F_onClick(View view) {
        Button bt_F = findViewById(R.id.bt_F);
        bt_F.setBackgroundColor(getResources().getColor(R.color.purple_200));
        mediaPlayer_hm.get("F").start();
        if (!checking_chord.contains("F")) {
            checking_chord.add("F");
        }
        show_result();
    }
    public void bt_Gb_onClick(View view) {
        Button bt_Gb = findViewById(R.id.bt_Fsharp);
        bt_Gb.setBackgroundColor(getResources().getColor(R.color.purple_200));
        mediaPlayer_hm.get("F#").start();
        if (!checking_chord.contains("F#")) {
            checking_chord.add("F#");
        }
        show_result();
    }
    public void bt_G_onClick(View view) {
        Button bt_G = findViewById(R.id.bt_G);
        bt_G.setBackgroundColor(getResources().getColor(R.color.purple_200));
        mediaPlayer_hm.get("G").start();
        if (!checking_chord.contains("G")) {
            checking_chord.add("G");
        }
        show_result();
    }
    public void bt_Ab_onClick(View view) {
        Button bt_Ab = findViewById(R.id.bt_Gsharp);
        bt_Ab.setBackgroundColor(getResources().getColor(R.color.purple_200));
        mediaPlayer_hm.get("G#").start();
        if (!checking_chord.contains("G#")) {
            checking_chord.add("G#");
        }
        show_result();
    }
    public void bt_A_onClick(View view) {
        Button bt_A = findViewById(R.id.bt_A);
        bt_A.setBackgroundColor(getResources().getColor(R.color.purple_200));
        mediaPlayer_hm.get("A").start();
        if (!checking_chord.contains("A")) {
            checking_chord.add("A");
        }
        show_result();
    }
    public void bt_Bb_onClick(View view) {
        Button bt_Bb = findViewById(R.id.bt_Asharp);
        bt_Bb.setBackgroundColor(getResources().getColor(R.color.purple_200));
        mediaPlayer_hm.get("A#").start();
        if (!checking_chord.contains("A#")) {
            checking_chord.add("A#");
        }
        show_result();
    }
    public void bt_B_onClick(View view) {
        Button bt_B = findViewById(R.id.bt_B);
        bt_B.setBackgroundColor(getResources().getColor(R.color.purple_200));
        mediaPlayer_hm.get("B").start();
        if (!checking_chord.contains("B")) {
            checking_chord.add("B");
        }
        show_result();
    }



    public void bt_reset_onClick(View view) {
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
        show_result();
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

    public void onBackPressed() {
        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);
        finish();
    }

}
