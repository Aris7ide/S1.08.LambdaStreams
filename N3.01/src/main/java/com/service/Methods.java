package com.service;

import com.model.Alumns;

import java.util.ArrayList;
import java.util.List;

public class Methods {

    //todo atributo lista dentro del Method
    //todo testear todo
    private List<Alumns> listAlumnus;

    public Methods(List<Alumns> listAlumnus) {
        this.listAlumnus = new ArrayList<>();
        Alumns alumn1 = new Alumns("Sofia", 20, "PHP", 8.5);
        Alumns alumn2 = new Alumns("Mateo", 22, "Data Science", 9.2);
        Alumns alumn3 = new Alumns("Lucia", 19, "JAVA", 4.8);
        Alumns alumn4 = new Alumns("Diego", 21, "PHP", 8.0);
        Alumns alumn5 = new Alumns("Elena", 23, "Artificial Intelligence", 9.6);
        Alumns alumn6 = new Alumns("Carlos", 21, "PHP", 8.9);
        Alumns alumn7 = new Alumns("Beatriz", 20, "Cybersecurity", 3.1);
        Alumns alumn8 = new Alumns("Gabriel", 24, "JAVA", 4.4);
    }

    public List<String> showAlumnsWithNamesAndAges() {
        return listAlumnus.stream()
                .map(alumns -> "Name: " + alumns.getName() + "\nAge: " + alumns.getAge())
                .toList();
    }

    public List<Alumns> showOnlyAlumnsThatStartsWithA() {
        return listAlumnus.stream()
                .filter(alumns -> alumns.getName().startsWith("A"))
                .toList();
    }

    public List<Alumns> showScoreMoreThanFive() {
        return listAlumnus.stream()
                .filter(alumns -> alumns.getScore() >= 5)
                .toList();
    }

    public List<Alumns> showScoreMoreThanFiveAndPHP() {

        return listAlumnus.stream()
                .filter(alumns -> alumns.getScore() >= 5)
                .filter(alumns -> !alumns.getCourse().equals("PHP"))
                .toList();
    }

    public List<Alumns> showJavaAndMajor() {

        return listAlumnus.stream()
                .filter(alumns -> alumns.getAge() >= 18)
                .filter(alumns -> alumns.getCourse().equals("JAVA"))
                .toList();
    }


}
