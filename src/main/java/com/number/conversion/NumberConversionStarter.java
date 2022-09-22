package com.number.conversion;

import com.number.conversion.reader.UserInputReader;
import com.number.conversion.service.NumberConversionService;
import com.number.conversion.validator.UserInputValidator;

public class NumberConversionStarter {
    public static void main(String[] args) {
        UserInputValidator userInputValidator = new UserInputValidator();
        UserInputReader userInputReader = new UserInputReader(userInputValidator);

        NumberConversionService numberConversionService = new NumberConversionService();

        String resultRomanNumber = numberConversionService.convertIntegerToRomanNumber(userInputReader.readIntegerNumber());

        // System outs used just demo purpose
        System.out.println(String.format("Result (Roman Number) : %s", resultRomanNumber));

        Integer resultIntegerNumber = numberConversionService.convertRomanNumberToIntegerNumber(userInputReader.readRoamanNumber());

        // System outs used just demo purpose
        System.out.println(String.format("Result (Roman Number) : %s", resultIntegerNumber));

    }
}
