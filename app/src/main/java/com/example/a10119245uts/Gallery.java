package com.example.a10119245uts;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

/*
Tanggal Pengerjaan 21 Mei 2022
NIM   : 10119245
Nama  : Apid Haryana
Kelas : IF -6
 */

public class Gallery extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    RecyclerView recyclerView;
    RecyclerView.Adapter programAdapter;
    RecyclerView.LayoutManager layoutManager;
    GalleryAdapter galleryAdapter;

    int[] programImages = {
            R.drawable.p1,R.drawable.p2,
            R.drawable.p3,R.drawable.p4,
            R.drawable.p5,R.drawable.p6
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        recyclerView = findViewById(R.id.recycler_gallery);
        /*recyclerView.setHasFixedSize(true);*/
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(
                new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        );
        galleryAdapter = new GalleryAdapter(this,programImages);

        recyclerView.setAdapter(galleryAdapter);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.gallery);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), Home.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.schedule:
                        startActivity(new Intent(getApplicationContext(), Daily.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.gallery:
                        return true;

                    case R.id.favorite:
                        startActivity(new Intent(getApplicationContext(), Favorite.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.profile:
                        startActivity(new Intent(getApplicationContext(), Profile.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
}
