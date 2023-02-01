package com.rani.intentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etbarang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        load();
    }

    public void load(){
        etbarang = findViewById(R.id.etbarang);
    }

    public void btnBarang(View view) {
        String barang = etbarang.getText().toString();
        Intent intent = new Intent(this, Barang.class);
        intent.putExtra("ISI",barang);
        startActivity(intent);
    }
}