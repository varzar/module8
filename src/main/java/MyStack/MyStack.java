package MyStack;

public interface MyStack<E> {
    void push(Object o);
    E remove(int index);
    void clear();
    int size();
    E peek();
    E pop();
}
