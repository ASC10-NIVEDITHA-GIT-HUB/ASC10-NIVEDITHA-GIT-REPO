package com.shopybuy.products.wishlist;

import com.shopybuy.products.Product;
import com.shopybuy.products.user;

import java.util.*;

public class wishlist {
    private user user;
    private Set<Product> wishlistItems;

    public wishlist(user user) {
        this.user = user;
        this.wishlistItems = new HashSet<>();
    }

    public void addProduct(Product product) {
        wishlistItems.add(product);
    }

    public void removeProduct(Product product) {
        wishlistItems.remove(product);
    }

    public boolean isInWishlist(Product product) {
        return wishlistItems.contains(product);
    }

    public Set<Product> getWishlistItems() {
        return wishlistItems;
    }

    public user getUser() {
        return user;
    }

    public void clearWishlist() {
        wishlistItems.clear();
    }
}