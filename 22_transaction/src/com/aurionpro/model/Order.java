package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    public int id;
    public String date;
    List<LineItem> itemList =new ArrayList<>();


    public Order(int id, String date, List<LineItem> itemList) {
        this.id = id;
        this.date = date;
        this.itemList = itemList;
    }

    public Order(){
        this.itemList=new ArrayList<LineItem>();
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public List<LineItem> getItemList() {
        return itemList;
    }

    public void addLineItem(LineItem lineItem){
        itemList.add(lineItem);
    }

    public int itemsCount(){
        int count=0;
        for(LineItem item:itemList){
            count+=item.getQuantity();
        }
        return count;
    }
   public double calculateOrderPrice(){
        double price=0;
        for(LineItem item:itemList){
            price+=item.calculateLineItemCost();
        }
        return price;
   }

    @java.lang.Override
    public java.lang.String toString() {
        return "Order{" +
                "id=" + id +
                ", date=" + date +
                ", itemList=" + itemList +
                '}';
    }
}