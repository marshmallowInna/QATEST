package interfaces;

public class Boat implements Vehicle {
   private String color;
   private int massBoat;

   public Boat() {
   }

   public Boat(String color, int massBoat) {
      this.color = color;
      this.massBoat = massBoat;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public int getMassBoat() {
      return massBoat;
   }

   public void setMassBoat(int massBoat) {
      this.massBoat = massBoat;
   }

   @Override
   public String toString() {
      return "Boat{" +
              "color='" + color + '\'' +
              ", massBoat=" + massBoat +
              '}';
   }

   @Override
   public void startEngine() {
      System.out.println("Class Boat starEngine");

   }

   @Override
   public void brake() {
      System.out.println(" Class Boat brake");
   }

   @Override
   public void beep() {
      System.out.println("Class Boat beep");
   }
}

