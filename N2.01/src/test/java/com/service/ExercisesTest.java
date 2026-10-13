package com.service;

import com.interfaces.Operations;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ExercisesTest {

    ExercisesMethods exercises = new ExercisesMethods();

    @Test
    void shouldFilterByLetterAndLength() {
        List<String> listNames = Arrays.asList("Marco","Laura","Michele","Aristide","Martina","Ada","Gianluca","Ale");

        assertThat(exercises.exerciseOneFilterNames(listNames)).containsExactly("Ada","Ale");
    }

    @Test
    void shouldSeparateEvenAndOddNumbers() {
        List<Integer> listNumbers = Arrays.asList(5,34,6,43,12,16,2,1);

        assertThat(exercises.numbersWithCommas(listNumbers)).containsExactly("o5","e34","e6","o43","e12","e16","e2","o1");
    }

    @Test
    void shouldBeAddition() {
        Operations add = (a,b)  -> a+b;
        float result = add.operation(10,20);
        assertThat(result).isEqualTo(30);
    }

    @Test
    void shouldBeSubtraction() {
        Operations sub = (a,b)  -> a-b;
        float result = sub.operation(30,20);
        assertThat(result).isEqualTo(10);
    }

    @Test
    void shouldBeMultiplication() {
        Operations multi = (a,b)  -> a*b;
        float result = multi.operation(3,20);
        assertThat(result).isEqualTo(60);
    }

    @Test
    void shouldBeDivision() {
        Operations div = (a,b)  -> a/b;
        float result = div.operation(60,3);
        assertThat(result).isEqualTo(20);
    }

    @Test
    void shouldSortByFirstChar() {
        List<Object> mixedList = Arrays.asList(23,2,"Tree","universe",3,"love",980,"Michael Jackson","Elios","23");

        assertThat(exercises.sortByFirstChar(mixedList)).containsExactly(23, 2, "23", 3, 980, "Elios", "love", "Michael Jackson", "Tree", "universe");
    }

    @Test
    void shouldSortEFirst() {
        List<Object> mixedList = Arrays.asList(23,2,"Tree","universe","Elios");
        List<Object> sorted = exercises.sortByEFirst(mixedList);
        assertThat(sorted.getFirst()).isEqualTo("Elios");
    }

    @Test
    void shouldReplaceAWithFour() {
        List<Object> mixedList = Arrays.asList(23,2,"Tree","Atom","Astronaut");
        assertThat(exercises.replaceAWithFour(mixedList)).containsExactly("23","2","tree","4tom","4stron4ut");
    }

    @Test
    void shouldOnlyShowNumbers() {
        List<Object> mixedList = Arrays.asList(23,2,"Tree","Atom","Astronaut","43");
        assertThat(exercises.onlyShowNumbers(mixedList)).containsExactly(23,2,"43");
    }



}