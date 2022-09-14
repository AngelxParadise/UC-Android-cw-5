package com.example.headphones;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter {

    ArrayList<Headphones> phoneList = new ArrayList<>();
    Context context;

    public ItemAdapter(ArrayList<Headphones> phoneList, Context context) {
        this.phoneList = phoneList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder)holder).textname.setText(phoneList.get(position).getItemName());
        ((ViewHolder)holder).textviewprice.setText(phoneList.get(position).getItemPrice() + " KD");
        ((ViewHolder)holder).img.setImageResource(phoneList.get(position).getItemimg());

    }

    @Override
    public int getItemCount() {
        return phoneList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView textname, textviewprice;
        View v;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            v = itemView;
            img = v.findViewById(R.id.imageView);
            textname = v.findViewById(R.id.textViewName);
            textviewprice = v.findViewById(R.id.textViewPrice);
        }
    }

}
