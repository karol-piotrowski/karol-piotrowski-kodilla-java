package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.util.Map;

public class ProductOrder {
    private User user;
    private Map<Product, Integer> products;
    private LocalDate orderDate;
    private String deliveryMethod;

    public ProductOrder(User user, Map<Product, Integer> products, LocalDate orderDate, String deliveryMethod) {
        this.user = user;
        this.products = products;
        this.orderDate = orderDate;
        this.deliveryMethod = deliveryMethod;
    }

    public User getUser() {
        return user;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void printDetails(){
        System.out.println("Ordering the following products:");
        products
                .entrySet()
                .stream()
                .map(e -> e.getValue() + " pcs. of product id " + e.getKey().getId())
                .forEach(System.out::println);
        System.out.println("for user: " + user.getUsername() + " on the following date: " + orderDate.toString() + " with the following delivery method: " + deliveryMethod);
    }
}
