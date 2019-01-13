package com.kodilla.good.patterns.flights;

public class FlightsMain {
    public static void main(String[] args) {
        FlightSetRetriever flightSetRetriever = new FlightSetRetriever();
        FlightsFinder flightsFinder = new FlightsFinder(flightSetRetriever.retrieve());

        City gdanskPL = new City("Gdansk", "Poland");
        City washingtonUS = new City("Washington", "USA");
        City warszawaPL = new City("Warszawa", "Poland");
        City berlinDE = new City("Berlin", "Germany");


        System.out.println("Flights from " + gdanskPL + ":");
        flightsFinder.findFlightsFromCity(gdanskPL).forEach(System.out::println);
        System.out.println("\nFlights to " + washingtonUS + ":");
        flightsFinder.findFlightsToCity(washingtonUS).forEach(System.out::println);
        System.out.println("\nFlights from " + gdanskPL + " to " + washingtonUS + " with one stop:");
        flightsFinder.findFlightsWithOneStop(gdanskPL, washingtonUS).forEach(System.out::println);
        System.out.println("\nFlights from " + warszawaPL + " to " + washingtonUS + " with one stop:");
        flightsFinder.findFlightsWithOneStop(warszawaPL, washingtonUS).forEach(System.out::println);
        System.out.println("\nFlights from " + berlinDE + " to " + washingtonUS + " with one stop:");
        flightsFinder.findFlightsWithOneStop(berlinDE, washingtonUS).forEach(System.out::println);
    }
}
