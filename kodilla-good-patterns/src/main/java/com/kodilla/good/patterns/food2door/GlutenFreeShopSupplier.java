package com.kodilla.good.patterns.food2door;

import java.util.Scanner;

public class GlutenFreeShopSupplier implements Supplier {

    @Override
    public boolean process(Order order) {
        System.out.println("\nWelcome to Gluten Free Shop ...");
        System.out.println(order.getQuantity() + " " + order.getProduct().getName() + " (ID:" + order.getProduct().getId() + ")");
        System.out.println("Please confirm the order above by entering \"YES\" or \"Y\" (not case-sensitive)");
        Scanner scanner = new Scanner(System.in);
        String confirmation = scanner.nextLine();
        scanner.close();
        if (confirmation.toUpperCase().equals("Y") || confirmation.toUpperCase().equals("YES")) {
            System.out.println("DONE!");
            return true;
        } else {
            System.out.println("Order not confirmed. Cancelled.");
            return false;
        }


    }
}
