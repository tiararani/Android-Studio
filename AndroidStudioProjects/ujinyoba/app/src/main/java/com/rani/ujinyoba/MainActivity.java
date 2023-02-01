package com.rani.ujinyoba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.sql.SQLOutput;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tampil();
    }

    public void tampil() {
        System.out.println("Belajar android");
    }
}