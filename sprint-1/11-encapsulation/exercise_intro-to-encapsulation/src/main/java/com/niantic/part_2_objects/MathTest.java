package com.niantic.part_2_objects;

public class MathTest {
    private int score;
    private int possiblePoints;
    private String studentName;


    public MathTest(int possiblePoints, String studentName) {
        this.possiblePoints = possiblePoints;
        this.studentName = studentName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getPossiblePoints() {
        return possiblePoints;
    }

    public String getStudentName() {
        return studentName;
    }
    public int getPercent() {
        double percent = (double) score / possiblePoints * 100;
        return (int) percent;
    }

    public String getLetterGrade() {
        double percent = getPercent();
        if (percent >= 90) {
            return "A";
        } else if (percent >= 80) {
            return "B";
        } else if (percent >= 70) {
            return "C";
        } else if (percent >= 60) {
            return "D";
        } else {
            return "F";
        }
    }


}
