package com.niantic.services;

import com.niantic.models.AssignmentStatistics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ReportService {

    public void createStudentSummaryReport (AssignmentStatistics statistics) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd");
        String fileName = "reports/" + today.format(formatter) + "_" + statistics.getStudentName().replace(" ", "_") + ".txt";


        File file = new File(fileName);
        try (PrintWriter out = new PrintWriter(file)) {
            out.println(statistics.getStudentName());
            out.println("-".repeat(30));

            out.printf("Low Score:        %d\n", statistics.getLowestScore());
            out.printf("High Score:       %d\n", statistics.getHighestScore());
            out.printf("Average Score:    %d\n", statistics.getAvgScore());

            out.println("-".repeat(30));
        } catch (FileNotFoundException e) {
            System.err.println("Error creating report file: " + e.getMessage());
        }
    }

    // create an "All Students" report
    public void createAllStudentsReport(int totalStudents, int totalAssignments, int lowScore, int highScore, double avgScore) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd");
        String fileName = "reports/" + today.format(formatter) + "_all_students.txt";

        File file = new File(fileName);
        try (PrintWriter out = new PrintWriter(file)) {
            out.println("All Assignments");
            out.println("-".repeat(60));

            // Total students and total assignments
            out.printf("Total Students                             %d\n", totalStudents);
            out.printf("Total Assignments                          %d\n", totalAssignments);
            out.println("-".repeat(60));

            // Lowest, highest, and average scores
            out.printf("Low Score                                  %d\n", lowScore);
            out.printf("High Score                                 %d\n", highScore);
            out.printf("Average Score                              %.2f\n", avgScore);

            out.println("-".repeat(60));

        } catch (FileNotFoundException e) {
            System.err.println("Error creating report file: " + e.getMessage());
        }
    }

}
