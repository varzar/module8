package MyQueue;

public interface MyQueue<E>{
    void add(Object o);
    E remove(int index);
    void clear();
    int size();
    E peek();
    E poll();
}
