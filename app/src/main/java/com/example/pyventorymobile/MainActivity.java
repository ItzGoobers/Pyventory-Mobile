package com.example.pyventorymobile;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import androidx.appcompat.app.AppCompatDelegate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(
                AppCompatDelegate.MODE_NIGHT_NO
        );
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        View main = findViewById(R.id.main);

        int originalLeft = main.getPaddingLeft();
        int originalTop = main.getPaddingTop();
        int originalRight = main.getPaddingRight();
        int originalBottom = main.getPaddingBottom();

        ViewCompat.setOnApplyWindowInsetsListener(main, (v, insets) -> {
            Insets systemBars = insets.getInsets(
                    WindowInsetsCompat.Type.systemBars()
            );

            v.setPadding(
                    originalLeft + systemBars.left,
                    originalTop + systemBars.top,
                    originalRight + systemBars.right,
                    originalBottom + systemBars.bottom
            );

            return insets;
        });

        ArrayList<Item> items = new ArrayList<>();

        items.add(new Item("Wireless Mouse", "Electronics", 12));
        items.add(new Item("USB-C Cable", "Accessories", 3));
        items.add(new Item("Notebook", "Stationery", 24));
        items.add(new Item("Wireless Mouse", "Electronics", 12));
        items.add(new Item("USB-C Cable", "Accessories", 3));
        items.add(new Item("Notebook", "Stationery", 24));items.add(new Item("Wireless Mouse", "Electronics", 12));
        items.add(new Item("USB-C Cable", "Accessories", 3));
        items.add(new Item("Notebook", "Stationery", 24));


        RecyclerView inventoryList = findViewById(R.id.inventory_list);

        inventoryList.setLayoutManager(new LinearLayoutManager(this));
        inventoryList.setAdapter(new ItemAdapter(items));

    }
    
}