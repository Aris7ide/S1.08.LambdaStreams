package com.service;

import com.interfaces.PiValue;
import com.interfaces.StringInverter;

import java.util.Comparator;
import java.util.List;

public class Service {

    public List<String> filterByO(List<String> list) {
        return list.stream()
                .filter(elemento -> elemento.contains("o"))
                .toList();
    }

    public List<String> filterByOAndNumber(List<String> list) {
        return list.stream()
                .filter(elemento -> elemento.contains("o"))
                .filter(elemento -> elemento.length() > 5)
                .toList();
    }

    public void printWithLambda(List<String> list) {
        list.forEach(month -> System.out.println(month));
    }

    public void printWithMethod(List<String> list) {
        list.forEach(System.out::println);
    }

    public PiValue piValue(PiValue pi) {
        return pi;
    }

    public List<Object> sortByLength(List<Object> list) {
        return list.stream()
                .sorted(Comparator.comparing(ob -> String.valueOf(ob).length()))
                .toList();
    }

    public List<Object> sortByLengthReversed(List<Object> list) {
        return list.stream()
                .sorted(Comparator.comparing(ob -> String.valueOf(ob).length()).reversed())
                .toList();
    }

    public String reverse(String str) {
        StringInverter inverter = text -> new StringBuilder(text).reverse().toString();
        return inverter.reverse(str);
    }
}
