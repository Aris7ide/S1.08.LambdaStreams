package com.main;

import com.interfaces.PiValue;
import com.interfaces.StringInverter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {
    static void main(String[] args) {

        //todo crea un test por cada ejercicio

        // EJERCICIO 1
        List<String> listString = Arrays.asList("boat","dog","cat","oven","orange");

        String message = listString.stream()
                .filter(elemento -> elemento.startsWith("o"))
                .collect(Collectors.joining(","));

        System.out.println(message);

        //EJERCICIO 2
        List<String> result = listString.stream()
                .filter(elemento -> elemento.startsWith("o"))
                .filter(elemento -> elemento.length() > 4)
                .toList();

        System.out.println(result);

        // EJERCICIOS 3/4
        List<String> listMonths = Arrays.asList("January","February","March","April","May","June","July","August","September","October","November","December");
        listMonths.forEach(System.out::println);

        //EJERCICIO 5
        PiValue pi = () -> 3.1415;
        System.out.println(pi.getPiValue());

        //EJERCICIOS 6/7
        List<Object> mixedList = Arrays.asList(23,3,"house", "boat",345, "trampoline");
        System.out.println(mixedList.stream()
                .sorted(Comparator.comparing(ob -> String.valueOf(ob).length()).reversed())
                .toList());

        //EJERCICIO 8
        StringInverter inverter = text -> new StringBuilder(text).reverse().toString();
        System.out.println(inverter.reverse("Reverse this"));
    }
}
