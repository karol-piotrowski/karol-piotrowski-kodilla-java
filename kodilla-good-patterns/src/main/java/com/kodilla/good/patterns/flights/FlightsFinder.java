package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightsFinder {
    private Set<Flight> flightSet;

    public FlightsFinder(Set<Flight> flightSet) {
        this.flightSet = flightSet;
    }

    public Set<Flight> findFlightsFromCity(City city) {
        Set<Flight> flightSetFromCity = flightSet.stream()
                .filter(f -> f.getDepartsFrom().getCity().equals(city))
                .collect(Collectors.toSet());
        return flightSetFromCity;
    }

    public Set<Flight> findFlightsToCity(City city) {
        Set<Flight> flightSetToCity = flightSet.stream()
                .filter(f -> f.getArrivesTo().getCity().equals(city))
                .collect(Collectors.toSet());
        return flightSetToCity;
    }

    public Set<FlightConnection> findFlightsWithOneStop(City fromCity, City toCity) {
        Set<Flight> flightSetFrom = findFlightsFromCity(fromCity);
        Set<Flight> flightSetTo = findFlightsToCity(toCity);
        Set<FlightConnection> flightsWithOneStop = new HashSet<>();

        flightSetFrom.stream()
                .filter(flightFrom -> flightFrom.getDepartsFrom().getCity().equals(fromCity))
                .forEach(flightFrom ->
                        flightSetTo.stream()
                                .filter(flightTo -> flightTo.getArrivesTo().getCity().equals(toCity) && flightFrom.getArrivesTo().getCity().equals(flightTo.getDepartsFrom().getCity()))
                                .map(flightTo -> new FlightConnection(flightFrom, flightTo))
                                .forEach(flightsWithOneStop::add)
                );

        return flightsWithOneStop;
    }


}
