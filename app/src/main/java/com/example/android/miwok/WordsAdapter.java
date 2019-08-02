package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class WordsAdapter extends ArrayAdapter<Words> {
    /**
     * Constructor
     *
     * @param context  The current context.
     * @param resource The resource ID for a layout file containing a TextView to use when
     *                 instantiating views.
     * @param objects  The objects to represent in the ListView.
     */
    public WordsAdapter(Context context, List<Words> objects) {
        super(context, 0, objects);
    }

    /**
     * {@inheritDoc}
     *
     * @param position
     * @param convertView
     * @param parent
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       if(convertView == null)
           convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

       Words currentWord = getItem(position);

        TextView englishTextView = (TextView) convertView.findViewById(R.id.englishText);
        englishTextView.setText(currentWord.getEnglishWord());

        TextView miwokTextView = (TextView) convertView.findViewById(R.id.miwokText);
        miwokTextView.setText(currentWord.getMiwokWord());

       // TextView imageView = (TextView) convertView.findViewById(R.id.);
        //imageView.setText(currentWord.());



        return convertView;
    }
}
