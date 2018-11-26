package com.example.rvca.p1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    Random r = new Random();

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;

    List<Polycarbonate> pkt_list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        pkt_list = new ArrayList<>();


        for (int i = 0; i < 50; i++) {

            pkt_list.add(new Sotoviy((float) i, (float) i, (float) i));

        }

        adapter = new PktListAdapter(pkt_list);
        recyclerView.setAdapter(adapter);

    }


}
