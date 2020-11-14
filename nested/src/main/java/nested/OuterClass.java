package nested;

/**
 * Task:
 * Add more functionality in OuterClass, NestedClass classes.
 * Try to use non-static fields of OuterClass class in NestedClass class.
 * Also, try to use static fields of Outer class in NestedClass class.
 * Then, in the "main" method create several instances of NestedClass class.
 *
 * Задание:
 * Добавьте больше функциональности в классы OuterClass, NestedClass.
 * Попробуйте использовать нестатические поля класса OuterClass в классе NestedClass.
 * Также попробуйте использовать статические поля OuterClass класса в классе NestedClass.
 * Затем в "main" методе создайте несколько экземпляров класса NestedClass.
 */
public class OuterClass {
    private String field1;
    private static String staticField1;
    private int IntField;
    // add some class members here

    static class InnerClass { // static nested class
        public void run() {
            System.out.println(" InnerClass is running" + staticField1);

            // add some members here
        }

    }

    @Override
    public String toString() {
        return "OuterClass{" +
                "field1='" + field1 + '\'' +
                ", IntField=" + IntField +
                '}';
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        System.out.println(outerClass.toString());
        innerClass.run();
        // your code here
    }
}
