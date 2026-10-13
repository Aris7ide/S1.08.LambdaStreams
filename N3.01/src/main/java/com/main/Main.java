package com.main;

import com.service.AlumnsService;

public class Main {
    static void main(String[] args) {

        AlumnsService alumnsService = new AlumnsService();

        System.out.println(alumnsService.showAlumnsWithNamesAndAges());

    }
}
