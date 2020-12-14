package streamapi.Collectors;

import streamapi.Phone2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingByPartitioning {
    public static void main(String[] args) {
        //у нас набор обьектов,которые мы группируем по компании
        //для создания групп в метод phoneStream.collect() передается вызов функции Collectors.groupingBy(),
        // которая с помощью выражения Phone::getCompany группирует объекты по компании.
        // В итоге будет создан объект Map, в котором ключами являются названия компаний,
        // а значениями - список связанных с компаниями телефонов.
        Stream<Phone2> phoneStream = Stream.of(new Phone2("iPhone X", "Apple", 600),
                new Phone2("Pixel 2", "Google", 500),
                new Phone2("iPhone 8", "Apple", 450),
                new Phone2("Galaxy S9", "Samsung", 440),
                new Phone2("Galaxy S8", "Samsung", 340));

        Map<Boolean, List<Phone2>> phonesByCompany2 = phoneStream.collect(
                Collectors.partitioningBy(p -> p.getCompany() == "Apple"));
        //с помощью условия p->p.getCompany()=="Apple" мы смотрим, принадлежит ли телефон компании Apple.
        // Если телефон принадлежит этой компании, то он попадает в одну группу, если нет, то в другую.

        for (Map.Entry<Boolean, List<Phone2>> item : phonesByCompany2.entrySet()) {
            System.out.println(item.getKey());
            for (Phone2 phone2 : item.getValue()) {
                System.out.println(phone2.getName());
            }
            System.out.println();
        }
        //для вычесления количества элементов в каждй группе
        Map<String, Long> phonesByCompany = phoneStream.collect(
                Collectors.groupingBy(Phone2::getCompany, Collectors.counting()));
        for (Map.Entry<String, Long> item : phonesByCompany.entrySet()) {
            System.out.println(item.getKey() + " - " + item.getValue());
        }

    }
}

