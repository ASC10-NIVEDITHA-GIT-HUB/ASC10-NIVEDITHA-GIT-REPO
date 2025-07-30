package com.shopybuy.products.offers;

import com.shopybuy.products.Product;

public class offers {
    private String offerId;
    private Product product;
    private double discountPercentage;

    public offers(String offerId, Product product, double discountPercentage) {
        this.offerId = offerId;
        this.product = product;
        this.discountPercentage = discountPercentage;
    }

    public String getOfferId() { return offerId; }

    public double getDiscountedPrice() {
        return product.getPrice() * (1 - discountPercentage / 100);
    }

    public boolean isApplicable(Product p) {
        return product.getProductId().equals(p.getProductId());
    }

    public Product getProduct() { return product; }

    public double getDiscountPercentage() { return discountPercentage; }
}
