package com.number.conversion.validator;

public class UserInputValidator {
    private static final String INTEGER_NUMBER_PATTERN = "[0-9]+";
    private static final String ROMAN_NUMERALS_PATTERN = "^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$";

    public Boolean isUserInputValidInteger(String userInput) {
        return userInput.matches(INTEGER_NUMBER_PATTERN);
    }

    public Boolean isUserInputValidRomanNumber(String userInput) {
        return userInput.matches(ROMAN_NUMERALS_PATTERN);
    }
}
