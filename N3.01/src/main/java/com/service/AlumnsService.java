package com.service;

import com.model.Alumns;

import java.util.ArrayList;
import java.util.List;

public class AlumnsService {

    private List<Alumns> listAlumnus;

    public AlumnsService() {
        Alumns alumn1 = new Alumns("Sofia", 20, "PHP", 8.5);
        Alumns alumn2 = new Alumns("Mateo", 22, "Data Science", 9.2);
        Alumns alumn3 = new Alumns("Diego", 21, "PHP", 8.0);
        Alumns alumn4 = new Alumns("Elena", 23, "Artificial Intelligence", 9.6);
        Alumns alumn5 = new Alumns("Carlos", 21, "PHP", 8.9);
        Alumns alumn6 = new Alumns("Beatriz", 20, "Cybersecurity", 3.1);
        Alumns alumn7 = new Alumns("Gabriel", 24, "JAVA", 4.4);
        Alumns alumn8 = new Alumns("Marta", 23, "PHP", 8.5);
        Alumns alumn9 = new Alumns("Gioia", 16, "JAVA", 8.0);
        Alumns alumn10 = new Alumns("Sofia", 21, "PHP", 3.5);
        listAlumnus = new ArrayList<>(List.of(alumn1,alumn2,alumn3,alumn4,alumn5,alumn6,alumn7,alumn8,alumn9,alumn10));
    }

    public List<String> showAlumnsWithNamesAndAges() {
        return listAlumnus.stream()
                .map(alumns -> "\n Name: " + alumns.getName() + ". Age: " + alumns.getAge())
                .toList();
    }

    public List<Alumns> showOnlyAlumnsThatStartsWithA(List<Alumns> listAlumnus) {
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
                .filter(alumns -> alumns.getCourse().equals("PHP"))
                .toList();
    }

    public List<Alumns> showJavaAndMajor() {
        return listAlumnus.stream()
                .filter(alumns -> alumns.getAge() >= 18)
                .filter(alumns -> alumns.getCourse().equals("JAVA"))
                .toList();
    }

    public List<Alumns> getListAlumnus() {
        return listAlumnus;
    }
}
