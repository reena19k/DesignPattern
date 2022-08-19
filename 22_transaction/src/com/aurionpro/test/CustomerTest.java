package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;

import com.aurionpro.model.Customer;
import com.aurionpro.model.LineItem;
import com.aurionpro.model.Order;
import com.aurionpro.model.Product;

public class CustomerTest {

		 public static void main(String[] args){
             Product product1 = new Product(101, "kinderjoy", 100, 0.1f);
             Product product2 = new Product(102, "coco cola", 30, 0.2f);
             Product product3 = new Product(103, "rice", 200, 0.5f);

             LineItem items1 = new LineItem(product1.getId(), 5, product1);

             List<LineItem> lineItemList1 = new ArrayList<LineItem>();
             lineItemList1.add(items1);

             Order order1 = new Order(1001, "11/08/2022", lineItemList1);
             order1.addLineItem(new LineItem(product2.getId(), 10, product2));
             order1.addLineItem(new LineItem(product3.getId(), 5, product3));

             List<Order> orderList1 = new ArrayList<Order>();
             orderList1.add(order1);

             //Order 2
             Product product4 = new Product(104, "boost", 100, 0.2f);//240
             Product product5 = new Product(105, "onion oil", 300, 0.1f);//

             LineItem items2 = new LineItem(product4.getId(), 3, product4);

             List<LineItem> lineItemList2 = new ArrayList<LineItem>();
             lineItemList2.add(items2);
             lineItemList2.add(new LineItem(product5.getId(), 10, product5));


             Customer customer = new Customer(1, "Reena Kaithwar", orderList1);

             customer.addOrder(new Order(2, "10/08/2022", lineItemList2));

             System.out.println(customer.getOrders());
             List<Order> orders = customer.getOrders();

             double totalPriceOfOrders = 0;
             for(Order o:orders) {
                 totalPriceOfOrders+=o.calculateOrderPrice();
             }

             System.out.println("Total price of orders: "+totalPriceOfOrders);
             System.out.println("Total orders of "+customer.getName()+" "+customer.getOrderCount());

         }

}