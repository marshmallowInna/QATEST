package streamapi;

import java.util.stream.Stream;

public class Program4 {
    public static void main(String[] args) {
        Stream<String> people1 = Stream.of("Tom", "Bob", "Sam");
        Stream<String> poeple2 = Stream.of("Alice", "Kate", "Sam");
        Stream.concat(people1, poeple2).forEach(n-> System.out.println(n));

        Stream<String> people = Stream.of("Tom", "Bob", "Sam", "Tom", "Alice", "Kate", "Sam");
        people.distinct().forEach(p -> System.out.println(p));
    }

}
