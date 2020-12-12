package com.androidfree.myapplication.Adapter;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.androidfree.myapplication.Activity.Dryclean;
import com.androidfree.myapplication.Model.Service;
import com.androidfree.myapplication.R;

import java.util.List;

public class ServicesAdapter extends RecyclerView.Adapter<ServicesAdapter.ViewHolder>{
    private static final String Tag="Services Adapter";
    //vars
    private Context mContext;
    private List<Service> serviceList;

    public ServicesAdapter(Context mContext, List<Service> serviceList) {
        this.mContext = mContext;
        this.serviceList = serviceList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d(Tag,"onCreateViewHolder Called:");
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.services_items,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        Log.d(Tag,"onBindViewHolder Called:");
        holder.service_image_rec.setImageResource(serviceList.get(position).getItemImage());
        holder.service_name.setText(serviceList.get(position).getItemName());
        holder.service_image_rec.setOnClickListener(new View.OnClickListener() {
            // Jump into Dryclean Activity
            @Override
            public void onClick(View v) {
               Intent i=new Intent(mContext, Dryclean.class);
                mContext.startActivity(i);
                /*Toast.makeText(mContext,"click",Toast.LENGTH_LONG).show();*/
            }
        });

    }

    @Override
    public int getItemCount()
    {
        return serviceList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView service_image_rec;
        TextView  service_name;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            service_image_rec=itemView.findViewById(R.id.service_image);
            service_name=itemView.findViewById(R.id.text_name);
        }
    }
}