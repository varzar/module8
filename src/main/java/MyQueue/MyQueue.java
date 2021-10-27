package MyQueue;

import MyLinkedList.MyLinkedList;

public class MyQueue<E> extends MyLinkedList <E> implements MyQueueInterface<E>{

    @Override
    public E peek() {
        return get(0);
    }

    @Override
    public E poll() {
        return remove(0);
    }
}
