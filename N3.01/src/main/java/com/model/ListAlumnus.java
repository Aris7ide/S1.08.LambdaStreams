package com.model;

import java.util.ArrayList;
import java.util.List;

public class ListAlumnus {

    private List<Alumns> listAlumnus;

    public ListAlumnus() {
        this.listAlumnus = new ArrayList<>();

        Alumns alumn1 = new Alumns("Sofia", 20, "PHP", 8.5);
        Alumns alumn2 = new Alumns("Mateo", 22, "Data Science", 9.2);
        Alumns alumn3 = new Alumns("Lucia", 19, "JAVA", 4.8);
        Alumns alumn4 = new Alumns("Diego", 21, "PHP", 8.0);
        Alumns alumn5 = new Alumns("Elena", 23, "Artificial Intelligence", 9.6);
        Alumns alumn6 = new Alumns("Carlos", 21, "PHP", 8.9);
        Alumns alumn7 = new Alumns("Beatriz", 20, "Cybersecurity", 3.1);
        Alumns alumn8 = new Alumns("Gabriel", 24, "JAVA", 4.4);
        Alumns alumn9 = new Alumns("Valentina", 19, "Artificial Intelligence", 9.8);
        Alumns alumn10 = new Alumns("Aris", 22, "Computer Science", 8.2);

        this.listAlumnus.addAll(List.of(alumn10,alumn2,alumn3,alumn9,alumn4,alumn7,alumn6,alumn5,alumn8,alumn1));
    }

    public List<Alumns> getListAlumnus() {
        return listAlumnus;
    }
}
