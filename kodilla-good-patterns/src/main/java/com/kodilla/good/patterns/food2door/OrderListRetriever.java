package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class OrderListRetriever {
    public List<Order> retrieve() {
        List<Order> orderList = new ArrayList<>();

        Supplier extraFoodShop = new ExtraFoodShopSupplier();
        Supplier healthyShop = new HealthyShopSupplier();
        Supplier glutenFreeShop = new GlutenFreeShopSupplier();

        Product carrot = new Product(1, "Carrot");
        Product cabbage = new Product(2, "Cabbage");
        Product onion = new Product(3, "Onion");

        orderList.add(new Order(extraFoodShop, 2, cabbage));
        orderList.add(new Order(healthyShop, 4, carrot));
        orderList.add(new Order(glutenFreeShop, 1, onion));

        return orderList;
    }
}
