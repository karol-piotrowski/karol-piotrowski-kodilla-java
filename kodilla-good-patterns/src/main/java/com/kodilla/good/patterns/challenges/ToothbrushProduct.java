package com.kodilla.good.patterns.challenges;

public class ToothbrushProduct implements Product {
    private int id;
    private String name;
    private double price;

    private String hardness;
    private String color;

    public ToothbrushProduct(int id, String name, double price, String hardness, String color) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.hardness = hardness;
        this.color = color;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public String getHardness() {
        return hardness;
    }

    public String getColor() {
        return color;
    }
}
