package MyStack;


public class MyStackTest {
    public static void main(String[] args) {
        MyStack<String> stringMyStack = new MyStackImpl<String>();

        stringMyStack.push("qwe");
        stringMyStack.push("rty");
        stringMyStack.push("asd");
        MyStack<Integer> integerMyStack = new MyStackImpl<Integer>();
        for (int i = 0; i < 12; i++) {
            integerMyStack.push(i);
        }
        System.out.println("strings size: " + stringMyStack.size());
        System.out.println("integer size: " + integerMyStack.size());
        System.out.println("-------------------");
        System.out.println("string peek(): " + stringMyStack.peek());
        System.out.println("-------------------");
        System.out.println("integer peek(): " + integerMyStack.peek());
        System.out.println("-------------------");
        System.out.println("string remove(): " + stringMyStack.remove(1));
        System.out.println("integer remove(): " + integerMyStack.remove(1));
        System.out.println("-------------------");
        System.out.println("string peek(): " + stringMyStack.peek());
        System.out.println("integer peek(): " + integerMyStack.peek());
        System.out.println("-------------------");
        System.out.println("string poll(): " + stringMyStack.pop());
        System.out.println("integer poll(): " + integerMyStack.pop());
        System.out.println("-------------------");
        System.out.println("after poll string peek(): " + stringMyStack.peek());
        System.out.println("after poll integer peek(): " + integerMyStack.peek());
        System.out.println("-------------------");
        System.out.println("strings size: " + stringMyStack.size());
        System.out.println("integer size: " + integerMyStack.size());
        System.out.println("-------------------");
        stringMyStack.clear();
        integerMyStack.clear();
        for (int i = 0; i < stringMyStack.size(); i++) {
            System.out.println(stringMyStack.peek());
        }
        System.out.println("***************");
        for (int i = 0; i < integerMyStack.size(); i++) {
            System.out.println(integerMyStack.peek());
        }
    }
}