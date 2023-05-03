package com.example.bottomnavigation;

import java.sql.Savepoint;
import java.util.ArrayList;

public class DataClass {
    public Integer NumTokens;
    public Integer tasksCompleted = 0;
    public ArrayList<Item> StoreItems;
    public ArrayList<Charity> CharityItems;

    private static DataClass instance = null;

    private DataClass() {
        // constructor
        DefineCharities();
        DefineItems();
    }

    public static DataClass get_instance() {
        if (instance == null) {
            instance = new DataClass();
        }
        return instance;
    }

    public void DefineCharities() {
        //salvation army declaration
        Charity SalvationArmy = new Charity("Salvation Army", "Description goes here.");
        CharityItems.add(SalvationArmy);
    }

    public void DefineItems(){
        //define items in the store
        Item Laptop = new Item("My Laptop Item", 999.99f, 4);
        StoreItems.add(Laptop);

    }
}