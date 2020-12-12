package com.androidfree.myapplication.Adapter;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.androidfree.myapplication.Model.Selectservice;
import com.androidfree.myapplication.R;

import java.util.ArrayList;
import java.util.List;
public class Select_Service_Item extends RecyclerView.Adapter<Select_Service_Item.service_view_holder> {
    private Context mcontext;
    private List<Selectservice> select_service_itemList;
    public Select_Service_Item(Context mcontext, List<Selectservice> select_service_itemList) {
        this.mcontext = mcontext;
        this.select_service_itemList = select_service_itemList;
    }
    @NonNull
    @Override
    public service_view_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.dry_clean_layout,parent,false);
        return new service_view_holder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull final service_view_holder holder, int position) {
        holder.select_by_item_image.setImageResource(select_service_itemList.get(position).getService_image());
        holder.item_text_name.setText(select_service_itemList.get(position).getItem_text_name());
        holder.item_price.setText(select_service_itemList.get(position).getItem_price());

    }
    @Override
    public int getItemCount() {

        return select_service_itemList.size();
    }
    public class service_view_holder extends RecyclerView.ViewHolder  {
        ImageView select_by_item_image;
        TextView item_text_name,item_price;
        public service_view_holder(@NonNull View itemView) {
            super(itemView);
            select_by_item_image=itemView.findViewById(R.id.item_image);
            item_text_name=itemView.findViewById(R.id.item_txt_name);
            item_price=itemView.findViewById(R.id.item_service_price);

        }
    }


}


