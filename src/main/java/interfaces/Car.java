package interfaces;

public class Car implements Vehicle {
    String model;
    double volume;

    public Car() {
    }

    public Car(String model, double volume) {
        this.model = model;
        this.volume = volume;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", volume=" + volume +
                '}';
    }

    @Override
    public void startEngine() {
        System.out.println(" Class Car startEngine");
    }

    @Override
    public void brake() {
        System.out.println(" Class Car brake");
    }

    @Override
    public void beep() {
        System.out.println("Class Car beep" );

    }
}