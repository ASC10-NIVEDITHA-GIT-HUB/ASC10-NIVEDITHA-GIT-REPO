//package com.shopybuy.products;
//
//import com.shopybuy.products.cart.Cart;
//import com.shopybuy.products.orders.Order;
//import com.shopybuy.products.payment.Payment;
//
//public class Main {
//    public static void main(String[] args) {
//        user user = new user("U001", "Alice", "alice@example.com");
//        Product product1 = new Product("P001", "Laptop", 1500.00, "Gaming Laptop");
//        Product product2 = new Product("P002", "Mouse", 25.00, "Wireless Mouse");
//
//        Cart cart = new Cart(user);
//        cart.addProduct(product1, 1);
//        cart.addProduct(product2, 2);
//
//        System.out.println("Cart Total: $" + cart.getTotal());
//
//        Order order = new Order("O1001", user, cart.getItems());
//        System.out.println("Order Total: $" + order.calculateTotal());
//
//        Payment payment = new Payment("PMT001", order, user, order.calculateTotal(), "Credit Card");
//        payment.completePayment();
//
//        System.out.println("Payment Status: " + payment.getStatus());
//        System.out.println(payment);
//    }
//}
