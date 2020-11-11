package polymorphism;

public class Predatory extends Mammal {
    public Predatory(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Class Predatory move");
    }

    @Override
    public void makeSound() {
        System.out.println("Class Predatory makeSound");
    }

    @Override
    public void eat() {
        System.out.println("Class Predatory eat");
    }

    @Override
    public String toString() {
        return "Predatory{} " + super.toString();
    }
}
