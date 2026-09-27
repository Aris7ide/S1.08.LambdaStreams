package com.service;

import com.model.Alumns;
import com.model.ListAlumnus;

import java.util.List;

public class Methods {

    public static void showAlumnsWithNamesAndAges() {
        ListAlumnus la = new ListAlumnus();
        List<Alumns> list = la.getListAlumnus();
        list.forEach(alumns -> System.out.println
                ("Nombre: " + alumns.getName() + "| Age: " + alumns.getAge()));
    }

    public static void showOnlyAlumnsThatStartsWithA() {
        ListAlumnus la = new ListAlumnus();
        List<Alumns> list = la.getListAlumnus();
        List<Alumns> newList = list.stream().filter(alumns -> alumns.getName().startsWith("A")).toList();
        newList.forEach(alumns -> System.out.println(alumns.getName()));
    }
}
