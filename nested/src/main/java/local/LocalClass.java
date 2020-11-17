package local;

/**
 * Task:
 * Define a local class in the "getSumOfTwoNumbers" method.
 * Add some functionality in the newly created local class as it is described below in the comments.
 * Create an instance of it, invoke a method on a created object to get a sum.
 * In the "main" method, create an object of LocalClass and invoke the "getSumOfTwoNumbers" method to demonstrate using local classes in practice.
 * 
 * Задача:
 * Определите локальный класс в методе getSumOfTwoNumbers.
 * Добавьте некоторые функции во вновь созданный локальный класс, как это описано ниже в комментариях.
 * Создайте его экземпляр, вызовите метод для созданного объекта, чтобы получить сумму.
 * В "main" методе создайте объект LocalClass и вызовите метод «getSumOfTwoNumbers», чтобы продемонстрировать использование локальных классов на практике.
 */
public class LocalClass {
    private double firstNumber;
    private double secondNumber;

    LocalClass(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    @Override
    public String toString() {
        return "LocalClass{" +
                "firstNumber=" + firstNumber +
                ", secondNumber=" + secondNumber +
                '}';
    }

    public double getSumOfTwoNumbers(double secondNumber) {
        class SumOfTwoNumbers {
            double getSum() {
                return firstNumber + secondNumber;
            }
        }
        System.out.println(" getSumOf TwoNumber: " + (firstNumber + secondNumber));


        // define a local class that contains a "secondNumber" field
        // and getSum() method which calculates the sum of the firstNumber and secondNumber fields 

        // your code here
         return 0.0;

    }


    public static void main(String[] args) {
        LocalClass localClass = new LocalClass(55.5);
        localClass.getSumOfTwoNumbers(65.5);
        System.out.println(localClass.toString());



        // your code here
    }
}
