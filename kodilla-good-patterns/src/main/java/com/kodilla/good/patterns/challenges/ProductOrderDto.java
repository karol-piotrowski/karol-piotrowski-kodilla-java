package com.kodilla.good.patterns.challenges;

import java.util.Map;

public class ProductOrderDto {
    private User user;
    private Map<Product, Integer> products;
    private boolean isOrdered;

    public ProductOrderDto(User user, Map<Product, Integer> products, boolean isOrdered) {
        this.user = user;
        this.products = products;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
