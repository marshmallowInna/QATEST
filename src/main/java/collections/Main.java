package collections;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<String> arr = new ArrayList<>(10);
        System.out.println(arr);
        System.out.println("--------------------");
        List<MyEnum> enumCollection = Arrays.asList(MyEnum.values());
        for (MyEnum myEnum : enumCollection) {
            System.out.println(" myEnum: " + myEnum);


        }
        System.out.println("--------------------");
        Map<String, String> mapVehicles = new HashMap<String, String>();
        mapVehicles.put("BMW", "5");
        System.out.println("mapVehicles :" + mapVehicles);
        System.out.println("------------------------");

        double[] myInt = new double[10];
        for (int i = 0; i < myInt.length; i++) {
            myInt[i] = Math.random();
            System.out.println("Random intenger : " + myInt[i]);
        }

        ArrayList<String> myList = new ArrayList<>();
        myList.add("fff");
        myList.add("fffff");
        myList.add("fffff");
        myList.add("ffffff");
        myList.add("f");
        myList.add("ff");

        int largestString = myList.get(0).length();
        int index = 0;

        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).length() > largestString) {
                largestString = myList.get(i).length();
                index = i;
            }
        }
        System.out.println("Index " + index + " " + myList.get(index) + " " + "is the largest and is size " + largestString);

        for (String s : myList) {
            System.out.println(myList);
            System.out.println(myList.size());
            Set<String> set = new HashSet<>();
            for (String s1 : set) {
                System.out.println(set);
            }


        }

        List<String> myList2 = new ArrayList<>();
       /* BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) ;
        {
            list2.add(bufferedReader.readLine());
        }
        int max = list2.get(0).length();
        for (String s : list2)
            if (s.length() > max)
                max = s.length();
        for (String s : list2)
            if (s.length() == max)
                System.out.println(s);*/

        myList2.add("A");
        myList2.add("AA");
        myList2.add("AAA");
        myList2.add("AAAA");
        myList2.add("AAAAA");
        myList2.add("AAAAAA");
        myList2.add("AAAAAAA");
        myList2.add("AAAAAAAA");
        myList2.add("AAAAAAAAA");
        myList2.add("AAAAAAAAAA");
        for (int i = 0; i < 10; i++) {
            getRandomItem(myList2);
        }
    }

    private static void getRandomItem(List<String> myList2) {
        Random random = new Random();
        int index = random.nextInt(myList2.size());
        System.out.println("index: " + index + ", item : " + myList2.get(index));

        System.out.println(myList2);
        System.out.println("------------------------------------------------------");

        Map<String, String> map = new HashMap<String, String>();
        map.put("watermelon", "berry");
        map.put("banana", "fruit");
        map.put("cherry", "berry");
        map.put("pineapple", "frui");
        map.put("melon", "vegetable");
        map.put("cranberry", "berry");
        map.put("apple", "frui");
        map.put("iris", "flower");
        map.put("potato", "vegetable");
        map.put("carrot", "vegetable");
        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }

        ArrayList<Integer> Numbers = new ArrayList<Integer>();
        Numbers.add(1);
        Numbers.add(2);
        Numbers.add(1);
        Numbers.add(4);
        Numbers.add(2);

        HashSet<Integer> hashSetNumbers = new HashSet<Integer>(Numbers);
        System.out.println("Unique Values of ArrayList");
        for (Integer strNumber : hashSetNumbers)
            System.out.println(strNumber);
    }

}