package MyArrayList;

import java.util.Objects;

public class MyArrayList<E> implements MyArrayListInterface<E> {
    private static final Object[] EMPTY_ELEMENTS_DATA = {};
    private  Object[] items;

    private static final int DEFAULT_CAPACITY = 0;
//    private int size;
//    private final static float LOAD_FACTOR =  2f;//1f + 3f/2f;
    private int cursorIndex = 0;

    public MyArrayList(int initialCapacity) {
           if (initialCapacity > DEFAULT_CAPACITY ){
            items = (E[])new Object[initialCapacity];
        }else {
            throw  new IllegalArgumentException("Illegal capacity: " + initialCapacity);
        }
    }

    public MyArrayList() {
        items = (E[])new Object[DEFAULT_CAPACITY];
    }

    @Override
    public void add(Object value) {
        Object[] temp = items;
        if(items.length == cursorIndex) {
            items = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, items, 0, temp.length);
            items[items.length - 1] = value;
        }else {
            items[cursorIndex] = value;
        }
        cursorIndex++;
    }

    @Override
    public E remove(int index) {
        Objects.checkIndex(index, items.length);

        E item = (E) items[index];
        final int newSize = items.length - 1;
        Object[] temp = items;
        items = (E[]) new Object[newSize];
        System.arraycopy(temp, 0, items, 0, index );
        System.arraycopy(temp, index + 1, items, index, newSize - index);
        return item;
    }

    @Override
    public void clear() {
        items = EMPTY_ELEMENTS_DATA;
    }

    @Override
    public int size() {
        return items.length;
    }

    @Override
    public E get(int index) {
        return (E) items[index];
    }
}
