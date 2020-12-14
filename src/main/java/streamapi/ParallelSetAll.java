package streamapi;

import java.util.Arrays;

public class ParallelSetAll {
    public static void main(String[] args) {

        Phone[] phones = new Phone[]{new Phone("iPhone 8", 54000),
                new Phone("Pixel 2", 45000),
                new Phone("Samsung Galaxy S9", 40000),
                new Phone("Nokia 9", 32000)};

        Arrays.parallelSetAll(phones, i -> {
            phones[i].setPrice(phones[i].getPrice()-10000);
            return phones[i];
        });
        for(Phone p: phones)
            System.out.printf("%s - %d \n", p.getName(), p.getPrice());
        int[] numbers = initializeArray(6);
        for(int i: numbers)
            System.out.println(i);

    }
    public static int[] initializeArray(int size) {
        int[] values = new int[size];
        Arrays.parallelSetAll(values, i -> i*10);
        return values;
    }

class Phone7 {
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String val) {
        this.name = val;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int val) {
        this.price = val;
    }
}

}