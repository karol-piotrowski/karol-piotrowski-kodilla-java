package com.kodilla.good.patterns.food2door;

import java.util.List;

public class Food2DoorMain {
    public static void main(String[] args) {
        OrderListRetriever orderListRetriever = new OrderListRetriever();
        List<Order> orderList = orderListRetriever.retrieve();

        orderList
                .stream()
                .forEach(order -> order.getSupplier().process(order));
    }
}
