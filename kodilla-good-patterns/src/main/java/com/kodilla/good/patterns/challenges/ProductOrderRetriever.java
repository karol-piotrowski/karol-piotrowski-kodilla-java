package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class ProductOrderRetriever {
    public ProductOrder retrieve() {

        Product ColgateBrush = new ToothbrushProduct(1, "Colgate Toothbrush", 2.50, "Medium", "Red");
        Product PinkSlippers = new SlippersProduct(2, "Pink Slippers", 5, 38, "Pink", "Polyester");
        Product Starcraft = new GameProduct(3, "Starcraft", 39.90, 1, "RTS", 1998);

        User user = new User("wwhite", "Walter", "White", LocalDate.of(1959, 9, 7), "308 Negra Arroyo Lane, Albuquerque, NM");

        Map<Product, Integer> products = new HashMap<>();
        products.put(ColgateBrush, 4);
        products.put(PinkSlippers, 2);
        products.put(Starcraft, 1);

        LocalDate orderDate = LocalDate.of(2019, 1, 12);

        String deliveryMethod = "Post";

        return new ProductOrder(user, products, orderDate, deliveryMethod);
    }
}
