package MyStack;

import MyLinkedList.MyLinkedList;

public class MyStack<E> extends MyLinkedList<E> implements MyStackInterface<E>{
    @Override
    public void push(Object o) {
        this.add((o));
    }

    @Override
    public E peek() {
        return get(size() - 1);
    }

    @Override
    public E pop() {
        return remove(size() - 1);
    }
}
