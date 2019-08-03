package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Words> words = new ArrayList<>();
        words.add(new Words("red","weṭeṭṭi"));
        words.add(new Words("green","chokokki"));
        words.add(new Words("brown","ṭakaakki"));
        words.add(new Words("gray","ṭopoppi"));
        words.add(new Words("black","kululli"));
        words.add(new Words("white","kelelli"));
        words.add(new Words("dusty yellow","ṭopiisә"));
        words.add(new Words("mustard yellow","chiwiiṭә"));

        //ListView implementation, good for memory!
        WordsAdapter adapter = new WordsAdapter(this, words);

        // ArrayAdapter<String> itemsAdapter = new ArrayAdapter<>(this,android.R.list_item,words);
        ListView listView = (ListView) findViewById(R.id.words_list_id);
        listView.setAdapter(adapter);

    }
}
