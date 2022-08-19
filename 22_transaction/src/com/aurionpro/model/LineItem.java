package com.aurionpro.model;
public class LineItem {
    public int id;
    public int quantity;
    public Product product;

    public LineItem(int id, int quantity, Product product) {
        this.id = id;
        this.quantity = quantity;
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    public double calculateLineItemCost(){
        return getProduct().calculatePriceAfterDiscount()*getQuantity();

    }

    @Override
    public String toString() {
        return "LineItem{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", product=" + product +
                '}';
    }
}