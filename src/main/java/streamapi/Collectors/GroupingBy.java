package streamapi.Collectors;

import streamapi.Phone2;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingBy {
    public static void main(String[] args) {
        Stream<Phone2> phoneStream = Stream.of(new Phone2("iPhone X", "Apple",600),
                new Phone2("Pixel 2", "Google", 500),
                new Phone2("iPhone 8", "Apple",450),
                new Phone2("Galaxy S9", "Samsung", 440),
                new Phone2("Galaxy S8", "Samsung", 340));
        Map<String, List<Phone2>> phonesByCompany = phoneStream.collect(
                Collectors.groupingBy(Phone2::getCompany));

        for(Map.Entry<String, List<Phone2>> item : phonesByCompany.entrySet()){
            System.out.println(item.getKey());
            for(Phone2 phone2 : item.getValue()) {
                System.out.println(phone2.getName());
            }
            System.out.println();
            }

        Map<Boolean, List<Phone2>> phonesByCompany2 = phoneStream.collect(
                Collectors.partitioningBy(p->p.getCompany()=="Apple"));
        for(Map.Entry<Boolean, List<Phone2>>item : phonesByCompany2.entrySet()){
            System.out.println(item.getKey());
            for (Phone2 phone2 : item.getValue()){
                System.out.println(phone2.getName());
            }
            System.out.println();
        }


        }
    }

