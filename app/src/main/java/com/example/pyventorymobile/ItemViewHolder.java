package com.example.pyventorymobile;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ItemViewHolder extends RecyclerView.ViewHolder {
    TextView nameText;
    TextView categoryText;
    TextView quantityText;

    public ItemViewHolder(View itemView) {
        super(itemView);
        nameText = itemView.findViewById(R.id.item_name);
        categoryText = itemView.findViewById(R.id.item_category);
        quantityText = itemView.findViewById(R.id.item_quantity);

    }
}