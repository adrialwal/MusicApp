package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the search category
        TextView search = (TextView) findViewById(R.id.search);


        // Set a click listener on that View
        search.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the search category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open {@link SearchActivity}
                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);


                // Start the new activity
                startActivity(searchIntent);
            }
        });

        // Find the View that shows the discover category
        TextView discover = (TextView) findViewById(R.id.discover);


        // Set a click listener on that View
        discover.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the discover category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open {@link DiscoverActivity}
                Intent discoverIntent = new Intent(MainActivity.this, DiscoverActivity.class);


                // Start the new activity
                startActivity(discoverIntent);
            }
        });

        // Find the View that shows the podcasts category
        TextView podcasts = (TextView) findViewById(R.id.podcasts);


        // Set a click listener on that View
        podcasts.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the podcasts category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open {@link PodcastsActivity}
                Intent podcastsIntent = new Intent(MainActivity.this, PodcastsActivity.class);


                // Start the new activity
                startActivity(podcastsIntent);
            }
        });

        // Find the View that shows the store category
        TextView store = (TextView) findViewById(R.id.store);


        // Set a click listener on that View
        store.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the store category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open {@link StoreActivity}
                Intent storeIntent = new Intent(MainActivity.this, StoreActivity.class);


                // Start the new activity
                startActivity(storeIntent);
            }
        });

        // Find the View that shows the now playing category
        TextView playing = (TextView) findViewById(R.id.playing);


        // Set a click listener on that View
        playing.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the now playing category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open {@link NowPlayingActivity}
                Intent playingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);


                // Start the new activity
                startActivity(playingIntent);
            }
        });

    }
}
