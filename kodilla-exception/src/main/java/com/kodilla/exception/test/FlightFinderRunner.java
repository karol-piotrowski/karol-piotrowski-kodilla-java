package com.kodilla.exception.test;

public class FlightFinderRunner {

    public static void main(String[] args) {
        Flight flight1 = new Flight("KRK", "AGP");
        Flight flight2 = new Flight("SXF", "RDO");
        Flight flight3 = new Flight("WAW", "FNC");

        FlightFinder flightFinder = new FlightFinder();
        try {
            flightFinder.findFlight(flight1);
            flightFinder.findFlight(flight2);
            flightFinder.findFlight(flight3);
        } catch (RouteNotFoundException e) {
            System.out.println(e + " <<No such airport was found!>>");
        } finally {
            System.out.println("Program ends here.");
        }
    }
}
