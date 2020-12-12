package com.androidfree.myapplication.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.androidfree.myapplication.Model.ServiceType;
import com.androidfree.myapplication.R;

import java.util.List;

public class ServiceTypeAdapter extends RecyclerView.Adapter<ServiceTypeAdapter.ViewHolder> {
    private static final String Tag="Services Adapter";
    //vars
    private Context mycontext;
    List<ServiceType> serviceTypeList;

    public ServiceTypeAdapter(Context mycontext, List<ServiceType> serviceTypeList) {
        this.mycontext = mycontext;
        this.serviceTypeList = serviceTypeList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Log.d(Tag,"onCreateViewHolder Called:");
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.choose_by_type,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        Log.d(Tag,"onBindViewHolder Called:");

        holder.service_type_image.setImageResource(serviceTypeList.get(position).getServiceImage());
        holder.service_type_name.setText(serviceTypeList.get(position).getServiceName());


        /*Picasso.get().load(m_service_imageUrl.get(position)).into(holder.service_type_image);
        holder.service_type_name.setText(m_service_Name.get(position));
        holder.service_type_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(Tag,"onclick: click on image" + m_service_imageUrl.get(position));
                Intent intent=new Intent(mContext,AllServices.class);
                mContext.startActivity(intent);
            }
        });*/
    }

    @Override
    public int getItemCount() {
        return serviceTypeList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView service_type_image;
        TextView service_type_name;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            service_type_image = itemView.findViewById(R.id.service_type_image);
            service_type_name = itemView.findViewById(R.id.serive_by_name);




        }

    }
}

