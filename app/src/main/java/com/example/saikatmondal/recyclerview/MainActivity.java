package com.example.saikatmondal.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLinearLayoutManager;
    private RecyclerView.Adapter mAdapter;

    private String[]  Dataset = new String[]{"Saikat", "Shaibal","Sital","Kajal","Biju","Raja","Kelo",
                                                "Arpan","Raju","Arnab","Akash da","Somnath da","Biplab da",
                                                "Gobindo da","Tanmoy","Mrinmay","Deepak","Prasanta","Sourav",
                                                "sajal","himardi","kaka","val","sayan","gaurav","raja da",
                                                "facebook","whatsapp","Youtube","LinkedIn","Gmail"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);

        mLinearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);

        mAdapter = new MyAdapter(Dataset);
        mRecyclerView.setAdapter(mAdapter);

    }
}

