package com.kodilla.good.patterns.food2door;

public class ExtraFoodShopSupplier implements Supplier {

    @Override
    public boolean process(Order order) {
        System.out.println("\nWelcome to Extra Food Shop!");
        System.out.println("You ordered " + order.getQuantity() + " pieces of " + order.getProduct().getName() + "(id:" + order.getProduct().getId() + ")");
        System.out.println("Please wait while we are processing your order...");
        System.out.println("Done!");
        return true;
    }
}
