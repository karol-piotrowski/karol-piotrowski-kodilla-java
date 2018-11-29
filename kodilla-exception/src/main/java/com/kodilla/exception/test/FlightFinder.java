package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> destinationMap = new HashMap<>();
        destinationMap.put("KRK", true);
        destinationMap.put("WAW", true);
        destinationMap.put("RDO", false);
        destinationMap.put("SXF", true);
        destinationMap.put("DOK", false);
        destinationMap.put("CDG", true);
        destinationMap.put("AGP", true);

        if (destinationMap.containsKey(flight.getArrivalAirport())) {
            System.out.println(destinationMap.get(flight.getArrivalAirport()) ? "Flight to " + flight.getArrivalAirport() + " possible." : "Flight to " + flight.getArrivalAirport() + " not possible.");
            return destinationMap.get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException("Error: " + flight.getArrivalAirport() +": Route not found in the destination map!");
        }
    }
}
