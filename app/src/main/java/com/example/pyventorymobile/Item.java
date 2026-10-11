package com.example.pyventorymobile;

public class Item {
    private String name;
    private String category;
    private int quantity;

    public Item(String name, String category, int quantity) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }
    public String getCategory() {
        return this.category;
    }
    public int getQuantity() {
        return this.quantity;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
