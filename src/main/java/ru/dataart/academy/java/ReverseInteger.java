package ru.dataart.academy.java;

public class ReverseInteger {
    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 12
     * -2,147,483,648 -> exception, error message
     */

    public int reverse(int inputNumber) {
        boolean negativeNumber = false;
        if (inputNumber < 0) {
            negativeNumber = true;
            inputNumber = Math.abs(inputNumber);
        }
        int reverseNumber = 0;
        while (inputNumber != 0) {
            int currentDigit = inputNumber % 10;
            reverseNumber = reverseNumber * 10 + currentDigit;
            inputNumber = inputNumber / 10;
        }
        return (negativeNumber) ? -reverseNumber : reverseNumber;
    }
}