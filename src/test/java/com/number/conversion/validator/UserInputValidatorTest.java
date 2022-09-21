package com.number.conversion.validator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserInputValidatorTest {
    private UserInputValidator userInputValidator;

    @BeforeEach
    public void setup() {
        this.userInputValidator = new UserInputValidator();
    }

    @Test
    public void shouldReturnTrueIfTheGivenIntegerNumberIsValid() {
        // Given
        String userInput = "1002";

        // When
        Boolean userInputValidInteger = userInputValidator.isUserInputValidInteger(userInput);

        // Then
        assertTrue(userInputValidInteger);
    }

    @Test
    public void shouldReturnFalseIfTheGivenIntegerIsNotValid() {
        // Given
        String userInput = "1002a";

        // When
        Boolean userInputNotValidInteger = userInputValidator.isUserInputValidInteger(userInput);

        // Then
        assertFalse(userInputNotValidInteger);
    }

    @Test
    public void shouldReturnTrueIfTheGivenRomanNumberIsValid() {
        // Given
        String userInput = "CCXCIII";

        //When
        Boolean userInputValidRomanNumber = userInputValidator.isUserInputValidRomanNumber(userInput);

        // Then
        assertTrue(userInputValidRomanNumber);

    }

    @Test
    public void shouldReturnFalseIfTheGivenRomanNumberIsNotValid() {
        // Given
        String userInput = "CCXCIIAI";

        // When
        Boolean userInputNotValidRomanNumber = userInputValidator.isUserInputValidRomanNumber(userInput);

        // Then
        assertFalse(userInputNotValidRomanNumber);
    }


    @AfterEach
    public void tearDown() {
        userInputValidator = null;
    }
}
