package com.androidfree.myapplication.Activity;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import com.androidfree.myapplication.Adapter.Select_Service_Item;
import com.androidfree.myapplication.MainActivity;
import com.androidfree.myapplication.Model.Selectservice;
import com.androidfree.myapplication.R;

import java.util.ArrayList;
import java.util.List;
public class Dryclean extends AppCompatActivity {
    String[] country = {"Iron", "Washonly", "dry_clean", "Other"};
    RecyclerView recyclerView;
    List<Selectservice> selectserviceList;
    Selectservice selectservice;
    Select_Service_Item select_service_item;
    private ArrayAdapter<String> adapter;
    Spinner spinner1;
    Context spinercontext;

    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dryclean);
        Toolbar toolbar = findViewById(R.id.tool_bar);
        spinner1 = findViewById(R.id.myspinner);
        toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24);
        toolbar.setNavigationOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(); // Implemented by activity
                    }
                });
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView = findViewById(R.id.dry_clean_recycler);
        recyclerView.setLayoutManager(layoutManager);
        selectserviceList = new ArrayList<>();
        selectservice = new Selectservice("T-shirt",country, "$6", R.drawable.t_shirt);
        selectserviceList.add(selectservice);
        selectservice = new Selectservice("Trouser", country, "$6", R.drawable.trouser);
        selectserviceList.add(selectservice);
        selectservice = new Selectservice("Shirt", country, "$6", R.drawable.shirt);
        selectserviceList.add(selectservice);
        selectservice = new Selectservice("Coat", country, "$6", R.drawable.coat);
        selectserviceList.add(selectservice);
        selectservice = new Selectservice("Jeans", country, "$6", R.drawable.jeans);
        selectserviceList.add(selectservice);
        select_service_item = new Select_Service_Item(this, selectserviceList);
        recyclerView.setAdapter(select_service_item);
    }
}
