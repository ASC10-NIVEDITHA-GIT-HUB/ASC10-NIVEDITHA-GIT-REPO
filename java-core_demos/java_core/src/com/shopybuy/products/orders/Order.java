//package com.shopybuy.products.orders;
//
//import com.shopybuy.products.Product;
//import com.shopybuy.products.user;
//
//import java.util.*;
//
//public class Order {
//    private String orderId;
//    private user user;
//    private Map<Product, Integer> items;
//    private String status;
//
//    public Order(String orderId, user user, Map<Product, Integer> items) {
//        this.orderId = orderId;
//        this.user = com.shopybuy.products.user;
//        this.items = new HashMap<>(items);
//        this.status = "Pending";
//    }
//
//    public String getOrderId() { return orderId; }
//
//    public void updateStatus(String status) {
//        this.status = status;
//    }
//
//    public double calculateTotal() {
//        return items.entrySet().stream()
//                .mapToDouble(e -> e.getKey().getPrice() * e.getValue())
//                .sum();
//    }
//
//    public Map<Product, Integer> getOrderItems() { return items; }
//
//    public String getStatus() { return status; }
//
//    public user getUser() { return user; }
//}
