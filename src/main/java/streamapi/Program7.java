package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class Program7 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.addAll(Arrays.asList(new String[]{"Tom", "Sam", "Bob", "Alice"}));
        //
        boolean any = names.stream().anyMatch(s -> s.length() > 3);
        System.out.println(any); // true

        boolean all = names.stream().allMatch(s -> s.length() == 3);
        System.out.println(all);

        boolean none = names.stream().noneMatch(s -> s == "Bill");
        System.out.println(none);// true

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.addAll(Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));

        Optional<Integer> min = numbers.stream().min(Integer::compare);
        Optional<Integer> max = numbers.stream().max(Integer::compare);
        System.out.println(min.get());
        System.out.println(max.get());

        ArrayList<Phone7> phones = new ArrayList<Phone7>();
        phones.addAll(Arrays.asList(new Phone7[]{
                new Phone7("iPhone 8", 52000),
                new Phone7("Nokia 9", 35000),
                new Phone7("Samsung Galaxy S9", 48000),
                new Phone7("HTC U12", 36000)}));

        Phone7 min2 = phones.stream().min(Phone7::compare).get();
        Phone7 max2 = phones.stream().max(Phone7::compare).get();
        System.out.printf("MIN Name: %s Price: %d \n", min2.getName(), min2.getPrice());
        System.out.printf("MAX Name: %s Price: %d \n", max2.getName(), max2.getPrice());
    }
}
     class Phone7 {
        private String name;
        private int price;

        public Phone7(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public static int compare(Phone7 p1, Phone7 p2) {
            if (p1.getPrice() > p2.getPrice())
                return 1;
            return -1;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }
    }
