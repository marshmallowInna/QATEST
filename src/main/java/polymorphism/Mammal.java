package polymorphism;

public abstract class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    public Mammal() {
    }
    @Override
    public void move() {
        System.out.println("Class Mammal move");

    }

    @Override
    public void makeSound() {
        System.out.println("Class Mammal makeSound");
    }

    @Override
    public void eat() {
        System.out.println(" Class Mammal eat");

    }
}



