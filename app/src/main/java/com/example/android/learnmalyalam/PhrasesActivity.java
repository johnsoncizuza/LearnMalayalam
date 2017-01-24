package com.example.android.learnmalyalam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("When we stand on that side, this side seems greener", "അക്കരെ നില്\u200Dക്കുമ്പോള്\u200D ഇക്കരെ പച്ച്ച"));
        words.add(new Word("An ignorant child learns when it itches", "അറിയാത്ത പിള്ളക്ക് ചൊറിയുമ്പോള്\u200D അറിയും്ച"));
        words.add(new Word("If somebody's mother goes mad, it is a good scene to watch", "ആരാന്\u200Dറെ അമ്മക്ക് ഭ്രാന്ത്\u200C പിടിച്ചാല്\u200D കാണാന്\u200D നല്ല ചേല്"));
        words.add(new Word("Even if you take a dog to the middle of the ocean, a dog will only lick not drink it", "നടുക്കടലില്\u200D ചെന്നാലും നായ നക്കിയേ കുടിക്കൂ"));
        words.add(new Word("The enemy who is close to you is better than a relative who is distant", "അകലെയുള്ള ബന്ധുവിനേക്കാള്\u200D അടുത്തുള്ള ശത്രു നല്ലത്"));
        words.add(new Word("A full pot never overflows", "നിറകുടം തുളുബുകയില്ല"));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}