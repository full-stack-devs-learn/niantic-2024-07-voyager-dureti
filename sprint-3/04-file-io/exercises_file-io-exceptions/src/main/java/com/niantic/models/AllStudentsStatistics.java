package com.niantic.models;

import java.util.List;
import java.util.stream.Collectors;

public class AllStudentsStatistics
{

    private List<Assignment> allAssignments;
    private int totalStudents;

    public AllStudentsStatistics(List<Assignment> allAssignments, int totalStudents) {
        this.allAssignments = allAssignments;
        this.totalStudents = totalStudents;
    }

    public int getTotalStudents() {
        return totalStudents;
    }

    public int getTotalAssignments() {
        return allAssignments.size();
    }

    // lowest score across all students' assignments
    public int getLowestScore() {
        return allAssignments.stream()
                .map(Assignment::getScore)
                .reduce(Integer::min)
                .orElse(0);
    }

    // highest score across all students' assignments
    public int getHighestScore() {
        return allAssignments.stream()
                .map(Assignment::getScore)
                .reduce(Integer::max)
                .orElse(0);
    }

    // average score across all students' assignments
    public double getAvgScore() {
        return allAssignments.isEmpty() ? 0.0 : allAssignments.stream()
                .map(Assignment::getScore)
                .collect(Collectors.averagingInt(Integer::intValue));
    }
}
