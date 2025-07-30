package com.shopybuy.products.cart;

import com.shopybuy.products.Product;
import com.shopybuy.products.user;

import java.util.*;

public class Cart {
    private user user;
    private Map<Product, Integer> items;

    public Cart(user user) {
        this.user = user;
        this.items = new HashMap<>();
    }

    public void addProduct(Product product, int quantity) {
        items.put(product, items.getOrDefault(product, 0) + quantity);
    }

    public void removeProduct(Product product) {
        items.remove(product);
    }

    public double getTotal() {
        return items.entrySet().stream()
                .mapToDouble(e -> e.getKey().getPrice() * e.getValue())
                .sum();
    }

    public void clearCart() {
        items.clear();
    }

    public Map<Product, Integer> getItems() {
        return items;
    }

    public user getUser() {
        return user;
    }
}
