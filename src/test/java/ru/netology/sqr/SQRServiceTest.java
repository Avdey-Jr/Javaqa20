package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource (value = {"range 0 - 99, 0, 99, 0",
            "range 100 - 10000, 100, 10000, 89",
            "range 200 - 300, 200, 300, 3"})

    void shouldComparisonOfSquaresOfTwoDigitNumbers(String testName, int minValue, int maxValue, int expected) {
        SQRService service = new SQRService();
        int actual = service.comparisonOfSquaresOfTwoDigitNumbers(minValue, maxValue);
        assertEquals(expected, actual);
    }
}