package com.number.conversion.validator;

public class UserInputValidator {
    private static final String INTEGER_NUMBER_PATTERN = "[0-9]+";

    public Boolean isUserInputValidInteger(String userInput) {
        return userInput.matches(INTEGER_NUMBER_PATTERN);
    }

    // TODO: Method 2 : Business logic to validate Roman number user input
}
