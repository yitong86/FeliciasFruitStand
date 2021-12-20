package com.sophia;

import java.util.ArrayList;

public class Stand {
    private String nameOfStand_;
   // private int inventory;
    private ArrayList<Fruit> fruitsList_;
    private ArrayList<Integer> inventoryList_;
    //{apple,banana,orange}

    public Stand(String name, ArrayList<Fruit> fruitsList,ArrayList<Integer> inventoryList) {
        this.nameOfStand_ = name;
        this.fruitsList_ = fruitsList;
        this.inventoryList_ = inventoryList;
    }

    public String getNameOfStand_() {
        return nameOfStand_;
    }

    public void setNameOfStand_(String nameOfStand_) {
        this.nameOfStand_ = nameOfStand_;
    }

    public ArrayList<Fruit> getFruitsList_() {
        return fruitsList_;
    }

    public void setFruitsList_(ArrayList<Fruit> fruitsList_) {
        this.fruitsList_ = fruitsList_;
    }

    public ArrayList<Integer> getInventoryList_() {
        return inventoryList_;
    }

    public void setInventoryList_(ArrayList<Integer> inventoryList_) {
        this.inventoryList_ = inventoryList_;
    }
}
