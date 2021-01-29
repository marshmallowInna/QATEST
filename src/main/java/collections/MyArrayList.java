package collections;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;
import java.util.Iterator;

public class MyArrayList {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>(10);
        // elementData = (E[]) new Object[10];
        list.add("1");
        list.add("5");
        list.add("7");
        list.add("8");
        list.add("6");
        list.add("4");
        list.add("2");
        list.add("9");
        list.add("3");
        list.add("55");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("New");
        list2.add("50");
        list2.add("60");
        list2.add("70");
        list2.add("80");


       /* public static ArrayList<StringList> merge (ArrayList < String > list, ArrayList < String > list2){
            ArrayList<String> listFin = new ArrayList<>();
            for (String s : list) {
                for (String s1 : list2) {
                    if (list.get(Integer.parseInt("50")) == list2.get(Integer.parseInt("80"))) {
                        StringList arr = new StringList() {


                        }

                    }
                }
*/
                Iterator itr = list2.iterator();
                System.out.println("Iterator: " + itr.toString());
                System.out.println("List2: " + list2);

                // System.arraycopy(list,0,list2, 9, list2.size() - 1);

                list.forEach(e -> System.out.println("Element: " + e.toString()));
                System.out.println(list);
                System.out.println(list.get(2));
                System.out.println("----------------------");
                boolean contains = list.contains("5");
                System.out.println("Containes result: " + contains);
                System.out.println("----------------------------------------");

       /* for (int i = 0; i < list.size(); i++) {
            System.out.println("List = " + list.get(i));
        }*/
                for (String s : list) {
                    System.out.println("List: " + s);
                    System.out.println("----------------------");
                }
            }
        }