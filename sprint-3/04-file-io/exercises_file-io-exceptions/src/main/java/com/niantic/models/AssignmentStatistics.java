package com.niantic.models;

import java.util.List;
import java.util.stream.Collectors;

public class AssignmentStatistics {

    private String studentName;
    private List<Assignment> studentScores;

    public AssignmentStatistics(String studentName, List<Assignment> studentScores) {
        this.studentName = studentName;
        this.studentScores = studentScores;
    }

    public String getStudentName() {
        return studentName;
    }

    public List<Assignment> getStudentScores() {
        return studentScores;
    }

    public int getLowestScore() {
        return studentScores.stream()
                .map(Assignment::getScore)
                .reduce(Integer::min)
                .orElse(0);
    }

    public int getHighestScore() {
        return studentScores.stream()
                .map(Assignment::getScore)
                .reduce(Integer::max)
                .orElse(0);
    }

    public int getAvgScore() {
        return studentScores.isEmpty() ? 0 : studentScores.stream()
                .map(Assignment::getScore)
                .collect(Collectors.averagingInt(Integer::intValue))
                .intValue();
    }

}
