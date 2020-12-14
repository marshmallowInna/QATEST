package streamapi.Collectors;

import streamapi.Phone2;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxByMinBy {
    public static void main(String[] args) {
        Stream<Phone2> phoneStream = Stream.of(new Phone2("iPhone X", "Apple", 600),
                new Phone2("Pixel 2", "Google", 500),
                new Phone2("iPhone 8", "Apple", 450),
                new Phone2("Galaxy S9", "Samsung", 440),
                new Phone2("Galaxy S8", "Samsung", 340));
        Map<String, Optional<Phone2>> phonesByCompany = phoneStream.collect(
                Collectors.groupingBy(Phone2::getCompany,
                        Collectors.minBy(Comparator.comparing(Phone2::getPrice))));
        for(Map.Entry<String, Optional<Phone2>> item : phonesByCompany.entrySet()){
            System.out.println(item.getKey() + " - " + item.getValue().get().getName());
        }
    }
}
