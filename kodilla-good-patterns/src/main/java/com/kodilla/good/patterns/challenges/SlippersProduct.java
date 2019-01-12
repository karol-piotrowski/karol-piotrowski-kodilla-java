package com.kodilla.good.patterns.challenges;

public class SlippersProduct implements Product {
    private int id;
    private String name;
    private double price;

    private int size;
    private String color;
    private String material;

    public SlippersProduct(int id, String name, double price, int size, String color, String material) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.size = size;
        this.color = color;
        this.material = material;
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

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }
}
