package MyStack;

import MyLinkedList.MyLinkedListInterface;

public interface MyStackInterface<E> extends MyLinkedListInterface<E> {
    void push(Object o);
    E peek();
    E pop();
}
