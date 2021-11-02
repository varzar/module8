package MyArrayList;

import java.util.Objects;

public class MyArrayListImpl<E> implements MyArrayList<E> {
    private static final Object[] EMPTY_ELEMENTS_DATA = {};
    private  Object[] items;
    int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private final static float LOAD_FACTOR =  1f + 3f/2f;
    private int cursorIndex = 0;

    public MyArrayListImpl(int initialCapacity) {
           if (initialCapacity > DEFAULT_CAPACITY ){
            items = (E[])new Object[initialCapacity];
        }else {
            throw  new IllegalArgumentException("Illegal capacity: " + initialCapacity);
        }
    }

    public MyArrayListImpl() {
        items = (E[])new Object[DEFAULT_CAPACITY];
    }

    @Override
    public void add(Object value) {
        Object[] temp = items;
        if(items.length <= size) {
            int reSize = (int) (temp.length * LOAD_FACTOR);
            items = (E[]) new Object[reSize];
            System.arraycopy(temp, 0, items, 0, temp.length);
        }
        items[size] = value;
        size++;
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
        size--;
        return item;
    }

    @Override
    public void clear() {
        items = EMPTY_ELEMENTS_DATA;
        size = EMPTY_ELEMENTS_DATA.length;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E get(int index) {
        return (E) items[index];
    }
}
