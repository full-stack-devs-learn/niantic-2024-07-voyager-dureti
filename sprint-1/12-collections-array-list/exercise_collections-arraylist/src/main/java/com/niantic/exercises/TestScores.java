package com.niantic.exercises;

import com.niantic.models.TestScore;

import java.awt.image.TileObserver;
import java.util.ArrayList;


public class TestScores
{

    /*
    1.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores and the name of a test - return all scores for the
        requested tests.
     */
    public ArrayList<TestScore> getScoresByTest(ArrayList<TestScore> testScores, String testName)

    {
        // Create a new ArrayList to hold the scores for the specified test
        ArrayList<TestScore> scoresByTest = new ArrayList<>();

        // Iterate over each TestScore object in the testScores list
        for (TestScore score : testScores) {
            // Check if the current TestScore's test name matches the specified test name
            if (score.getTestName().equals(testName)) {
                // If it matches, add the current TestScore to the scoresByTest list
                scoresByTest.add(score);
            }
        }

        // Return the list of scores for the specified test
        return scoresByTest;

    }

    /*
    2.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores and the name of a student - return all scores for the
        requested student.
     */
    public ArrayList<TestScore> getScoresByStudent(ArrayList<TestScore> testScores, String student)
    {
        // Create a new ArrayList to hold the scores for the specified student
        ArrayList<TestScore> scoresByStudent = new ArrayList<>();

        // Iterate over each TestScore object in the testScores list
        for (TestScore score : testScores) {
            // Check if the current TestScore's student name matches the specified student name
            if (score.getStudentName().equals(student)) {
                // If it matches, add the current TestScore to the scoresByStudent list
                scoresByStudent.add(score);
            }
        }

        // Return the list of scores for the specified student
        return scoresByStudent;
    }

    /*
    3.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores return the highest score.
     */
    public int getHighestScore(ArrayList<TestScore> testScores)
    {
        // Initialize to the lowest possible integer value
        int highestScore = Integer.MIN_VALUE;

        // Iterate over each TestScore object in the testScores list
        for (TestScore score : testScores) {
            // Check if the current TestScore's score is higher than the current highestScore
            if (score.getScore() > highestScore) {
                // If it is, update highestScore to the current TestScore's score
                highestScore = score.getScore();
            }
        }

        // Return the highest score found in the list
        return highestScore;
    }

    /*
    4.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores return the lowest score.
     */
    public int getLowestScore(ArrayList<TestScore> testScores)
    {
        // Initialize to the highest possible integer value
        int lowestScore = Integer.MAX_VALUE;

        // Iterate over each TestScore object in the testScores list
        for (TestScore score : testScores) {
            // Check if the current TestScore's score is lower than the current lowestScore
            if (score.getScore() < lowestScore) {
                // If it is, update lowestScore to the current TestScore's score
                lowestScore = score.getScore();
            }
        }

        // Return the lowest score found in the list
        return lowestScore;
    }

    /*
    5.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores return the average score.
     */
    public int getAverageScore(ArrayList<TestScore> testScores) {
        // Initialize the totalTestScore to 0
        int totalTestScore = 0;

        // Iterate over each TestScore object in the testScores list
        for (var score : testScores) {
            // Add the current TestScore's score to the totalTestScore
            totalTestScore += score.getScore();
        }

        // Calculate the average score by dividing the totalTestScore by the number of scores
        double averageOfAllTestScore = (double) totalTestScore / testScores.size();

        // Return the average score as an integer
        return (int) averageOfAllTestScore;
    }

    /*
    6.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores return the highest score for the specified test name.
     */
    public int getHighestScoreByTest(ArrayList<TestScore> testScores, String testName)
    {
        // get test score by test name
        var highScoreByTest = getScoresByTest(testScores, testName);

        // calculate the highest score
        return getHighestScore(highScoreByTest);
    }

    /*
    7.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores return the lowest score for the specified test name.
     */
    public int getLowestScoreByTest(ArrayList<TestScore> testScores, String testName)
    {
        // get test score by test name
        var lowScoreByTest = getScoresByTest(testScores, testName);

        // calculate the lowest score
        return getLowestScore(lowScoreByTest);
    }

    /*
    8.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores return the average score for the specified test name.
     */
    public int getAverageScoreByTest(ArrayList<TestScore> testScores, String testName)
    {
        // get test score by test name
        var averageScoreByTest = getScoresByTest(testScores, testName);

        // calculate the average score
        return getAverageScore(averageScoreByTest);
    }

    /*
    9.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores return the highest score for the specified student.
     */
    public int getHighestScoreByStudent(ArrayList<TestScore> testScores, String student)
    {
        // get test score by student
        var highScoreByStudent = getScoresByStudent(testScores, student);

        // calculate the highest score by student
        return getHighestScore(highScoreByStudent);
    }

    /*
    10.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores return the lowest score for the specified student.
     */
    public int getLowestScoreByStudent(ArrayList<TestScore> testScores, String student)
    {
        // get score by student
        var lowScoreByStudent = getScoresByStudent(testScores, student);

        // calculate the lowest score by student
        return getLowestScore(lowScoreByStudent);
    }

    /*
    11.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores return the average score for the specified student.
     */
    public int getAverageScoreByStudent(ArrayList<TestScore> testScores, String student)
    {
        // get score by student
        var averageScoreByStudent = getScoresByStudent(testScores, student);

        // calculate the average score by student
        return getAverageScore(averageScoreByStudent);
    }
}
