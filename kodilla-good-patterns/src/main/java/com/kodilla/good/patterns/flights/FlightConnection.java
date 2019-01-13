package com.kodilla.good.patterns.flights;

public class FlightConnection {
    private Flight flight1;
    private Flight flight2;

    public FlightConnection(Flight flight1, Flight flight2) {
        this.flight1 = flight1;
        this.flight2 = flight2;
    }

    @Override
    public String toString() {
        return "---FLIGHT CONNECTION---\n" + flight1 + "\n" + flight2;
    }
}
