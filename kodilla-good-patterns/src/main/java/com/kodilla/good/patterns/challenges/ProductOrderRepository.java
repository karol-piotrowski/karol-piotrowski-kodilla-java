package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.util.Date;
import java.util.Map;

public interface ProductOrderRepository {
    void createOrder(User user, Map<Product, Integer> products, LocalDate orderDate, String deliveryMethod);
}
