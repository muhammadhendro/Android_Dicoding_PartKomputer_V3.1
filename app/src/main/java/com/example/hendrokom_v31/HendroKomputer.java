package com.example.hendrokom_v31;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class HendroKomputer extends AppCompatActivity {

    private RecyclerView rvParts;
    private ArrayList<Part> list = new ArrayList<>();
    private String title = "Mode List";
    private ArrayList<Part> listSortir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hendro_komputer);

        rvParts = findViewById(R.id.rv_parts);
        rvParts.setHasFixedSize(true);

        list = new ArrayList<>();

        list.addAll(PartsData.getListData());
        listSortir = new ArrayList<>();
        showRecyclerCardView();

    }
//    private void showRecyclerList(){
//        rvParts.setLayoutManager(new LinearLayoutManager(this));
//        ListPartAdapter listPartAdapter = new ListPartAdapter(list);
//        rvParts.setAdapter(listPartAdapter);
//
//        listPartAdapter.setOnItemClickCallback(new ListPartAdapter.OnItemClickCallback() {
//            @Override
//            public void onItemClicked(Part data) {
//                showSelectedPart(data);
//            }
//        });
//    }

//    private void showRecyclerGrid(){
//        rvParts.setLayoutManager(new GridLayoutManager(this, 2));
//        GridPartAdapter gridPartAdapter = new GridPartAdapter(list);
//        rvParts.setAdapter(gridPartAdapter);
//
//        gridPartAdapter.setOnItemClickCallback(new GridPartAdapter.OnItemClickCallback() {
//            @Override
//            public void onItemClicked(Part data) {
//                showSelectedPart(data);
//            }
//        });
//    }

    private void showRecyclerCardView(){
        rvParts.setLayoutManager(new LinearLayoutManager(this));
        CardViewPartAdapter cardViewPartAdapter = new CardViewPartAdapter(list);
        cardViewPartAdapter.setListPart(list);
        rvParts.setAdapter(cardViewPartAdapter);

        ItemClickSupport.addTo(rvParts).setOnItemClickListener(new ItemClickSupport.OnItemClickListener()
        {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v)
            {
                showDetail(position);
            }
        });

    }



    private void showSelectedPart(Part part) {
        Toast.makeText(this, "Kamu memilih " + part.getName(), Toast.LENGTH_SHORT).show();
    }

    private void showDetail(int position)
    {
        listSortir.removeAll(PartsData.getListData());
        listSortir.addAll(PartsData.getListData().subList(position,position + 1));

        rvParts.setLayoutManager(new LinearLayoutManager(this));
        DetailsActivity detailActivity = new DetailsActivity(this);
        detailActivity.setDetailPart(listSortir);
        rvParts.setAdapter(detailActivity);

        ItemClickSupport.addTo(rvParts).setOnItemClickListener(new ItemClickSupport.OnItemClickListener()
        {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v)
            {
                showRecyclerCardView();
            }
        });
    }
}
