package com.kodilla.good.patterns.flights;

public class Airport {
    private String iataCode;
    private String cityName;
    private String airportName;

    public Airport(final String iataCode, final String cityName, final String airportName) {
        this.iataCode = iataCode;
        this.cityName = cityName;
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
}
