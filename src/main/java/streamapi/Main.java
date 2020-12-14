package streamapi;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 6s",54000),new Phone("Lumia 950", 45000),
                new Phone ("Samsung Galaxy s 6",40000));
        phoneStream.filter(p ->p.getPrice()<50000).forEach(p -> System.out.println(p.getName()));

        Stream<Phone> phoneStream1 = Stream.of(new Phone("iPhone 6s", 54000),new Phone("Lumia 950",45000),
                new Phone("Samsung Galaxy s 6",40000));
        phoneStream1
                .map(p->p.getName()) //помещаем в поток только название телефонов
                .forEach(s -> System.out.println(s));

        Stream<Phone> phoneStream2 = Stream.of(new Phone("iPhone 6s", 54000),new Phone("Lumia 950",45000),
                new Phone("Samsung Galaxy s 6",40000));
        phoneStream2
                .map(p->" название: " + p.getName() + " цена: " + p.getPrice())
                .forEach(s -> System.out.println(s));

        Stream<Phone> phoneStream3 = Stream.of(new Phone("iPhone 6s", 54000),new Phone("Lumia 950",45000),
                new Phone("Samsung Galaxy s 6",40000));
        phoneStream3
                .flatMap(p->Stream.of(
                        String.format("название: %s  цена без скидки: %d", p.getName(), p.getPrice()),
                        String.format("название: %s  цена co скидкой: %d", p.getName(), p.getPrice() - (int)(p.getPrice()*0.1))
                ))
                .forEach(s -> System.out.println(s));
    }
}
