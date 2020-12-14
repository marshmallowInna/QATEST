package streamapi;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class Program6 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.addAll(Arrays.asList(new String[]{"Tom", "Sam", "Bob", "Alice"}));
        System.out.println(names.stream().count()); //4
        //количество элементов с длиной не больше 3 символов
        System.out.println(names.stream().filter(n->n.length()<=3).count()); //3

        ArrayList<String> names2 = new ArrayList<String>();
        names2.addAll(Arrays.asList(new String[]{"Tom", "Sam", "Bob", "Alice"}));

        Optional<String> first = names2.stream().findFirst();
        System.out.println(first.get()); //Tom

        Optional<String> any = names2.stream().findAny();
        System.out.println(any.get());
    }


}
