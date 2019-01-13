package com.kodilla.good.patterns.flights;

public class Flight {
    private String flightId;
    private Airport departsFrom;
    private Airport arrivesTo;

    public Flight(String flightId, Airport departsFrom, Airport arrivesTo) {
        this.flightId = flightId;
        this.departsFrom = departsFrom;
        this.arrivesTo = arrivesTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        return flightId.equals(flight.flightId);
    }

    @Override
    public int hashCode() {
        return flightId.hashCode();
    }

    public String getFlightId() {
        return flightId;
    }

    public Airport getDepartsFrom() {
        return departsFrom;
    }

    public Airport getArrivesTo() {
        return arrivesTo;
    }

    @Override
    public String toString() {
        return "Flight: " + flightId + ": " + departsFrom + " -> " + arrivesTo;
    }
}
