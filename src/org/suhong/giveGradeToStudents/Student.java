package org.suhong.giveGradeToStudents;

public class Student {

    String name;
    int score;
    String grade;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String toString() {
        return String.format("%13s:%3d점 -> %s", name, score, grade);
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

}
