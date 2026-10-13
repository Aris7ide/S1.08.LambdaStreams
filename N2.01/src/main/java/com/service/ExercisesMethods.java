package com.service;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ExercisesMethods {

    public List<String> exerciseOneFilterNames(List<String> listNames) {
        return listNames.stream()
                .filter(name -> name.startsWith("A"))
                .filter(name -> name.length() == 3)
                .toList();
    }

    public List<String> numbersWithCommas(List<Integer> listNumbers) {
        return listNumbers.stream()
                .map(number -> (number % 2 == 0 ? "e" : "o") + number)
                .toList();
    }

    public List<Object> sortByFirstChar(List<Object> objects) {
        return objects.stream()
                .sorted(Comparator.comparing
                        (e -> Character.toLowerCase(String.valueOf(e).charAt(0))))
                .toList();
    }

    public List<Object> sortByEFirst(List<Object> objects) {
        return objects.stream()
                .sorted(Comparator.comparing((Object e) -> {
                    String str = String.valueOf(e).toLowerCase();
                    return str.startsWith("e") ? 0 : 1;
                })).toList();
    }

    public List<String> replaceAWithFour(List<Object> objects) {
        return objects.stream()
                .map(e -> e.toString().toLowerCase().replaceAll("a","4"))
                .toList();
    }

    public List<Object> onlyShowNumbers(List<Object> objects) {
        return objects.stream()
                .filter(e -> {
                    if (e == null) {
                        return false;
                    }
                    if (e instanceof Number) {
                        return true;
                    }
                    if (e instanceof String str) {
                        try {
                            Double.parseDouble(str);
                            return true;
                        } catch (NumberFormatException ex) {
                            return false;
                        }
                    }
                    return false;
                })
                .toList();
    }
}
