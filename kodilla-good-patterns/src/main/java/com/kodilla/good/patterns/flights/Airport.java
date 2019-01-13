package com.kodilla.good.patterns.flights;

public class Airport {
    private String iataCode;
    private City city;
    private String airportName;

    public Airport(final String iataCode, final City city, final String airportName) {
        this.iataCode = iataCode;
        this.city = city;
        this.airportName = airportName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Airport airport = (Airport) o;

        return iataCode.equals(airport.iataCode);
    }

    @Override
    public int hashCode() {
        return iataCode.hashCode();
    }

    @Override
    public String toString() {
        return iataCode + "(" + city + " - " + airportName + ")";
    }

    public String getIataCode() {
        return iataCode;
    }

    public City getCity() {
        return city;
    }

    public String getAirportName() {
        return airportName;
    }
}
