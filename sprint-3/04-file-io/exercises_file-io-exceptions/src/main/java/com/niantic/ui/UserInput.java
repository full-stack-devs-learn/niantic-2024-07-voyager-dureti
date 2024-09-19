package com.niantic.ui;

import java.util.List;
import java.util.Scanner;

public class UserInput
{
    private final Scanner scanner = new Scanner(System.in);
    protected static Scanner in = new Scanner(System.in);

    public static int homeScreenSelection()
    {
        System.out.println();
        System.out.println("What do you want to do?");
        System.out.println("-".repeat(30));
        System.out.println();
        System.out.println("  1) Display files");
        System.out.println();
        System.out.println("  ------------ Individual File ------------");
        System.out.println("  2) Student: display all scores");
        System.out.println("  3) Student: display average score");
        System.out.println();
        System.out.println("  ------------ Report File ------------");
        System.out.println("  4) Student: create student summary report");
        System.out.println("  5) Student: create All Students Report");
        System.out.println();
        System.out.println("  ---------- Challenge All Files ----------");
        System.out.println("  6) All Students: display average score");
        System.out.println("  7) All Assignments: display average score");
        System.out.println();
        System.out.println("  0) Exit");

        System.out.println();
        System.out.print("Please make a selection: ");

        return Integer.parseInt(in.nextLine());
    }

    public static void displayMessage(String message)
    {
        System.out.println();
        System.out.println(message);
    }

    public String getStringInput(String message)
    {
        System.out.print(message);
        return scanner.nextLine();
    }

    public int getIntInput(String message)
    {
        return Integer.parseInt(getStringInput(message));
    }

    public void displayFiles(List<String> files) {
        System.out.println();
        int count = 0;
        for (var file : files) {
            System.out.println(++count + ") " + file);
        }
    }
}
