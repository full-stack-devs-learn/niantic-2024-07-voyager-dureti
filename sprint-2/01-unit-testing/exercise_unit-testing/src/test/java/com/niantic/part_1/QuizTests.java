package com.niantic.part_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuizTests
{
    @Test
    public void getPercent_shouldReturn_correctPercentage_WhenScoreIsPositive_AndPossiblePointsIsPositive() {

        // arrange
        int possiblePoints = 100;
        String studentName = "John Doe";
        Quiz quiz = new Quiz(possiblePoints, studentName);
        quiz.setScore(80);
        int expected = 80;

        // act
        int actual = quiz.getPercent();

        // assert
        assertEquals(expected, actual, "Because getPercent() should return correct percentage when score and possiblePoints is positive");
    }
    @Test
    public void getPercent_shouldReturn_zeroWhenScoreIsZero()
    {
        // arrange
        int possiblePoints = 100;
        String studentName = "John Doe";
        Quiz quiz = new Quiz(possiblePoints, studentName);
        quiz.setScore(0);
        int expected = 0;

        // act
        int actual = quiz.getPercent();

        // assert
        assertEquals(expected, actual, "Because getPercent() should return zero when score is zero");
    }

    @Test
    public void getPercent_shouldReturn_zeroWhenScoreIsNegative()
    {
        // arrange
        int possiblePoints = 100;
        String studentName = "John Doe";
        Quiz quiz = new Quiz(possiblePoints, studentName);
        quiz.setScore(-10);
        int expected = 0;

        // act
        int actual = quiz.getPercent();

        // assert
        assertEquals(expected, actual, "Because getPercent() should return zero when score is less than 0");
    }

    @Test
    public void getPercent_shouldReturn_zeroWhenPossiblePointsIsNegative()
    {
        // arrange
        int possiblePoints = -80;
        String studentName = "John Doe";
        Quiz quiz = new Quiz(possiblePoints, studentName);
        quiz.setScore(50);
        int expected = 0;

        // act
        int actual = quiz.getPercent();

        // assert
        assertEquals(expected, actual, "Because getPercent() should return zero when possiblePoints is less than 0");
    }

    @Test
    public void getPercent_shouldReturn_zeroWhenPossiblePointsIsZero()
    {
        // since division by zero not allowed, checking to make sure my work is correct

        // arrange
        int possiblePoints = 0;
        String studentName = "John Doe";
        Quiz quiz = new Quiz(possiblePoints, studentName);
        quiz.setScore(0);
        int expected = 0;

        // act
        int actual = quiz.getPercent();

        // assert
        assertEquals(expected, actual, "Because getPercent() should return zero when possiblePoints is zero");
    }

    @Test
    public void getLetterGrade_shouldReturn_A_WhenPercentIs90_OrGreater() {
        // arrange
        int possiblePoints = 100;
        String studentName = "John Doe";
        Quiz quiz = new Quiz(possiblePoints, studentName);
        quiz.setScore(90);
        String expected = "A";

        // act
        String actual = quiz.getLetterGrade();

        // assert
        assertEquals(expected, actual, "Because getLetterGrade() should return 'A' when percent is 90 or greater");
    }

    @Test
    public void getLetterGrade_shouldReturn_B_WhenPercentIs80_OrGreater() {
        // arrange
        int possiblePoints = 100;
        String studentName = "John Doe";
        Quiz quiz = new Quiz(possiblePoints, studentName);
        quiz.setScore(80);
        String expected = "B";

        // act
        String actual = quiz.getLetterGrade();

        // assert
        assertEquals(expected, actual, "Because getLetterGrade() should return 'B' when percent is 80 or greater");
    }

    @Test
    public void getLetterGrade_shouldReturn_C_WhenPercentIs70_OrGreater() {
        // arrange
        int possiblePoints = 100;
        String studentName = "John Doe";
        Quiz quiz = new Quiz(possiblePoints, studentName);
        quiz.setScore(70);
        String expected = "C";

        // act
        String actual = quiz.getLetterGrade();

        // assert
        assertEquals(expected, actual, "Because getLetterGrade() should return 'C' when percent is 70 or greater");
    }

    @Test
    public void getLetterGrade_shouldReturn_D_WhenPercentIs60_OrGreater() {
        // arrange
        int possiblePoints = 100;
        String studentName = "John Doe";
        Quiz quiz = new Quiz(possiblePoints, studentName);
        quiz.setScore(60);
        String expected = "D";

        // act
        String actual = quiz.getLetterGrade();

        // assert
        assertEquals(expected, actual, "Because getLetterGrade() should return 'D' when percent is 60 or greater");
    }

    @Test
    public void getLetterGrade_shouldReturn_F_WhenPercentIsBelow60() {
        // arrange
        int possiblePoints = 100;
        String studentName = "John Doe";
        Quiz quiz = new Quiz(possiblePoints, studentName);
        quiz.setScore(51);
        String expected = "F";

        // act
        String actual = quiz.getLetterGrade();

        // assert
        assertEquals(expected, actual, "Because getLetterGrade() should return 'F' when percent is below 60");
    }
}