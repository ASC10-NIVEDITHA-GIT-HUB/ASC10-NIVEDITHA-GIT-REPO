//package com.shopybuy.products.payment;
//
//import com.shopybuy.products.user;
//import com.shopybuy.products.orders.Order;
//
//public class Payment {
//    private String paymentId;
//    private Order order;
//    private user user;
//    private double amount;
//    private String paymentMethod; // e.g., Credit Card, UPI, PayPal
//    private String status; // e.g., Pending, Completed, Failed
//
//    public Payment(String paymentId, Order order, user user, double amount, String paymentMethod) {
//        this.paymentId = paymentId;
//        this.order = order;
//        this.user = user;
//        this.amount = amount;
//        this.paymentMethod = paymentMethod;
//        this.status = "Pending";
//    }
//
//    public String getPaymentId() { return paymentId; }
//    public Order getOrder() { return order; }
//    public user getUser() { return user; }
//    public double getAmount() { return amount; }
//    public String getPaymentMethod() { return paymentMethod; }
//    public String getStatus() { return status; }
//
//    public void completePayment() {
//        this.status = "Completed";
//    }
//
//    public void failPayment() {
//        this.status = "Failed";
//    }
//
//    public void refundPayment() {
//        if (status.equals("Completed")) {
//            this.status = "Refunded";
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "Payment ID: " + paymentId + ", Status: " + status + ", Amount: $" + amount;
//    }
//}
