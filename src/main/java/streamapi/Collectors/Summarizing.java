package streamapi.Collectors;

import streamapi.Phone2;

import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Summarizing {
    public static void main(String[] args) {
        Stream<Phone2> phoneStream = Stream.of(new Phone2("iPhone X", "Apple", 600),
                new Phone2("Pixel 2", "Google", 500),
                new Phone2("iPhone 8", "Apple", 450),
                new Phone2("Galaxy S9", "Samsung", 440),
                new Phone2("Galaxy S8", "Samsung", 340));
        //Метод Collectors.summarizingInt(Phone::getPrice)) создает набор,
        // в который помещаются цены для всех телефонов каждой из групп.
        // Данный набор инкапсулируется в объекте IntSummaryStatistics.
        // Соответственно если бы мы применяли методы summarizingLong() или summarizingDouble(),
        // то соответственно бы получали объекты LongSummaryStatistics или DoubleSummaryStatistics.
        //У этих объектов есть ряд методов, который позволяют выполнить различные атомарные операции над набором:
        //getAverage(): возвращает среднее значение
        //getCount(): возвращает количество элементов в наборе
        //getMax(): возвращает максимальное значение
        //getMin(): возвращает минимальное значение
        //getSum(): возвращает сумму элементов
        //accept(): добавляет в набор новый элемент
        Map<String, IntSummaryStatistics> priceSummary = phoneStream.collect(
                Collectors.groupingBy(Phone2::getCompany,
                        Collectors.summarizingInt(Phone2::getPrice)));
        for(Map.Entry<String, IntSummaryStatistics> item : priceSummary.entrySet()){
            System.out.println(item.getKey() + " - " + item.getValue().getAverage());
        }
    }
}
