package polymorphism;

public class Fish extends Animal {
   // private String species;


    public Fish(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Class Fish move");
        
    }

    @Override
    public void makeSound() {
        System.out.println("Class Fish makeSound");
    }

    @Override
    public void eat() {
        System.out.println(" Class Fish eat");

    }
}
