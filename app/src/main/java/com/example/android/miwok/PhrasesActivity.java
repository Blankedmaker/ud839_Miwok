package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<Words> words = new ArrayList<>();
        words.add(new Words("Where are you going?","minto wuksus"));
        words.add(new Words("What is your name?","tinnә oyaase'nә"));
        words.add(new Words("My name is...","oyaaset..."));
        words.add(new Words("How are you feeling?","michәksәs?"));
        words.add(new Words("I’m feeling good.","kuchi achit"));
        words.add(new Words("Are you coming?","әәnәs'aa?"));
        words.add(new Words("Yes, I’m coming.","hәә’ әәnәm"));
        words.add(new Words("I’m coming.","әәnәm"));
        words.add(new Words("Let’s go.","yoowutis"));
        words.add(new Words("Come here.","әnni'nem"));

        //ListView implementation, good for memory!
        WordsAdapter adapter = new WordsAdapter(this, words);

        // ArrayAdapter<String> itemsAdapter = new ArrayAdapter<>(this,android.R.list_item,words);
        ListView listView = (ListView) findViewById(R.id.phrases_list);
        listView.setAdapter(adapter);

    }
}
