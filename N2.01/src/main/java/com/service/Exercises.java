package com.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercises {

    public List<String> exerciseOneFilterNames(List<String> listNames) {
        return listNames.stream()
                .filter(name -> name.startsWith("A"))
                .filter(name -> name.length() == 3)
                .toList();
    }
}
