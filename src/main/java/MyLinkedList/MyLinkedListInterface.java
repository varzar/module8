package MyLinkedList;

public interface MyLinkedListInterface <E>{
    void add(Object o);
    E remove(int index);
    void clear();
    int size();
    E get(int index);
}
