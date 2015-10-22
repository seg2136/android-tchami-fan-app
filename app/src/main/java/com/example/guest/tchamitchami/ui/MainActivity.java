package com.example.guest.tchamitchami.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.guest.tchamitchami.R;


public class MainActivity extends AppCompatActivity {

    private Button mAboutButton;
    private Button mShowsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAboutButton = (Button) findViewById(R.id.aboutButton);
        mShowsButton = (Button) findViewById(R.id.showsButton);

        mAboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });

        mShowsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ShowsActivity.class);
                startActivity(intent);
            }
        });
    }
}
