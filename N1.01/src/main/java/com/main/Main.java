package com.main;

import java.nio.file.FileSystemAlreadyExistsException;
import java.util.Arrays;
import java.util.List;

public class Main {
    static void main(String[] args) {

        List<String> listString = Arrays.asList("boat","dog","cat","oven");

        System.out.println(listString.stream().filter(elemento -> elemento.startsWith("o")));

    }
}
