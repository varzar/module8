package MyLinkedList;


import java.util.LinkedList;
import java.util.List;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedListInterface<String> stringMyLinkedList = new MyLinkedList<String>();
        List<String> stringLinkedList  = new LinkedList<String>();
        stringLinkedList.add("qwe");
        stringLinkedList.add("rty");
        stringLinkedList.add("asd");
        stringMyLinkedList.add("qwe");
        stringMyLinkedList.add("rty");
        stringMyLinkedList.add("asd");
        MyLinkedList<Integer> integerMyLinkedList = new MyLinkedList<Integer>();
        for (int i = 0; i < 12; i++) {
            integerMyLinkedList.add(i);
        }
        List<Integer> integerLinkedList = new LinkedList<Integer>();
        for (int i = 0; i < 12; i++) {
            integerLinkedList.add(i);
        }

        System.out.println(stringMyLinkedList.get(0));
        System.out.println(stringMyLinkedList.get(1));
        System.out.println(stringMyLinkedList.get(2));

        System.out.println(stringLinkedList.get(0));
        System.out.println(stringLinkedList.get(1));
        System.out.println(stringLinkedList.get(2));
        System.out.println("-------------------");
        System.out.println(integerMyLinkedList.get(11));
        System.out.println(integerLinkedList.get(11));

        System.out.println("-------------------");
        System.out.println(stringMyLinkedList.remove(0));
        System.out.println(integerMyLinkedList.remove(10));
        System.out.println(stringLinkedList.remove(0));
        System.out.println(integerLinkedList.remove(10));
        System.out.println("-------------------");
        System.out.println(stringMyLinkedList.get(0));
        System.out.println(stringMyLinkedList.get(1));
        System.out.println(integerMyLinkedList.get(0));
        System.out.println(integerMyLinkedList.get(10));
        System.out.println(stringLinkedList.get(0));
        System.out.println(stringLinkedList.get(1));
        System.out.println(integerLinkedList.get(0));
        System.out.println(integerLinkedList.get(10));
        System.out.println("-------------------");
        stringMyLinkedList.clear();
        integerMyLinkedList.clear();
        for (int i = 0; i < stringMyLinkedList.size(); i++) {
            System.out.println(stringMyLinkedList.get(i));
        }
        System.out.println("***************");
        for (int i = 0; i < integerMyLinkedList.size(); i++) {
            System.out.println(integerMyLinkedList.get(i));
        }
    }
}
