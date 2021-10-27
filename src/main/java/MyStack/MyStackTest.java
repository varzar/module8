package MyStack;


public class MyStackTest {
    public static void main(String[] args) {
        MyStackInterface<String> stringMyStack = new MyStack<String>();

        stringMyStack.push("qwe");
        stringMyStack.push("rty");
        stringMyStack.push("asd");
        MyStackInterface<Integer> integerMyStack = new MyStack<Integer>();
        for (int i = 0; i < 12; i++) {
            integerMyStack.push(i);
        }
        System.out.println("get(0): " + stringMyStack.get(0));
        System.out.println("peek(): " + stringMyStack.peek());
        System.out.println("-------------------");
        System.out.println(integerMyStack.get(0));
        System.out.println("-------------------");
        System.out.println(stringMyStack.remove(1));
        System.out.println(integerMyStack.remove(7));
        System.out.println("-------------------");
        System.out.println(stringMyStack.get(0));
        System.out.println(stringMyStack.get(1));

        System.out.println(stringMyStack.peek());
        System.out.println(integerMyStack.get(7));
        System.out.println(integerMyStack.get(9));
        System.out.println("-------------------");
        System.out.println(stringMyStack.pop());
        System.out.println(integerMyStack.pop());
        System.out.println("-------------------");
        System.out.println(stringMyStack.peek());
        System.out.println(integerMyStack.peek());
        System.out.println("-------------------");

        stringMyStack.clear();
        integerMyStack.clear();
        for (int i = 0; i < stringMyStack.size(); i++) {
            System.out.println(stringMyStack.get(i));
        }
        System.out.println("***************");
        for (int i = 0; i < integerMyStack.size(); i++) {
            System.out.println(integerMyStack.get(i));
        }
    }
}
