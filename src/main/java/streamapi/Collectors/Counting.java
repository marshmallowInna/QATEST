package streamapi.Collectors;
import streamapi.Phone2;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Counting {
    public static void main(String[] args) {
        Stream<Phone2> phoneStream = Stream.of(new Phone2("iPhone X", "Apple", 600),
                new Phone2("Pixel 2", "Google", 500),
                new Phone2("iPhone 8", "Apple", 450),
                new Phone2("Galaxy S9", "Samsung", 440),
                new Phone2("Galaxy S8", "Samsung", 340));

        Map<String, Long> phonesByCompany = phoneStream.collect(
                Collectors.groupingBy(Phone2::getCompany, Collectors.counting()));

        for (Map.Entry<String, Long> item : phonesByCompany.entrySet()) {

            System.out.println(item.getKey() + " - " + item.getValue());
        }
    }
}
