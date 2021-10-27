package MyArrayList;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayListInterface <String> stringMyArrayList = new MyArrayList<String>();
        stringMyArrayList.add("qwe");
        stringMyArrayList.add("rty");
        stringMyArrayList.add("asd");
        List <String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("qwe");
        stringArrayList.add("rty");
        stringArrayList.add("asd");
        MyArrayList<Integer> integerMyArrayList = new MyArrayList<Integer>(12);
        for (int i = 0; i < integerMyArrayList.size(); i++) {
            integerMyArrayList.add(i);
        }
        List<Integer> integerArrayList = new ArrayList<Integer>(12);
        for (int i = 0; i < 12; i++) {
            integerArrayList.add(i);
        }
        System.out.println(stringMyArrayList.get(0));
        System.out.println(stringMyArrayList.get(1));
        System.out.println(stringMyArrayList.get(2));
        System.out.println("-------------------");
        System.out.println(integerMyArrayList.get(11));
        System.out.println(integerArrayList.get(11));

        System.out.println("-------------------");
        System.out.println("remove: " + stringMyArrayList.remove(2));
        System.out.println(integerMyArrayList.remove(7));
        System.out.println(stringArrayList.remove(2));
        System.out.println(integerArrayList.remove(7));
        System.out.println("-------------------");
        System.out.println("after remove: " + stringMyArrayList.get(1));
        System.out.println(integerMyArrayList.get(7));
        System.out.println(stringArrayList.get(1));
        System.out.println(integerArrayList.get(7));
        System.out.println("-------------------");
        System.out.println(stringMyArrayList.get(1));
        System.out.println(integerMyArrayList.get(6));
        System.out.println("-------------------");

        stringMyArrayList.clear();
        integerMyArrayList.clear();
        for (int i = 0; i < stringMyArrayList.size(); i++) {
            System.out.println(stringMyArrayList.get(i));
        }
        System.out.println("***************");
        for (int i = 0; i < integerMyArrayList.size(); i++) {
            System.out.println(integerMyArrayList.get(i));
        }
        stringArrayList.clear();
        integerArrayList.clear();
        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println(stringArrayList.get(i));
        }
        System.out.println("***************");
        for (int i = 0; i < integerArrayList.size(); i++) {
            System.out.println(integerArrayList.get(i));
        }
    }
}
