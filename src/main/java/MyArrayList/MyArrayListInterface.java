package MyArrayList;

public interface  MyArrayListInterface <E>  {
    void add(Object value);
    E remove(int index);
    void clear();
    int size();
    E get(int index);
}
