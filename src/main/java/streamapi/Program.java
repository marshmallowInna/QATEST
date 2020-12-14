package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Program {
        public static void main(String[] args) {
        /* long count = IntStream.of(-5,-4,-3,-2,-1,0,1,2,3,4,5).filter(w-> w > 0).count();
        t.println(count);
    }*/
            ArrayList<String> cities = new ArrayList<String>();
            Collections.addAll(cities, "Париж", "Лондон", "Мадрид");
            cities.stream()// получаем поток
                    .filter(s -> s.length() == 6) //применяем фильтрацию по длине строки
                    .forEach(s -> System.out.println(s));//выводим отфильтрованые строки на консоль
        /* long count = IntStream.of(-5,-4,-3,-2,-1,0,1,2,3,4,5).filter(w-> w > 0).count();
        t.println(count);
    }*/
            ArrayList<String> cities1 = new ArrayList<String>();
            Collections.addAll(cities1, "Париж", "Лондон", "Мадрид");
            Stream<String> cities1Stream = cities1.stream();// получаем поток
            cities1Stream = cities1Stream.filter(s -> s.length() == 6);// применяем фильтрацию о длине строки
            cities1Stream.forEach(s -> System.out.println(s));//выводим отфильтрованые строки на консоль

            cities1Stream.forEach(s -> System.out.println(s));// терминальная операция употребляет поток
            long number = cities1Stream.count();// здесь ошибка, так как поток уже употреблен
            System.out.println(number);
            cities1Stream = cities1Stream.filter(s -> s.length() > 5);// тоже нельзя, так как поток уже употреблен

            Stream<String> citiesStream2 = Arrays.stream(new String[]{"Париж", "Лондон", "Мадрид"});
            citiesStream2.forEach(s -> System.out.println(s));

            IntStream intStream = Arrays.stream(new int[]{1, 2, 3, 4, 5, 7});
            intStream.forEach(i -> System.out.println(i));

            LongStream longStream = Arrays.stream(new long[]{100, 200, 300, 400569874, 654});
            longStream.forEach(l -> System.out.println(l));

            DoubleStream doubleStream = Arrays.stream(new double[]{3.4, 5.5, 9.5, 8.3698, 121});
            doubleStream.forEach(d -> System.out.println(d));

            Stream<String> citiesStream3 = Stream.of("Париж", "Лондон", "Мадрид");
            citiesStream3.forEach(s -> System.out.println(s));
            // можно передать массив
            String[] cities2 = {"Париж", "Лондон", "Мадрид"};
            Stream<String> citiesStream4 = Stream.of(cities2);

            IntStream intStream2 = IntStream.of(1, 2, 3, 4, 5, 7);
            intStream.forEach(i -> System.out.println(i));

            DoubleStream doubleStream2 = DoubleStream.of(3.4, 5.5, 9.5, 8.3698, 121);
            doubleStream.forEach(d -> System.out.println(d));

            LongStream longStream2 = LongStream.of(100, 200, 300, 400569874, 654);
            longStream.forEach(l -> System.out.println(l));

            //method forEach
            Stream<String> citiesStream5 = Stream.of("Париж", "Лондон", "Мадрид", "Берлин", "Брюссель");
            citiesStream5.forEach(s -> System.out.println(s));
            citiesStream5.forEach(System.out::println);
            citiesStream5.filter(s -> s.length() == 6).forEach(s -> System.out.println(s));
            // выводит Лондон Мадрид Берлин
            // фильтрация метода filter

        }
    }