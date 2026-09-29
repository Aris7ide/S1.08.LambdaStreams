package com.main;

import com.interfaces.Operations;
import com.utils.Methods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    static void main(String[] args) {

        //EXERCISE 1
        List<String> listNames = Arrays.asList("Marco","Laura","Michele","Aristide","Martina","Ada","Gianluca","Ale");

        System.out.println(listNames.stream()
                .filter(name -> name.startsWith("A"))
                .filter(name -> name.length() == 3)
                .toList());

        //EXERCISE 2
        List<Integer> listNumbers = Arrays.asList(5,34,6,43,12,16,2,1);
        System.out.println(Methods.numbersWithCommas(listNumbers));

        //EXERCISE 3
        Operations add = Integer::sum;
        Operations minus = (a,b) -> a - b;
        Operations multiply = (a,b) -> a * b;
        Operations divide = (a,b) -> (float) a/b;

        int x = 10;
        int y = 4;

        System.out.println("Suma: " + add.operation(x, y));
        System.out.println("Resta: " + minus.operation(x,y));
        System.out.println("Multiplicaciòn " + multiply.operation(x,y));
        System.out.println("Division: " + divide.operation(x,y));

        //EXERCISE 4
        List<Object> mixedList = Arrays.asList(23,2,"Tree","universe",3,"love",980,"Michael Jackson","Elios");

        System.out.println(mixedList.stream()
                .sorted(Comparator.comparing
                        (e -> Character.toLowerCase(String.valueOf(e).charAt(0))))
                .toList());

        System.out.println(mixedList.stream()
                .sorted(Comparator.comparing
                        (e -> String.valueOf(e).toLowerCase().startsWith("e")).reversed())
                .toList());

        System.out.println(mixedList.stream()
                .map(e -> e.toString().replaceAll("e","4"))
                .toList());

        System.out.println(mixedList.stream()
                .filter(e -> e instanceof Integer)
                .toList());
    }
}
