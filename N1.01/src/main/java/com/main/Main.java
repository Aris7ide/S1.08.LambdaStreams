package com.main;

import java.util.Arrays;
import java.util.List;

public class Main {
    static void main(String[] args) {

        List<String> listString = Arrays.asList("boat","dog","cat","oven","orange");

        System.out.println(listString.stream().filter(elemento -> elemento.startsWith("o")).toList());

        List<String> result = listString.stream()
                .filter(elemento -> elemento.startsWith("o"))
                .filter(elemento -> elemento.length() == 4)
                .toList();

        System.out.println(result);

        List<String> listMonths = Arrays.asList("January","February","March","April","May","June","July","August","September","October","November","December");
        listMonths.forEach(System.out::println);

    }
}
