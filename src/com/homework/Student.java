package com.homework;

import java.util.List;

public class Student {
    private final String firsName;
    private final String lastName;
    private final int course;
    List<Integer> ratingList;

    public Student(String firsName, String lastName, int course, List<Integer> ratingList) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.course = course;
        this.ratingList = ratingList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", course=" + course +
                '}';
    }

    public String getFirsName() {
        return firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getCourse() {
        return course;
    }

    public List<Integer> getRatingList() {
        return ratingList;
    }

}
