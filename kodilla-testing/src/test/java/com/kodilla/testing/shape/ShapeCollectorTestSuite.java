package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
//        Given
        Shape circle = new Circle(5.5); //radius as arg
        ShapeCollector shapes = new ShapeCollector();
//        When
        shapes.addFigure(circle);
//        Then
        Assert.assertEquals(circle, shapes.getFigure(0));
        Assert.assertEquals(1, shapes.getQuantity());
    }

    @Test
    public void testRemoveFigure() {
//        Given
        Shape square = new Square(3); //side length as arg
        ShapeCollector shapes = new ShapeCollector();
        shapes.addFigure(square);
//        When
        boolean removed = shapes.removeFigure(square);
//        Then
        Assert.assertTrue(removed);
        Assert.assertEquals(0, shapes.getQuantity());
    }

    @Test   // added after test validation by mentor
    public void testRemoveNotExistingFigure() {
//        Given
        Shape square = new Square(3);
        Shape triangle = new Triangle(4,3);
        ShapeCollector shapes = new ShapeCollector();
        shapes.addFigure(square);
//        When
        boolean removed = shapes.removeFigure(triangle);
//        Then
        Assert.assertFalse(removed);
        Assert.assertEquals(1, shapes.getQuantity());
    }

    @Test
    public void testGetFigure() {
//        Given
        Shape square = new Square(4);
        Shape triangle = new Triangle(4, 2.5); //base and height as args
        Shape circle = new Circle(8);
        ShapeCollector shapes = new ShapeCollector();
        shapes.addFigure(circle);
        shapes.addFigure(square);
        shapes.addFigure(triangle);
//        When
        Shape result = shapes.getFigure(2);
//        Then
        Assert.assertEquals(triangle, result);
    }

    @Test
    public void testGetFigureNegativeIndex() {
//        Given
        Shape square = new Square(6);
        Shape triangle = new Triangle(2, 6);
        Shape circle = new Circle(9);
        ShapeCollector shapes = new ShapeCollector();
        shapes.addFigure(circle);
        shapes.addFigure(square);
        shapes.addFigure(triangle);
//        When
        Shape result = shapes.getFigure(-2);
//        Then
        Assert.assertEquals(null, result);
    }

    @Test
    public void testGetFigureOutOfRangeIndex() {
//        Given
        Shape square = new Square(6);
        Shape triangle = new Triangle(2, 6);
        Shape circle = new Circle(9);

        ShapeCollector shapes = new ShapeCollector();
        shapes.addFigure(circle);
        shapes.addFigure(square);
        shapes.addFigure(triangle);
//        When
        Shape result = shapes.getFigure(3);
//        Then
        Assert.assertEquals(null, result);
    }

    @Test
    public void testShowFigures() {
//        Given
        Shape shape1 = new Square(4);
        Shape shape2 = new Triangle(4, 2.5);
        Shape shape3 = new Circle(8);
        Shape shape4 = new Square(8.4);
        ShapeCollector shapes = new ShapeCollector();
        shapes.addFigure(shape1);
        shapes.addFigure(shape2);
        shapes.addFigure(shape3);
        shapes.addFigure(shape4);

//        When
        String result = shapes.showFigures();

//        Then
        Assert.assertEquals("Square, Triangle, Circle, Square", result);
    }
}
