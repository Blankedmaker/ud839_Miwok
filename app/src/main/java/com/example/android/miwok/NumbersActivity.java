package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> words = new ArrayList<>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        //ListView implementation, good for memory!
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    /*LinearLayout implementation (bad for memory on very long lists)
        LinearLayout rootView = (LinearLayout) findViewById(R.id.list);
        for(int i = 0; i < words.size();i++){
            TextView wordsView = new TextView(this);
            wordsView.setText(words.get(i));
            rootView.addView(wordsView);
        }*/


    }
}
