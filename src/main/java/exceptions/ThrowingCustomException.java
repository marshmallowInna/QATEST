package io.github.valentyn.nahai.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Task:
 * Throw an exception of the IncorrectDataFormatException in the catch block
 * to create a new custom exceptional event.
 * 
 * Бросить исключение IncorrectDataFormatException в блоке catch
 * для создания новой особой исключительной ситуации.
 */
public class ThrowingCustomException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Are you a student? ");
            boolean isStudent = scanner.nextBoolean(); 
        } catch (InputMismatchException ex) {
            System.err.println("");
        } catch (IncorrectDataFormatException e){
            System.out.println(" input IncorrectDataFormatException");
            // you code here
        }
    }
}

class IncorrectDataFormatException extends RuntimeException {
    public IncorrectDataFormatException() {
        super();
    }
    
    public IncorrectDataFormatException(String additionalMessage) {
        super(additionalMessage);
    }
}
