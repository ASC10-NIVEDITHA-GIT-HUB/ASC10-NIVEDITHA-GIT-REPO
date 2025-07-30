package com.shopybuy.products.profile;

import com.shopybuy.products.user;

public class profiles {
    private user user;
    private String address;
    private String phoneNumber;
    private String paymentMethod;

    public profiles (user user, String address, String phoneNumber, String paymentMethod) {
        this.user = user;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.paymentMethod = paymentMethod;
    }

    public String getAddress() { return address; }

    public void updateAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() { return phoneNumber; }

    public void updatePhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPaymentMethod() { return paymentMethod; }

    public void updatePaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public user getUser() { return user; }
}
