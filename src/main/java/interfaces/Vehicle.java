package interfaces;

public interface Vehicle {
    void startEngine();
    void brake();
    void beep();

    
    default void repairEngine() {
        System.out.println("Call needed specialists to repair the engine.");
    }
}
