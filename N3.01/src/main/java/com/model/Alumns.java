package com.model;

public class Alumns {

    private String name;
    private int age;
    private String course;
    private double score;

    public Alumns(String name, int age, String course, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public double getScore() {
        return score;
    }

}
