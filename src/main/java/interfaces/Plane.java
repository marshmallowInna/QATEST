package interfaces;

public class Plane implements Vehicle {
    String name;
    double age;

    public Plane() {
    }

    public Plane(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void startEngine() {
        System.out.println("Class Plane startEngine");
    }

    @Override
    public void brake() {
        System.out.println("Class Plane brake");
    }

    @Override
    public void beep() {
        System.out.println("Class Plane beep");
    }
}
