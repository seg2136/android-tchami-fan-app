package com.example.guest.tchamitchami;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.guest.tchamitchami.R.*;


public class ShowsActivity extends AppCompatActivity {

    private Button mMainButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shows);

        mMainButton = (Button) findViewById(R.id.mainButton);

        mMainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShowsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
