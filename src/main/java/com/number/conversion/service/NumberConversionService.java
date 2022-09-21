package com.number.conversion.service;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class NumberConversionService {
    public static final List<Integer> intNumbers = List.of(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1);
    public static final List<String> romanLetters = List.of("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I");

    public String convertIntegerToRomanNumber(Integer intValue) {
        StringBuilder romanNumber = new StringBuilder();

        AtomicInteger atomicInteger = new AtomicInteger(intValue);

        Integer idx = 0;

        for (Integer intNumber : intNumbers) {
            while (intValue >= intNumber) {
                intValue -= intNumber;
                romanNumber.append(romanLetters.get(idx));
            }

            idx++;
        }

        return romanNumber.toString();
    }

    public Integer convertRomanNumberToIntegerNumber(String romanNumber) {
        // TODO: Method 2: Business logic to convert Roman number to Integer number.

        return 0;
    }
}
