package com.utils;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {

    public static String numbersWithCommas(List<Integer> listNumbers) {
        return listNumbers.stream()
                .map(number -> (number % 2 == 0 ? "e" : "o") + number)
                .collect(Collectors.joining(","));
    }

}
