package com.example.happyzoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onCanardClick(View v) {
        Intent intent = new Intent(this, OneAnimal.class);
        intent.putExtra("title", "Canard");
        intent.putExtra("description", getString(R.string.canard));
        intent.putExtra("video", R.raw.canard);
        startActivity(intent);
    }
    public void onChatClick(View v) {
        Intent intent = new Intent(this, OneAnimal.class);
        intent.putExtra("title", "Chat");
        intent.putExtra("description", getString(R.string.chat));
        intent.putExtra("video", R.raw.chat);
        startActivity(intent);
    }
    public void onChevalClick(View v) {
        Intent intent = new Intent(this, OneAnimal.class);
        intent.putExtra("title", "Cheval");
        intent.putExtra("description", getString(R.string.cheval));
        intent.putExtra("video", R.raw.cheval);
        startActivity(intent);
    }
    public void onChienClick(View v) {
        Intent intent = new Intent(this, OneAnimal.class);
        intent.putExtra("title", "Chien");
        intent.putExtra("description", getString(R.string.chien));
        intent.putExtra("video", R.raw.chien);
        startActivity(intent);
    }
    public void onDaulphinClick(View v) {
        Intent intent = new Intent(this, OneAnimal.class);
        intent.putExtra("title", "Dauphin");
        intent.putExtra("description", getString(R.string.dauphin));
        intent.putExtra("video", R.raw.dauphine);
        startActivity(intent);
    }
    public void onElephantClick(View v) {
        Intent intent = new Intent(this, OneAnimal.class);
        intent.putExtra("title", "Elephant");
        intent.putExtra("description", getString(R.string.elephant));
        intent.putExtra("video", R.raw.elephant);
        startActivity(intent);
    }
    public void onGirafeClick(View v) {
        Intent intent = new Intent(this, OneAnimal.class);
        intent.putExtra("title", "Girafe");
        intent.putExtra("description", getString(R.string.girafe));
        intent.putExtra("video", R.raw.girafe);
        startActivity(intent);
    }
    public void onKangourouClick(View v) {
        Intent intent = new Intent(this, OneAnimal.class);
        intent.putExtra("title", "Kangourou");
        intent.putExtra("description", getString(R.string.kangourou));
        intent.putExtra("video", R.raw.kangourou);
        startActivity(intent);
    }
    public void onLionClick(View v) {
        Intent intent = new Intent(this, OneAnimal.class);
        intent.putExtra("title", "Lion");
        intent.putExtra("description", getString(R.string.lion));
        intent.putExtra("video", R.raw.lion);
        startActivity(intent);
    }
    public void onPandaClick(View v) {
        Intent intent = new Intent(this, OneAnimal.class);
        intent.putExtra("title", "Panda");
        intent.putExtra("description", getString(R.string.panda));
        intent.putExtra("video", R.raw.panda);
        startActivity(intent);
    }
    public void onSingeClick(View v) {
        Intent intent = new Intent(this, OneAnimal.class);
        intent.putExtra("title", "Singe");
        intent.putExtra("description", getString(R.string.singe));
        intent.putExtra("video", R.raw.singe);
        startActivity(intent);
    }
    public void onZebreClick(View v) {
        Intent intent = new Intent(this, OneAnimal.class);
        intent.putExtra("title", "Zebre");
        intent.putExtra("description", getString(R.string.zebre));
        intent.putExtra("video", R.raw.zebra);
        startActivity(intent);
    }
}