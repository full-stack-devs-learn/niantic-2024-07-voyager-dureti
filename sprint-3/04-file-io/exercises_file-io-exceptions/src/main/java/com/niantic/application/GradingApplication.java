package com.niantic.application;

import com.niantic.models.Assignment;
import com.niantic.models.AssignmentStatistics;
import com.niantic.services.GradesFileService;
import com.niantic.services.GradesService;
import com.niantic.ui.UserInput;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GradingApplication implements Runnable {
    private GradesService gradesService = new GradesFileService();
    private final UserInput ui = new UserInput();

    public void run() {
        while (true) {
            int choice = UserInput.homeScreenSelection();
            switch (choice) {
                case 1:
                    displayAllFiles();
                    break;
                case 2:
                    displayFileScores();
                    break;
                case 3:
                    displayStudentAverages();
                    break;
                case 4:
                    displayAllStudentStatistics();
                    break;
                case 5:
                    displayAssignmentStatistics();
                    break;
                case 0:
                    UserInput.displayMessage("Goodbye");
                    System.exit(0);
                default:
                    UserInput.displayMessage("Please make a valid selection");
            }
        }
    }

    private void displayAllFiles() {
        // todo: 1 - get and display all student file names

        System.out.println();
        System.out.println("All Available Student Files: ");
        System.out.println();

        try {
            String[] fileNames = gradesService.getFileNames();

            if (fileNames != null && fileNames.length > 0) {
                for (String fileName : fileNames) {
                    System.out.println(fileName);
                }
            } else {
                System.out.println("No files found.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving file names: " + e.getMessage());
        }
    }

    private void displayFileScores() {
        // todo: 2 - allow the user to select a file name
        // Get all file names from the GradesService

        String[] fileNames = gradesService.getFileNames();

        if (fileNames != null && fileNames.length > 0)
        {
            System.out.println("Select a file by entering its number:");
            for (int i = 0; i < fileNames.length; i++)
            {
                System.out.println((i + 1) + ") " + fileNames[i]);
            }

            int choice = ui.getIntInput("Enter the number corresponding to the file: ") - 1;

            if (choice >= 0 && choice < fileNames.length)
            {
                String selectedFile = fileNames[choice];

                List<Assignment> assignments = gradesService.getAssignments(selectedFile);

                if (!assignments.isEmpty())
                {
                    for (Assignment assignment : assignments)
                    {
                        System.out.println(assignment);
                    }
                }
                else
                {
                    System.out.println("No assignments found for this student.");
                }
            }
            else
            {
                System.out.println("Invalid selection. Please try again.");
            }
        }
        else
        {
            System.out.println("No files available to select.");
        }
    }

    private void displayStudentAverages()
    {
        // todo: 3 - allow the user to select a file name
        // load all student assignment scores from the file - display student statistics (low score, high score, average score)

    }

    private void displayAllStudentStatistics()
    {
        // todo: 4 - Optional / Challenge - load all scores from all student and all assignments
        // display the statistics for all scores (low score, high score, average score, number of students, number of assignments)
    }

    private void displayAssignmentStatistics()
    {
        // todo: 5 - Optional / Challenge - load all scores from all student and all assignments
        // display the statistics for each assignment (assignment name, low score, high score, average score)
        // this one could take some time
    }

    private String parseStudentName(String fileName)
    {
        return fileName.replace(".csv", "")
                        .replace("_", " ")
                        .substring(10);
    }
}
