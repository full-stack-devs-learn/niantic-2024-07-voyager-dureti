package com.niantic;

import java.util.Scanner;

public class Main {
    private static Scanner userInput = new Scanner(System.in);
    private static int[] scores = new int[0];

    public static void main(String[] args) {
        while (true) {
            int choice = getHomeSelection();

            switch (choice) {
                case 1:
                    createNewTestScores();
                    break;
                case 2:
                    calculateAverage();
                    break;
                case 3:
                    findHighestScore();
                    break;
                case 4:
                    findLowestScore();
                    break;
                case 5:
                    System.out.println("Thanks for playing!");
                    System.out.println("Good bye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid selection!");
                    break;
            }
        }
    }

    public static int getHomeSelection() {
        System.out.println();
        System.out.println("Welcome to <<Enter app name>>!");
        System.out.println("------------------------------");
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println("1) Enter new test scores");
        System.out.println("2) Calculate the class average");
        System.out.println("3) Find the highest score");
        System.out.println("4) Find the lowest score");
        System.out.println("0) Exit");

        System.out.print("Please select an option:");
        return Integer.parseInt(userInput.nextLine());
    }

    private static void createNewTestScores() {
        System.out.println("Enter code to create a new array and ask for test scores");


        // Ask the user for test scores
        System.out.print("Enter the number of test scores: ");
        int numberOfScores = Integer.parseInt(userInput.nextLine());

        // Create an array to store the test scores
        scores = new int[numberOfScores];

        // Prompt the user to enter each test score
        System.out.println(" Enter the test score: ");

        for (int i = 0; i < numberOfScores; i++) {
            System.out.print("Score " + (i + 1) + ": ");
            scores[i] = Integer.parseInt(userInput.nextLine());
        }

        // Display the entered test scores
        System.out.println("The entered test scores are:");
        for (int score : scores) {
            System.out.print(score + " ");
        }
    }

    private static void calculateAverage() {
        System.out.println("Add logic to calculate the average of all test scores, and display it");

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        // calculate average of all test score
        double scoreAverage = (double) sum / scores.length;
        System.out.println();

        // display the average of all scores
        System.out.println("Average of all test scores is: " + scoreAverage);
    }


    private static void findHighestScore()
    {
        System.out.println("Find the highest score of all tests and display it");

        int highestScore = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > highestScore) {
                highestScore = scores[i];
            }
        }
        System.out.println("The highest score is: " + highestScore);
    }

    private static void findLowestScore()
    {
        System.out.println("Find the lowest score of all tests and display it");

        int lowestScore = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < lowestScore) {
                lowestScore = scores[i];
            }
        }
        System.out.println("The lowest score is: " + lowestScore);
    }
}