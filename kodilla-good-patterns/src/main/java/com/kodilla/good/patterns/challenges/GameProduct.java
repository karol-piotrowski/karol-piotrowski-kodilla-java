package com.kodilla.good.patterns.challenges;

public class GameProduct implements Product {

    private int id;
    private String name;
    private double price;

    private int numberOfPlayers;
    private String genre;
    private int releaseYear;

    public GameProduct(int id, String name, double price, int numberOfPlayers, String genre, int releaseYear) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.numberOfPlayers = numberOfPlayers;
        this.genre = genre;
        this.releaseYear = releaseYear;
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

}
