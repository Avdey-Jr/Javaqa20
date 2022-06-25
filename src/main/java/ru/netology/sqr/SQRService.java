package ru.netology.sqr;

public class SQRService {
    public int comparisonOfSquaresOfTwoDigitNumbers(int minValue, int maxValue) {
        int totalMatchingNumbers = 0;
        for (int cycle = 10; cycle < 99; cycle++) {
            int squareNumber = cycle * cycle;
            if (squareNumber >= minValue && squareNumber <= maxValue) {
                totalMatchingNumbers++;
            }
        }
        return (totalMatchingNumbers);
    }
}

