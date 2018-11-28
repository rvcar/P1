package com.example.rvca.p1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    Random r = new Random();

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;

    List<Polycarbonate> pkt_list;

    FloatingActionButton fab;

    LinearLayoutManager llm = new LinearLayoutManager(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);

        recyclerView.setLayoutManager(llm);


        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                llm.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);


        fab = findViewById(R.id.floatingActionButtonAdd);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, OrderActivity.class));
            }
        });

        pkt_list = new ArrayList<>();


        for (int i = 0; i < 50; i++) {

            pkt_list.add(new Sotoviy((double) i, (double) i));

        }

        adapter = new PktListAdapter(pkt_list, this);
        recyclerView.setAdapter(adapter);

    }

}
