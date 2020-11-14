package anonymous;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Task:
 * Define and create 2 anonymous classes in the "main" method
 * by extending and implementing Utensil class, FoodCollector interface respectively.
 * 
 * Задание:
 * Определите и создайте 2 анонимных класса в "main" методе
 * путем расширения и реализации класса Utensil и интерфейса FoodCollector соответственно.
 */
public class AnonymousMain {
   public static void getUtensil(Utensil utensil) {
        return;
    }


    public static void main(String[] args) {

        FoodCollector foodCollector = new FoodCollector() {
            @Override
            public void collectFood() {
                System.out.println(" Somebody foodCollected");
            }

            @Override
            public String toString() {
                return "This is a food collecter object";
            }
        };
        foodCollector.collectFood();
        Utensil utensil = new Utensil(" spoon", "hungry") {
            @Override
            public String toString() { //нужно переопр метод toString
                return getName() + " " + getPurpose();
            }

            @Override
            public void use() {
                System.out.println("Hi Utensil");
            }
        };
        utensil.use();
        System.out.println(utensil);
        System.out.println(foodCollector); //выводит что то не то

        getUtensil(new Utensil("sdf", "sdfs") {
            @Override
            public void use() {

            }
        });

        Integer [] arr = {1,2 ,4 ,5};

        Arrays.sort(arr, (o1, o2) -> 0);

        // your code here
    }

}