package interfaces;

public class Plane implements Vehicle {
    String wwwww;
    double yyy;

    public Plane() {
    }

    public Plane(String wwwww, double yyy) {
        this.wwwww = wwwww;
        this.yyy = yyy;
    }

    public String getWwwww() {
        return wwwww;
    }

    public void setWwwww(String wwwww) {
        this.wwwww = wwwww;
    }

    public double getYyy() {
        return yyy;
    }

    public void setYyy(double yyy) {
        this.yyy = yyy;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "wwwww='" + wwwww + '\'' +
                ", yyy=" + yyy +
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
