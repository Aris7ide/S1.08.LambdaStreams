package com.service;

import java.util.Arrays;
import java.util.List;

public class Exercises {

    private List<String> listNames;

    public Exercises(List<String> listNames) {
        this.listNames = Arrays.asList("Marco","Laura","Michele","Aristide","Martina","Ada","Gianluca","Ale");
    }

    public List<String> getListNames() {
        return listNames;
    }

    public void setListNames(List<String> listNames) {
        this.listNames = listNames;
    }

    public void exerciseOne() {
        System.out.println(this.listNames.stream()
                .filter(name -> name.startsWith("A"))
                .filter(name -> name.length() == 3)
                .toList());
    }
}
