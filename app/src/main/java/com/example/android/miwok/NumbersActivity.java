package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;


import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Words> words = new ArrayList<>();
        words.add(new Words("one","lutti"));
        words.add(new Words("two","otiiko"));
        words.add(new Words("three","tolookosu"));
        words.add(new Words("four","oyyisa"));
        words.add(new Words("five","massokka"));
        words.add(new Words("six","temmokka"));
        words.add(new Words("seven","kenekaku"));
        words.add(new Words("eight","kawinta"));
        words.add(new Words("nine","wo’e"));
        words.add(new Words("ten","na’aacha"));

        //ListView implementation, good for memory!
        WordsAdapter adapter = new WordsAdapter(this, words);

       // ArrayAdapter<String> itemsAdapter = new ArrayAdapter<>(this,android.R.list_item,words);
        ListView listView = (ListView) findViewById(R.id.words_list_id);
        listView.setAdapter(adapter);

    /*LinearLayout implementation (bad for memory on very long lists)
        LinearLayout rootView = (LinearLayout) findViewById(R.id.list);
        for(int i = 0; i < words.size();i++){
            TextView wordsView = new TextView(this);
            wordsView.setText(words.get(i));
            rootView.addView(wordsView);
        }*/

    }
}
