package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
//        Given
        World world = new World();
        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent africa = new Continent("Africa");
        Continent northAmerica = new Continent("North America");
        Continent southAmerica = new Continent("South America");
        Continent australia = new Continent("Australia");
        Continent antarctica = new Continent("Antarctica");

        europe.addCountry(new Country("Poland", new BigDecimal("38000000")));
        europe.addCountry(new Country("Germany", new BigDecimal("79500000")));
        europe.addCountry(new Country("Great Britain", new BigDecimal("55000000")));

        asia.addCountry(new Country("China", new BigDecimal("1254943000")));
        asia.addCountry(new Country("Japan", new BigDecimal("75976000")));
        asia.addCountry(new Country("India", new BigDecimal("1067432000")));

        africa.addCountry(new Country("Egypt", new BigDecimal("71200000")));
        africa.addCountry(new Country("Morocco", new BigDecimal("32000500")));
        africa.addCountry(new Country("Nigeria", new BigDecimal("65000120")));

        northAmerica.addCountry(new Country("USA", new BigDecimal("285900000")));
        northAmerica.addCountry(new Country("Canada", new BigDecimal("40000000")));

        southAmerica.addCountry(new Country("Brazil", new BigDecimal("550000000")));
        southAmerica.addCountry(new Country("Argentina", new BigDecimal("45000000")));

        australia.addCountry(new Country("Australia", new BigDecimal("70000000")));

        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);
        world.addContinent(northAmerica);
        world.addContinent(southAmerica);
        world.addContinent(australia);
        world.addContinent(antarctica);

//        When
        BigDecimal resultPopulation = world.getPeopleQuantity();

//        Then
        BigDecimal expected = new BigDecimal("3729951620");
        Assert.assertEquals(expected, resultPopulation);
    }
}
