package com.number.conversion.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberConversionServiceTest {

    private NumberConversionService numberConversionService;

    @BeforeEach
    public void setup() {
        numberConversionService = new NumberConversionService();
    }

    @Test
    public void shouldReturnRomanNumberForTheGivenValidInteger() {
        // Given
        Integer intValue = 1002;

        String expectedRomanNumber = "MII";

        // When
        String romanNumber = numberConversionService.convertIntegerToRomanNumber(intValue);

        // Then
        assertEquals(expectedRomanNumber, romanNumber);
    }

    // TODO: Test4 : Test NumberConversionService.Method1 which converts Roman number to Integer number

    @AfterEach
    public void tearDown() {
        numberConversionService = null;
    }
}
