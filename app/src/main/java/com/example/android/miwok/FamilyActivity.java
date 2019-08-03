package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<Words> words = new ArrayList<>();
        words.add(new Words("father","әpә"));
        words.add(new Words("mother","әṭa"));
        words.add(new Words("son","angsi"));
        words.add(new Words("daughter","tune"));
        words.add(new Words("older brother","taachi"));
        words.add(new Words("younger brother","chalitti "));
        words.add(new Words("older sister","teṭe"));
        words.add(new Words("younger sister","kolliti"));
        words.add(new Words("grandmother","ama"));
        words.add(new Words("grandfather","paapa"));

        //ListView implementation, good for memory!
        WordsAdapter adapter = new WordsAdapter(this, words);

        // ArrayAdapter<String> itemsAdapter = new ArrayAdapter<>(this,android.R.list_item,words);
        ListView listView = (ListView) findViewById(R.id.family_list);
        listView.setAdapter(adapter);

    }
}
