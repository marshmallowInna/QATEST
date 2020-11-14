package inner;

/**
 * Task:
 * Add more functionality in OuterClass, InnerClass classes.
 * Then, in the "main" method create several instances of InnerClass class.
 * 
 * Задание:
 * Добавьте больше функциональности в классы OuterClass, InnerClass.
 * Затем в "main" методе создайте несколько экземпляров класса InnerClass.
 */
public class OuterClass {
    private String field1;
    private String number;
   // private static String field2 =" static";

    public OuterClass(String field1, String number) {
        this.field1 = field1;
        this.number = number;
    }

    @Override
    public String toString() {
        return "OuterClass{" +
                "field1='" + field1 + '\'' +
                ", number='" + number + '\'' +
                ", x=" + x +
                '}';
    }

  /* static class StaticNestedClass { // static nested class
        public void run(){
            System.out.println(" StaticNestedClass is running" + field2);
        }
    }*/

    // add some class members here
    final int x = 100; //const create oonly in  this method
    class InnerClass { // can access static and non static members of the enclosing class, this class non static
       private String field3;

        public InnerClass(String field3) {
            this.field3 = field3;
        }

        void show() {
            System.out.println(OuterClass.this.field1 + " "+ field3);
            System.out.println(x);
            System.out.println(" Hi from InnerClassConstr");
        }
        // add some members here
        
        public String getField1() {
            return field1;
        }
    }
    void displayInner(){ //access to inner class from method
        InnerClass inner = new InnerClass(" lllll");
        inner.show();
        inner.getField1();
    }
    
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass(" aaa","777");// create outerclass
        System.out.println(outerClass.toString());
       OuterClass.InnerClass innerClass = outerClass.new InnerClass("gggg");// create inner class
        outerClass.displayInner();
        System.out.println(innerClass.getField1());




    }

        // your code here
    }


