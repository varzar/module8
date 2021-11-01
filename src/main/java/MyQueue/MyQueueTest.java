package MyQueue;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<String> stringMyQueue = new MyQueueImpl<String>();
        stringMyQueue.add("qwe");
        stringMyQueue.add("rty");
        stringMyQueue.add("asd");
        MyQueue<Integer> integerMyQueue = new MyQueueImpl<Integer>();
        for (int i = 0; i < 12; i++) {
            integerMyQueue.add(i);
        }
        System.out.println("strings size: " + stringMyQueue.size());
        System.out.println("integer size: " + integerMyQueue.size());
        System.out.println("-------------------");
        System.out.println("string peek(): " + stringMyQueue.peek());
        System.out.println("-------------------");
        System.out.println("integer peek(): " + integerMyQueue.peek());
        System.out.println("-------------------");
         System.out.println("string remove(): " + stringMyQueue.remove(1));
        System.out.println("integer remove(): " + integerMyQueue.remove(1));
        System.out.println("-------------------");
        System.out.println("string peek(): " + stringMyQueue.peek());
        System.out.println("integer peek(): " + integerMyQueue.peek());
        System.out.println("-------------------");
        System.out.println("string poll(): " + stringMyQueue.poll());
        System.out.println("integer poll(): " + integerMyQueue.poll());
        System.out.println("-------------------");
        System.out.println("after poll string peek(): " + stringMyQueue.peek());
        System.out.println("after poll integer peek(): " + integerMyQueue.peek());
        System.out.println("-------------------");
        System.out.println("strings size: " + stringMyQueue.size());
        System.out.println("integer size: " + integerMyQueue.size());
        System.out.println("-------------------");
        stringMyQueue.clear();
        integerMyQueue.clear();
        for (int i = 0; i < stringMyQueue.size(); i++) {
            System.out.println(stringMyQueue.peek());
        }
        System.out.println("***************");
        for (int i = 0; i < integerMyQueue.size(); i++) {
            System.out.println(integerMyQueue.peek());
        }
    }
}
