package com.model;

public class Alumns {

    String name;
    int age;
    String course;
    double score;

    public Alumns(String name, int age, double score, String course) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
