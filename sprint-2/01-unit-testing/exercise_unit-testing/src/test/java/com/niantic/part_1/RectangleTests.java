package com.niantic.part_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTests
{
    @Test
    public void  ParameterlessConstructor_ShouldCreateRectangleOfSize5x5()
    {
        // Arrange & Act
        Rectangle rectangle = new Rectangle();

        // Assert
        assertEquals(5, rectangle.width, "Width should be initialized to 5.");
        assertEquals(5, rectangle.height, "Height should be initialized to 5.");
        assertEquals(25, rectangle.width * rectangle.height, "The area should be 25 for a 5x5 rectangle.");
    }

    @Test
    public void area_shouldReturn_theProductOfWidthAndHeight() {
        // arrange
        int width = 4;
        int height = 5;
        int expected = 20;
        Rectangle rectangle = new Rectangle(width, height);

        // act
        int actual = rectangle.getArea();

        // assert
        assertEquals(expected, actual, "Because it should multiply 4 * 5");
    }

    @Test
    public void getArea_shouldReturn_zeroWhenWidthIsZero()
    {
        // arrange
        int width = 0;
        int height = 3;
        int expected = 0;

        Rectangle rectangle = new Rectangle(width, height);

        // act
        int actual = rectangle.getArea();

        // assert
        assertEquals(expected, actual, "getArea() should return zero when width is zero");
    }

    @Test
    public void getArea_shouldReturn_zeroWhenHeightIsZero()
    {
        // arrange
        int width = 5;
        int height = 0;
        int expected = 0;

        Rectangle rectangle = new Rectangle(width, height);

        // act
        int actual = rectangle.getArea();

        // assert
        assertEquals(expected, actual, "getArea() should return zero when height is zero");
    }

    @Test
    public void getArea_shouldReturn_zeroWhenWidthIsNegative()
    {
        // arrange
        int width = -10;
        int height = 5;
        int expected = 0;

        Rectangle rectangle = new Rectangle(width, height);

        // act
        int actual = rectangle.getArea();

        // assert
        assertEquals(expected, actual, "getArea() should return zero when width is negative number");
    }
    @Test
    public void getArea_shouldReturn_zeroWhenHeightIsNegative()
    {
        // arrange
        int width = 4;
        int height = -3;
        int expected = 0;

        Rectangle rectangle = new Rectangle(width, height);

        // act
        int actual = rectangle.getArea();

        // assert
        assertEquals(expected, actual, "getArea() should return zero when width is negative number");
    }

    @Test
    public void getPerimeter_shouldReturn_twoTimesTheSumOfWidthAndLength()
    {
        // arrange
        int width = 2;
        int height = 5;
        int expected = 14;

        Rectangle rectangle = new Rectangle(width, height);

        // act
        int actual = rectangle.getPerimeter();

        // assert
        assertEquals(expected, actual, "Because it should calculate 2 * (2 + 5)");
    }

    @Test
    public void getPerimeter_shouldReturn_zeroWhenWidthIsZero()
    {
        // arrange
        int width = 0;
        int height = 6;
        int expected = 0;
        Rectangle rectangle = new Rectangle(width, height);

        // act
        int actual = rectangle.getPerimeter();

        // assert
        assertEquals(expected, actual, "Because getPerimeter() should return zero when width zero");
    }

    @Test
    public void getPerimeter_shouldReturn_zeroWhenHeightIsZero()
    {
        // arrange
        int width = 3;
        int height = 0;
        int expected = 0;
        Rectangle rectangle = new Rectangle(width, height);

        // act
        int actual = rectangle.getPerimeter();

        // assert
        assertEquals(expected, actual, "Because getPerimeter() should return zero when height zero");
    }

    @Test
    public void getPerimeter_shouldReturn_zeroWhenWidthIsNegative()
    {
        // arrange
        int width = -2;
        int height = 4;
        int expected = 0;
        Rectangle rectangle = new Rectangle(width, height);

        // act
        int actual = rectangle.getPerimeter();

        // assert
        assertEquals(expected, actual, "Because getPerimeter() should return zero when width is negative");
    }

    @Test
    public void getPerimeter_shouldReturn_zeroWhenHeightIsNegative()
    {
        // arrange
        int width = 6;
        int height = -4;
        int expected = 0;
        Rectangle rectangle = new Rectangle(width, height);

        // act
        int actual = rectangle.getPerimeter();

        // assert
        assertEquals(expected, actual, "Because getPerimeter() should return zero when height is negative");
    }
}