package polymorphism;

public class Primate extends Mammal {
    public Primate(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(" Class Primate move");
        
    }

    @Override
    public void makeSound() {
        System.out.println(" Class Primate makeSound ");

    }

    @Override
    public void eat() {
        System.out.println(" Class Primate eat");
    }

}
