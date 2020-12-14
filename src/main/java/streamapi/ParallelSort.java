package streamapi;

import java.util.Arrays;
import java.util.Comparator;

public class ParallelSort {
    public static void main(String[] args) {
        int[] nums = {30, -4, 5, 29, 7, -8};
        Arrays.parallelSort(nums);
        for (int num : nums)
            System.out.println(num);
        int[] numbers = {1,2,3,4,5,6};
        Arrays.parallelPrefix(numbers, (x, y) -> x * y);
        for (int number : numbers) {
            System.out.println(number);

        }

    Phone[] phones = new Phone[]{new Phone("iPhone 8", 54000),
            new Phone("Pixel 2", 45000),
            new Phone("Samsung Galaxy S9", 40000),
            new Phone("Nokia 9", 32000)};

        Arrays.parallelSort(phones,new PhoneComparator());

         for(Phone p: phones)
            System.out.println(p.getName());
}
}
class PhoneComparator implements Comparator<Phone> {

    public int compare(Phone a, Phone b){

        return a.getName().toUpperCase().compareTo(b.getName().toUpperCase());
    }
    }
