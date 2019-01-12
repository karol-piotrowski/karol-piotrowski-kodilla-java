package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.util.Date;
import java.util.Map;

public class ProductOrderService {

    public boolean order(User user, Map<Product, Integer> products, LocalDate orderDate, String deliveryMethod) {
        System.out.println("ProductOrderService:");
        ProductOrder productOrder = new ProductOrder(user, products, orderDate, deliveryMethod);
        productOrder.printDetails();
        return true;
    }
}
