package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.util.Date;
import java.util.Map;

public class ProductOrderDatabase implements ProductOrderRepository {
    @Override
    public void createOrder(User user, Map<Product, Integer> products, LocalDate orderDate, String deliveryMethod) {
        System.out.println("ProductOrderDatabase:");
        ProductOrder productOrder = new ProductOrder(user, products, orderDate, deliveryMethod);
        productOrder.printDetails();
    }
}
