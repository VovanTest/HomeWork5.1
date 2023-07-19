package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class HollidayTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Holliday.csv")
    public void NumberHolliday(int income, int expenses, int threshold, int expected) {
        Holliday service = new Holliday();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);


    }
}

