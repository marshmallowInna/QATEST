package interfaces;

import org.openqa.selenium.json.JsonOutput;

/*
 * Task:
 * Implement methods of the Vehicle interface for each class.
 * You can modify the provided classes in any way.
 * Write examples using interfaces in the main method here.
 * Do not forget to assign newly created objects to the basic type reference and operate only with them.
 *
 * Задача:
 * Реализуйте методы интерфейса Vehicle для каждого класса.
 * Вы можете изменять предоставленные классы любым способом.
 * Напишите здесь примеры использования интерфейсов в main методе.
 * Не забывайте присваивать вновь создаваемые объекты cсылке базового типа и работать только с ними.
 */
public class InterfaceExamplesMain {
    public static void main(String[] args) {

        beep(new Boat());
        beep(new Car());
        beep(new Plane());
    }

    public static void beep(Vehicle vehicle) {
        vehicle.beep();
    }
    }

     /*   Boat b = new Boat("red",5000);
         b.beep();
        System.out.println(b);
        Car car = new Car("Tesla",4000);
        car.startEngine();
        System.out.println(car);
        Plane p = new Plane("МРIЯ",2019);
        p.beep();
        p.startEngine();
        p.brake();
        p.repairEngine();
        System.out.println(p);
    }
}*/
