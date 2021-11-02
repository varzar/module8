package MyQueue;



import java.util.Objects;

public class MyQueueImpl<E> implements MyQueue<E> {

    private static class  Node <E> {
        Node<E> prev;
        E element;
        Node<E> next;

        public Node(Node<E> prev, E element, Node<E> next) {
            this.prev = prev;
            this.element = element;
            this.next = next;
        }
    }

    private Node<E> first;
    private Node<E> last;
    private int size = 0;

    Node<E> node(int index) {
        if (index < (size / 2)) {
            Node<E> current = first;
            for (int i = 0; i < index; i++)
                current = current.next;
            return current;
        } else {
            Node<E> current = last;
            for (int i = size - 1; i > index; i--)
                current = current.prev;
            return current;
        }
    }

    @Override
    public void add(Object o){
        Node<E> lastNode = last;
        Node<E> newNode = new Node<E>(lastNode, (E)o, null);
        last = newNode;
        if(lastNode == null){
            first = newNode;
        }else {
            lastNode.next = newNode;
        }
        size++;
    }

    @Override
    public E remove(int index) {
        Objects.checkIndex(index, size);
        Node<E> current = node(index);
        final E element = current.element;
        Node<E> prevItem = current.prev;
        final Node<E> nextItem = current.next;
        if(prevItem == null){
            first = nextItem;
        }
        else {
            prevItem.next = nextItem;
            current.prev = null;
        }
        if(nextItem == null){
            last = prevItem;
        }else {
            nextItem.prev = prevItem;
            current.next = null;
        }
        current.element = null;
        size--;
        return element;
    }

    @Override
    public void clear() {
        first = last = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E peek() {
        return (E) first.element;
    }

    @Override
    public E poll() {
        return remove(0);
    }
}
