package com.example.android.learnmalyalam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
                words.add(new Word("Father", "അച്ഛന് ", R.drawable.family_father));
                words.add(new Word("Mother", "അമ്മ ", R.drawable.family_mother));
                words.add(new Word("Son", "മകൻ ", R.drawable.family_son));
                words.add(new Word("Daughter", "പുത്രി ", R.drawable.family_daughter));
                words.add(new Word("Older Brother", "മൂത്ത സഹോദരൻ", R.drawable.family_older_brother));
                words.add(new Word("Younger Brother", "ഇളയ സഹോദരൻ", R.drawable.family_younger_brother));
                words.add(new Word("Older Sister", "മൂത്ത സഹോദരി", R.drawable.family_older_sister));
                words.add(new Word("Younger Sister", "ഇളയ സഹോദരി", R.drawable.family_younger_sister));
                words.add(new Word("Grandmother ", "മുത്തശ്ശി", R.drawable.family_grandmother));
                words.add(new Word("Grandfather", "മുത്തച്ഛന് ", R.drawable.family_grandfather));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}