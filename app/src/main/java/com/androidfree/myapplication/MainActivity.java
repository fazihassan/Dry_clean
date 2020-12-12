package com.androidfree.myapplication;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.androidfree.myapplication.Adapter.ServiceTypeAdapter;
import com.androidfree.myapplication.Adapter.ServicesAdapter;
import com.androidfree.myapplication.Adapter.SliderAdapterExample;
import com.androidfree.myapplication.Model.Service;
import com.androidfree.myapplication.Model.ServiceType;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {
    ViewFlipper viewFlipper;
    List<Service> myservice;
    Service service;
    ServiceType serviceType;
    List<ServiceType>myServiceTypelist;
    ServicesAdapter servicesAdapter;
    ServiceTypeAdapter serviceTypeAdapter;
    RecyclerView recyclerView,recyclerView1;
    SliderView sliderView;
    private SliderAdapterExample adapter;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int imagearr[]={R.drawable.room_1,R.drawable.room_1};
        viewFlipper=findViewById(R.id.cardView);
        for (int i=0; i<imagearr.length;i++)
        {
            showimage(imagearr[i]);
        }
        initRecyclerView();
        initRecyclerView_services();
    }
    private void initRecyclerView()
    {
        LinearLayoutManager linearLayoutManager=new GridLayoutManager(this,4,GridLayoutManager.VERTICAL,false);
        recyclerView=findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(linearLayoutManager);
        myservice=new ArrayList<>();
        service=new Service("Wash & fold",R.drawable.wash_flod);
        myservice.add(service);
        service=new Service("Wash & iron",R.drawable.machine_iron);
        myservice.add(service);
        service=new Service("Iron",R.drawable.iron_2);
        myservice.add(service);
        service=new Service("Dry Clean",R.drawable.dry_clean);
        myservice.add(service);
        servicesAdapter=new ServicesAdapter(MainActivity.this,myservice);
        recyclerView.setAdapter(servicesAdapter);
    }
    private void initRecyclerView_services()
    {
        LinearLayoutManager linearLayoutManager=new GridLayoutManager(this,4,GridLayoutManager.VERTICAL,false);
        recyclerView1=findViewById(R.id.recycler_view_service_type);
        recyclerView1.setLayoutManager(linearLayoutManager);
        myServiceTypelist=new ArrayList<>();
        serviceType=new ServiceType("Men",R.drawable.men);
        myServiceTypelist.add(serviceType);
        serviceType=new ServiceType("Women",R.drawable.women);
        myServiceTypelist.add(serviceType);
        serviceType=new ServiceType("Kids",R.drawable.kids);
        myServiceTypelist.add(serviceType);
        serviceType=new ServiceType("Other",R.drawable.others);
        myServiceTypelist.add(serviceType);
        serviceTypeAdapter=new ServiceTypeAdapter(this,myServiceTypelist);
        recyclerView1.setAdapter(serviceTypeAdapter);
    }
    public void showimage(int img)
    {
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(img);
        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(3000);
        viewFlipper.setAutoStart(true);
    }
}