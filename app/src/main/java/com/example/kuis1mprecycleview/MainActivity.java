package com.example.kuis1mprecycleview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private KeluargaAdapter adapter;
    private ArrayList<Keluarga> mahasiswaArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerview_1);

        adapter = new KeluargaAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Keluarga("Muhammad Taufik", "Ayah","12 April 1968" , R.drawable.ayah));
        mahasiswaArrayList.add(new Keluarga("Hafsah", "Ibu", "12 Agustus 1966" , R.drawable.mama));
        mahasiswaArrayList.add(new Keluarga("Nurul Halizah", "Anak Pertama", "05 Oktober 1999" , R.drawable.lisa));
        mahasiswaArrayList.add(new Keluarga("Muhammad Fikri", "Anak Kedua", "28 April 2004" , R.drawable.afa));
    }
}


