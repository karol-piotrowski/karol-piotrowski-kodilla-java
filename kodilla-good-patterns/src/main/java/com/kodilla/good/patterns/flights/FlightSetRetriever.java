package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightSetRetriever {
    public Set<Flight> retrieve() {
        City gdanskPL = new City("Gdansk", "Poland");
        City krakowPL = new City("Krakow", "Poland");
        City warszawaPL = new City("Warszawa", "Poland");
        City berlinDE = new City("Berlin", "Germany");
        City parisFR = new City("Paris", "France");
        City washingtonUS = new City("Washington", "USA");

        Airport gdn = new Airport("GDN", gdanskPL, "Port lotniczy Gdańsk-Rębiechowo im. Lecha Wałęsy");
        Airport krk = new Airport("KRK", krakowPL, "Międzynarodowy Port Lotniczy im. Jana Pawła II Kraków-Balice");
        Airport waw = new Airport("WAW", warszawaPL, "Lotnisko Chopina w Warszawie");
        Airport wmi = new Airport("WMI", warszawaPL, "Mazowiecki Port Lotniczy Warszawa-Modlin");
        Airport sxf = new Airport("SXF", berlinDE, "Port lotniczy Berlin-Schönefeld");
        Airport txl = new Airport("TXL", berlinDE, "Port lotniczy Berlin-Tegel");
        Airport cdg = new Airport("CDG", parisFR, "Port lotniczy Paryż-Roissy-Charles de Gaulle");
        Airport ory = new Airport("ORY", parisFR, "Port lotniczy Paryż-Orly");
        Airport bva = new Airport("BVA", parisFR, "Port lotniczy Beauvais-Tillé");
        Airport dca = new Airport("DCA", washingtonUS, "Port lotniczy Waszyngton-Reagan-National");
        Airport iad = new Airport("IAD", washingtonUS, "Port lotniczy Waszyngton-Dulles");

        Set<Flight> flightSet = new HashSet<>();

        flightSet.add(new Flight("PLPL0001", gdn, krk));
        flightSet.add(new Flight("DEPL0001", txl, waw));
        flightSet.add(new Flight("DEPL0002", txl, wmi));
        flightSet.add(new Flight("PLUS0001", waw, iad));
        flightSet.add(new Flight("PLPL0002", krk, waw));
        flightSet.add(new Flight("PLPL0003", gdn, wmi));
        flightSet.add(new Flight("PLFR0001", krk, bva));
        flightSet.add(new Flight("FRUS0001", cdg, dca));
        flightSet.add(new Flight("USFR0001", dca, cdg));
        flightSet.add(new Flight("DEFR0001", sxf, ory));
        flightSet.add(new Flight("FRPL0001", ory, wmi));
        flightSet.add(new Flight("PLFR0002", wmi, ory));

        return flightSet;
    }
}
