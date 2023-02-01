package com.rani.recyclerviewcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    SiswaAdapter adapter;
    List<Siswa> siswaList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        load();
        isiData();
    }

    public void load() {
        recyclerView = findViewById(R.id.rcvSiswa);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void isiData() {
        siswaList = new ArrayList<Siswa>();
        siswaList.add(new Siswa("tiara", "Sidoarjo"));
        siswaList.add(new Siswa("rani", "Sidoarjo"));
        siswaList.add(new Siswa("lukkensari", "Sidoarjo"));
        siswaList.add(new Siswa("emilia", "Sidoarjo"));
        siswaList.add(new Siswa("yogi", "Sidoarjo"));
        siswaList.add(new Siswa("hardini", "Sidoarjo"));
        siswaList.add(new Siswa("febrijati", "Sidoarjo"));
        siswaList.add(new Siswa("denny", "Sidoarjo"));
        siswaList.add(new Siswa("yulianto", "Sidoarjo"));
        siswaList.add(new Siswa("kalvin", "Sidoarjo"));
        siswaList.add(new Siswa("fance", "Sidoarjo"));
        siswaList.add(new Siswa("satria", "Sidoarjo"));
        siswaList.add(new Siswa("putra", "Sidoarjo"));
        siswaList.add(new Siswa("rizqy", "Sidoarjo"));
        siswaList.add(new Siswa("panca", "Sidoarjo"));
        siswaList.add(new Siswa("dentol", "Sidoarjo"));

        adapter = new SiswaAdapter(this,siswaList);
        recyclerView.setAdapter(adapter);
    }


    public void btnTambah(View view) {
        siswaList.add(new Siswa("TIARA RANI", "SIDOARJO"));
        adapter.notifyDataSetChanged();
    }
}