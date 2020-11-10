package polymorphism;

public class Bird extends Animal {
   // private int age;

    public Bird() {
    }

    public Bird(String name ) {
        super(name);
    }



    @Override
    public void move() {
        System.out.println("Bird can move");
        
    }

    @Override
    public void makeSound() {
        System.out.println("Bird can makeSound");

    }

    @Override
    public void eat() {
        System.out.println("Bird can eat ");

    }

    @Override
    public String toString() {
        return "Bird{" +
                '}';
    }
}
