package streamapi;

public class Phone {
    private String name;
    private int price;

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    /*public static int compare(Phone p1, Phone p2) {
        if (p1.getPrice() > p2.getPrice())
            return 1;
        return -1;
    }*/
    // public static void compare(Phone phone, Phone phone1) {
   // }
}