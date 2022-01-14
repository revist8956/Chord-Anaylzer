package com.example.final_assignment;

import static com.example.final_assignment.AnalyzeActivity.checking_chord;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;

public class MapInfo extends AppCompatActivity {

    static String[] Cchord = {"C", "E", "G"};
    static String[] Csharpchord = {"C#", "F", "G#"};
    static String[] Dchord = {"D", "F#", "A"};
    static String[] Dsharpchord = {"D#", "G", "A#"};
    static String[] Echord = {"E", "G#", "B"};
    static String[] Fchord = {"F", "A", "C"};
    static String[] Fsharpchord = {"F#", "A#", "C#"};
    static String[] Gchord = {"G", "B", "D"};
    static String[] Gsharpchord = {"G#", "C", "D#"};
    static String[] Achord = {"A", "C#", "E"};
    static String[] Asharpchord = {"A#", "D", "F"};
    static String[] Bchord = {"B", "D#", "F#"};
    static String[] CM7chord = {"C", "E", "G", "B"};

    static HashMap<Integer, String> chord_number = new HashMap<Integer, String>();
    static HashMap<String, String[]> chord_map = new HashMap<String, String[]>();
    static HashMap<String[], String> reverse_chord_map = new HashMap<String[], String>();
    static String temp = new String();


    public static void getChord_number() {
        chord_number.put(1, "C");
        chord_number.put(2, "C#");
        chord_number.put(3, "D");
        chord_number.put(4, "D#");
        chord_number.put(5, "E");
        chord_number.put(6, "F");
        chord_number.put(7, "F#");
        chord_number.put(8, "G");
        chord_number.put(9, "G#");
        chord_number.put(10, "A");
        chord_number.put(11, "A#");
        chord_number.put(12, "B");
        chord_number.put(13, "CM7");
    }
    public static void getChord_map() {
        chord_map.put(chord_number.get(1), Cchord);
        chord_map.put(chord_number.get(2), Csharpchord);
        chord_map.put(chord_number.get(3), Dchord);
        chord_map.put(chord_number.get(4), Dsharpchord);
        chord_map.put(chord_number.get(5), Echord);
        chord_map.put(chord_number.get(6), Fchord);
        chord_map.put(chord_number.get(7), Fsharpchord);
        chord_map.put(chord_number.get(8), Gchord);
        chord_map.put(chord_number.get(9), Gsharpchord);
        chord_map.put(chord_number.get(10), Achord);
        chord_map.put(chord_number.get(11), Asharpchord);
        chord_map.put(chord_number.get(12), Bchord);
        chord_map.put(chord_number.get(13), CM7chord);

    }
    public static String getReverse_chord_map() {
        reverse_chord_map.put(Cchord, chord_number.get(1));
        reverse_chord_map.put(Csharpchord, chord_number.get(2));
        reverse_chord_map.put(Dchord, chord_number.get(3));
        reverse_chord_map.put(Dsharpchord, chord_number.get(4));
        reverse_chord_map.put(Echord, chord_number.get(5));
        reverse_chord_map.put(Fchord, chord_number.get(6));
        reverse_chord_map.put(Fsharpchord, chord_number.get(7));
        reverse_chord_map.put(Gchord, chord_number.get(8));
        reverse_chord_map.put(Gsharpchord, chord_number.get(9));
        reverse_chord_map.put(Achord, chord_number.get(10));
        reverse_chord_map.put(Asharpchord, chord_number.get(11));
        reverse_chord_map.put(Bchord, chord_number.get(12));
        reverse_chord_map.put(CM7chord, chord_number.get(13));

        boolean oxo = false;
        for (String[] chord:
                reverse_chord_map.keySet()) {
            if (checker(chord, checking_chord)) {
                oxo = true;
                temp = reverse_chord_map.get(chord);
            }
            else if (checking_chord.size()<3)
            {
                temp = "";
            }
            else if (oxo == false)
            {
                temp = "?";
            }
        }
    return temp;
    }



    public static boolean checker (String[] x, ArrayList y) {
        int config = 0;
        boolean change = false;


        String[] z = (String[]) y.toArray(new String[y.size()]);
        if (z.length != x.length) {
            return false;
        }

        for(int i=0; i<x.length; i+=1) {
            for(int k=0; k<x.length; k+=1) {
                if (x[i]==z[k]) {
                    config+=1;

                }
            }
        }
        if (z.length != x.length) {
            change = false;
        }
        else if (config == x.length) {
            change = true;
        }
        else {
            change = false;
        }

        return change;
    }

}
