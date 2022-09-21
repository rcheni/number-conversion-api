package com.number.conversion.reader;

import com.number.conversion.validator.UserInputValidator;

import java.util.Scanner;

public class UserInputReader {
    private static final Integer ZERO = 0;
    private static final String EMPTY = "";
    private UserInputValidator userInputValidator;

    public UserInputReader(UserInputValidator userInputValidator) {
        this.userInputValidator = userInputValidator;
    }
    public Integer readIntegerNumber() {

        Scanner sc = new Scanner(System.in);

        // Used System outs just for demo purpose.
        System.out.print("Enter a Integer number: ");



        String userInput = sc.nextLine();

        if(userInputValidator.isUserInputValidInteger(userInput)) {
            return Integer.valueOf(userInput);
        }

        // System outs used just for demo purpose | loggers should go here.
        System.out.println(String.format("\"%s\" is not a valid Integer number", userInput));

        return ZERO;
    }

    public String readRoamanNumber() {
        // Used System outs just for demo purpose.
        System.out.print("Enter a Roman number: ");

        Scanner sc = new Scanner(System.in);

        String userInput = sc.nextLine();

        if(userInputValidator.isUserInputValidRomanNumber(userInput)) {
            return userInput;
        }

        // System outs used just for demo purpose | loggers should go here.
        System.out.println(String.format("\"%s\" is not a valid Roman number", userInput));

        return EMPTY;
    }
}
