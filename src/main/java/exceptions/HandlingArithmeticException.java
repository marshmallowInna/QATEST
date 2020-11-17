package exceptions;

/**
 * Task:
 * Handle a runtime exception to finish the program correctly.
 * Use the "try-catch" block.
 * 
 * Задача:
 * Обработка исключения времени выполнения для правильного завершения программы.
 * Используйте блок "try-catch".
 */
public class HandlingArithmeticException {
    public static void main(String[] args) {
        try {
            final int dividend = 6;
            final int divisor = 0;
            final int quotient = dividend / divisor;

            System.out.println("Quotient of " + dividend + " / " + divisor + " = " + quotient);
        } catch (ArithmeticException e){
            System.out.println(" Division by zero");
           // e.printStackTrace();

        }
        System.out.println(" after catch statement - end of the programm");
    }
}
