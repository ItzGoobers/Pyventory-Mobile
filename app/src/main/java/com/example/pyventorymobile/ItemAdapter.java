package com.example.pyventorymobile;

import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    private List<Item> items;
    public ItemAdapter(List<Item> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View row = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_inventory,parent, false);
        return new ItemViewHolder(row);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Item item = items.get(position);

        holder.nameText.setText(item.getName());
        holder.categoryText.setText(item.getCategory());
        holder.quantityText.setText(String.valueOf(item.getQuantity()));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
