package MyQueue;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueueInterface<String> stringMyQueue = new MyQueue<String>();

        stringMyQueue.add("qwe");
        stringMyQueue.add("rty");
        stringMyQueue.add("asd");
        MyQueueInterface<Integer> integerMyQueue = new MyQueue<Integer>();
        for (int i = 0; i < 12; i++) {
            integerMyQueue.add(i);
        }
        System.out.println("get(0): " + stringMyQueue.get(0));
        System.out.println("peek(): " + stringMyQueue.peek());
        System.out.println("-------------------");
        System.out.println(integerMyQueue.get(0));
        System.out.println("-------------------");
         System.out.println(stringMyQueue.remove(1));
        System.out.println(integerMyQueue.remove(7));
        System.out.println("-------------------");
        System.out.println(stringMyQueue.get(0));
        System.out.println(stringMyQueue.get(1));

        System.out.println(stringMyQueue.peek());
        System.out.println(integerMyQueue.get(7));
        System.out.println(integerMyQueue.get(9));
        System.out.println("-------------------");
        System.out.println(stringMyQueue.poll());
        System.out.println(integerMyQueue.poll());
        System.out.println("-------------------");
        System.out.println(stringMyQueue.peek());
        System.out.println(integerMyQueue.peek());
        System.out.println("-------------------");

        stringMyQueue.clear();
        integerMyQueue.clear();
        for (int i = 0; i < stringMyQueue.size(); i++) {
            System.out.println(stringMyQueue.get(i));
        }
        System.out.println("***************");
        for (int i = 0; i < integerMyQueue.size(); i++) {
            System.out.println(integerMyQueue.get(i));
        }
    }
}
