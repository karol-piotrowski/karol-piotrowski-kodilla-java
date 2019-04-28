package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        // When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        // When
        String description = pizzaOrder.getDescription();
        // Then
        assertEquals("Order a pizza with the following ingredients: tomato sauce, cheese", description);
    }

    @Test
    public void testPizzaOrderWithExtraCheeseGetCost() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        // When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        // Then
        assertEquals(new BigDecimal(17), calculatedCost);
    }

    @Test
    public void testPizzaOrderWithExtraCheeseGetDescription() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        // When
        String description = pizzaOrder.getDescription();
        // Then
        assertEquals("Order a pizza with the following ingredients: tomato sauce, cheese, extra cheese", description);
    }

    @Test
    public void testPizzaOrderWithExtraCheeseAndJalapenoGetCost() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new JalapenoDecorator(pizzaOrder);
        // When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        // Then
        assertEquals(new BigDecimal(18), calculatedCost);
    }

    @Test
    public void testPizzaOrderWithExtraCheeseAndJalapenoGetDescription() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new JalapenoDecorator(pizzaOrder);
        // When
        String description = pizzaOrder.getDescription();
        // Then
        assertEquals("Order a pizza with the following ingredients: tomato sauce, cheese, extra cheese, jalapeno", description);
    }

    @Test
    public void testPizzaOrderWithHamAndMushroomsGetCost() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        // When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        // Then
        assertEquals(new BigDecimal(20), calculatedCost);
    }

    @Test
    public void testPizzaOrderWithHamAndMushroomsGetDescription() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        // When
        String description = pizzaOrder.getDescription();
        // Then
        assertEquals("Order a pizza with the following ingredients: tomato sauce, cheese, ham, mushrooms", description);
    }

    @Test
    public void testPizzaOrderWithDoubleCheeseAndDoubleHamGetCost() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new HamDecorator(pizzaOrder);
        // When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        // Then
        assertEquals(new BigDecimal(23), calculatedCost);

    }

    @Test
    public void testPizzaOrderWithDoubleCheeseAndDounleHamGetDescription() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new HamDecorator(pizzaOrder);
        // When
        String description = pizzaOrder.getDescription();
        // Then
        assertEquals("Order a pizza with the following ingredients: tomato sauce, cheese, extra cheese, ham, ham", description);

    }
}
