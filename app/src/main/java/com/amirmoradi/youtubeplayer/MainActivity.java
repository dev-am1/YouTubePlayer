package com.amirmoradi.youtubeplayer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.text.PrecomputedText;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.youtube.player.YouTubePlayerView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSingle = findViewById(R.id.btnPlaySingle);
        Button btnStandalone = findViewById(R.id.btnStandAlone);

        btnSingle.setOnClickListener(this);
        btnStandalone.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()) {
            case R.id.btnPlaySingle: {
                intent = new Intent(this, YoutubeActivity.class);
                break;
            }
            case R.id.btnStandAlone: {
                intent = new Intent(this, StandaloneActivity.class);
                break;
            }
            default:

        }
        if (intent != null) {
            startActivity(intent);
        }
    }
}
