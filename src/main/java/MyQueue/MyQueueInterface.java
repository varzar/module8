package MyQueue;

import MyArrayList.MyArrayListInterface;
import MyLinkedList.MyLinkedListInterface;

public interface MyQueueInterface<E> extends MyLinkedListInterface<E> {
    E peek();
    E poll();
}
