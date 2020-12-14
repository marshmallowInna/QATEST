package streamapi.Collectors;

import streamapi.Phone2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mapping {
    public static void main(String[] args) {
        Stream<Phone2> phoneStream = Stream.of(new Phone2("iPhone X", "Apple", 600),
                new Phone2("Pixel 2", "Google", 500),
                new Phone2("iPhone 8", "Apple", 450),
                new Phone2("Galaxy S9", "Samsung", 440),
                new Phone2("Galaxy S8", "Samsung", 340));
        //Выражение Collectors.mapping(Phone::getName, Collectors.toList()) указывает,
        // что в группу будут выделятся названия смартфонов, причем группа будет представлять объект List.
        Map<String, List<String>> phonesByCompany = phoneStream.collect(
                Collectors.groupingBy(Phone2::getCompany,
                        Collectors.mapping(Phone2::getName, Collectors.toList())));
        for(Map.Entry<String, List<String>> item : phonesByCompany.entrySet()){
            System.out.println(item.getKey());

            for(String name : item.getValue()){
                System.out.println(name);
            }
        }

    }
}
