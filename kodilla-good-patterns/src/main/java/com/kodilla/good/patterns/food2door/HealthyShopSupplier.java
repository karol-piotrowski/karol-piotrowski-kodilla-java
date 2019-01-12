package com.kodilla.good.patterns.food2door;

public class HealthyShopSupplier implements Supplier {

    @Override
    public boolean process(Order order) {
        System.out.println("\nHealthy Shop ordering system...");
        System.out.println("Ordering: QUANTITY: " + order.getQuantity() + " of PRODUCT: " + order.getProduct().getName() + " (ID:" + order.getProduct().getId() + ")");
        System.out.println("DONE!");
        return true;
    }
}
