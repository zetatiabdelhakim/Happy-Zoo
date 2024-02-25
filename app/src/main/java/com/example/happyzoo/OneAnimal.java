package com.example.happyzoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class OneAnimal extends AppCompatActivity {
    private TextView animal, description;
    private VideoView video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_animal);
        animal = findViewById(R.id.animal);
        description = findViewById(R.id.description);
        video = findViewById(R.id.video);
        //just for test
        description.setText(getString(R.string.chat));
        animal.setText("Chat");
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.chat;
        video.setVideoPath(videoPath);
        video.start();
        video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                video.start();
            }
        });
    }
    public void onBackClick(View view){
        startActivity(new Intent(this, MainActivity.class));
    }
}