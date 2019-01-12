package com.kodilla.good.patterns.food2door;

public class Order {
    private Supplier supplier;
    private int quantity;
    private Product product;

    public Order(Supplier supplier, int quantity, Product product) {
        this.supplier = supplier;
        this.quantity = quantity;
        this.product = product;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }
}
