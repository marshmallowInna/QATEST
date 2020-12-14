package streamapi;

import java.util.Comparator;
import java.util.stream.Stream;

public class Program2 {
    public static void main(String[] args) {
        Stream<Phone2> phone2Stream = Stream.of(new Phone2("Iphone X", "Apple", 600),
                new Phone2("Pixel 2", "Google", 500),
                new Phone2("iPhone 8", "Apple",450),
                new Phone2("Nokia 9", "HMD Global",150),
                new Phone2("Galaxy S9", "Samsung", 300));
        phone2Stream.sorted(new Phone2Comporator())
                .forEach(p-> System.out.printf("%s (%s) - %d \n",
                        p.getName(), p.getCompany(),p.getPrice()));


    }
}
class Phone2Comporator implements Comporator<Phone2>, Comparator<Phone2> {

    public int compare(Phone a, Phone b){

        return a.getName().toUpperCase().compareTo(b.getName().toUpperCase());
    }

    @Override
    public int compare(Phone2 o1, Phone2 o2) {
        return 0;
    }
}

