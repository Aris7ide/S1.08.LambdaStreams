package com.main;

import com.utils.Methods;

import java.util.Arrays;
import java.util.List;

public class Main {
    static void main(String[] args) {

        //EXERCISE 1
        List<String> listNames = Arrays.asList("Marco","Laura","Michele","Aristide","Martina","Ada","Gianluca","Ale");

        System.out.println(listNames.stream().filter(name -> name.startsWith("A"))
                .filter(name -> name.length() == 3)
                .toList());

        //EXERCISE 2
        List<Integer> listNumbers = Arrays.asList(5,34,6,43,12,16,2,1);
        System.out.println(Methods.numbersWithCommas(listNumbers));

    }
}
