package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class Optional1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9}));
        Optional<Integer> min= numbers.stream().min(Integer::compare);
        System.out.println(min.get()); //1
            //list of numbers is empty
       /* ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        Optional<Integer> min2 = numbers2.stream().min(Integer::compare);
        System.out.println(min2.get());// java.util.NoSuchElementEx*/

        ArrayList<Integer> numbers3 = new ArrayList<Integer>();
        Optional<Integer> min3 = numbers.stream().min(Integer::compare);
        if(min.isPresent()){
            System.out.println(min.get());

            //empty list
            ArrayList<Integer> numbers4 = new ArrayList<Integer>();
            Optional<Integer> min4 = numbers4.stream().min(Integer::compare);
            System.out.println("next"+min4.orElse(-1)); //-1
            // not empty list
           // numbers.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9}));
            min = numbers4.stream().min(Integer::compare);
            System.out.println(min.orElse(-900)); //-4




        }
    }
}
