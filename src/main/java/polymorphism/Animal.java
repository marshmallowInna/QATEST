package polymorphism;

public abstract class Animal {
    private String name;


    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    public Animal(String name) {
        this.name = name;
    }
    
    public abstract void move();
    public abstract void makeSound();
    public abstract void eat();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
