package MyArrayList;

public interface MyArrayList<E>  {
    void add(Object value);
    E remove(int index);
    void clear();
    int size();
    E get(int index);
}
