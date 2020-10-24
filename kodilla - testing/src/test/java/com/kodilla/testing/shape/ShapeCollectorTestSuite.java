package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is beginning of tests");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All test finished");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("This is the " + testCounter + " test");
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector testList = new ShapeCollector(new ArrayList<>(Arrays.asList(
                new Circle(34),
                new Triangle(10, 22))));
        ShapeCollector expectedList = new ShapeCollector(new ArrayList<>(Arrays.asList(
                new Circle(34),
                new Triangle(10, 22),
                new Square(40))));
        int expectedListSize = expectedList.getShapeList().size();
        //When
        testList.addFigure(new Square(12));
        int actualListSize = testList.getShapeList().size();

        //Then
        Assert.assertEquals(expectedListSize, actualListSize);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        Circle circle = new Circle(34);
        Triangle triangle = new Triangle(10, 22);
        Square square = new Square(40);

        ShapeCollector testList = new ShapeCollector(new ArrayList<>(Arrays.asList(
                circle, triangle, square)));

        ShapeCollector expectedList = new ShapeCollector(new ArrayList<>(Arrays.asList(
                circle, triangle)));

        int expectedListSize = expectedList.getShapeList().size();
        //When
        testList.removeFigure(square);
        int actualListSize = testList.getShapeList().size();

        //Then
        Assert.assertEquals(expectedListSize, actualListSize);


    }
    @Test
    public void testGetFigure() {
        //Given
        Circle circle = new Circle(34);
        Triangle triangle = new Triangle(10, 20);
        Square square = new Square(40);

        ShapeCollector testList = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(
                circle, triangle, square)));


        //When
        Shape shape = testList.getFigure(-3);

        //Then
        Assert.assertEquals(triangle,shape);

    }
    @Test
    public void testShowFigures() {
        //Given
        Circle circle = new Circle(23);
        Triangle triangle = new Triangle(12, 18);
        Square square = new Square(12);
        ArrayList<Shape> testList=new ArrayList<Shape>(Arrays.asList(
                circle, triangle, square));
        ShapeCollector shapesCollection = new ShapeCollector(testList);

        //When



        //Then
        Assert.assertEquals(testList,shapesCollection.showFigures());
    }
}


