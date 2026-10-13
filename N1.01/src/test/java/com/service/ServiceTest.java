package com.service;

import com.interfaces.PiValue;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ServiceTest {

    private final Service service = new Service();

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private final PrintStream standardOut = System.out;

    @Test
    void shouldGiveElementsWithO() {
        List<String> listString = Arrays.asList("boat","dog","cat","oven","orange");
        List<String> result = service.filterByO(listString);

        assertThat(result).isEqualTo(Arrays.asList("boat","dog","oven","orange"));
    }

    @Test
    void shouldGiveElementsWithOAndLongerThanFive() {
        List<String> listString = Arrays.asList("boat","dog","cat","oven","orange");
        List<String> result = service.filterByOAndNumber(listString);

        assertThat(result).isEqualTo(List.of("orange"));
    }

    @Test
    void shouldPrintMonthsWithLambda() {
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        List<String> listMonths = Arrays.asList("January","February","March","April","May","June","July","August","September","October","November","December");
        service.printWithLambda(listMonths);
        String resultadoImpreso = outputStreamCaptor.toString().trim();

        assertThat(resultadoImpreso)
                .contains("January" + System.lineSeparator() + "February" + System.lineSeparator() + "March"
                        + System.lineSeparator() + "April" + System.lineSeparator() + "May" + System.lineSeparator()
                        + "June" + System.lineSeparator() + "July" + System.lineSeparator() + "August"
                        + System.lineSeparator() + "September" + System.lineSeparator() + "October"
                        + System.lineSeparator() + "November" + System.lineSeparator() + "December");

        System.setOut(standardOut);
    }

    @Test
    void shouldPrintMonthsWithMethod() {
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        List<String> listMonths = Arrays.asList("January","February","March","April","May","June","July","August","September","October","November","December");
        service.printWithMethod(listMonths);
        String resultadoImpreso = outputStreamCaptor.toString().trim();

        assertThat(resultadoImpreso)
                .contains("January" + System.lineSeparator() + "February" + System.lineSeparator() + "March"
                        + System.lineSeparator() + "April" + System.lineSeparator() + "May" + System.lineSeparator()
                        + "June" + System.lineSeparator() + "July" + System.lineSeparator() + "August"
                        + System.lineSeparator() + "September" + System.lineSeparator() + "October"
                        + System.lineSeparator() + "November" + System.lineSeparator() + "December");

        System.setOut(standardOut);
    }

    @Test
    void shouldReturnDouble() {
        PiValue pi = () -> 3.1415;
        PiValue result = service.piValue(pi);
        assertThat(result.getPiValue()).isEqualTo(3.1415);
    }

    @Test
    void shouldSortByLength() {
        List<Object> mixedList = Arrays.asList(23,3,"house", "boat",345, "trampoline");

        List<Object> sortedMixedList = service.sortByLength(mixedList);

        assertThat(sortedMixedList).containsExactly(3,23,345,"boat","house","trampoline");
    }

    @Test
    void shouldSortByLengthReversed() {
        List<Object> mixedList = Arrays.asList(23,3,"house", "boat",345, "trampoline");

        List<Object> sortedMixedList = service.sortByLengthReversed(mixedList);

        assertThat(sortedMixedList).containsExactly("trampoline","house","boat",345,23,3);
    }

    @Test
    void shouldReverseString() {
        String result = service.reverse("boat");
        assertThat(result).isEqualTo("taob");
    }

}