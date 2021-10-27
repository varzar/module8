package MyHashMap;


public class MyHashMap<K, V> implements MyHashMapInterface<K, V>{
    final static int CAPACITY = 16;
    private Node<K, V> [] hashTable;
    private int size = 0;
    private final int tableLength;
    private int hash(final K key){
        return key == null ? 0 : 31 * (key.hashCode() + 17);
    }

    private static class Node <K, V>{
        int hashCode;
        K key;
        V value;
        Node<K, V> next;

        public Node(K key, V value, Node<K, V> next, int hashCode) {
            this.key = key;
            this.value = value;
            this.next = next;
            this.hashCode = hashCode;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public V setValue(V value) {
            this.value = value;
            return value;
        }


    }

    public MyHashMap(int tableLength) {
        if(tableLength <= 0){
            throw new  IllegalArgumentException("wrong length of table");
        }
        this.tableLength = tableLength;
        this.hashTable = new Node[tableLength];
    }

    public MyHashMap() {
        this(CAPACITY);
    }

    @Override
    public V put(Object key, Object value) {
        int hashCode = hash((K) key);
        int index = indexForTable(hashCode, tableLength);
        Node <K, V> node = hashTable[index];
        if(node == null){
            hashTable[index] = new Node<K, V>((K) key, (V) value, null, hashCode);
        }else {
            for (Node<K, V> n = node; n != null; n = n.next){
                K nodeKey = n.getKey();
                if ((key == null && null == nodeKey) || (key != null && key.equals(nodeKey))){
                    V oldValue = n.getValue();
                    n.setValue((V) value);
                    return  oldValue;
                }
                if (n.next == null){
                    n.next = new Node<K, V>((K) key, (V) value, null, hashCode);
                    break;
                }
            }
        }
        size++;
        return null;
    }

    @Override
    public V remove(Object key) {
        int hashCode = hash((K) key);
        int index = indexForTable(hashCode, tableLength);
        Node <K, V> node = hashTable[index];

        if(node != null){
            for (Node<K, V> n = node; n != null; n = n.next){
                K nodeKey = n.getKey();
                if ((key == null && null == nodeKey) || (key != null && key.equals(nodeKey))){
                    V oldValue = n.getValue();
                    hashTable[index] = n.next;
                    return  oldValue;
                }
            }
        }
        size--;
        return null;
    }

    @Override
    public void clear() {
        hashTable = new Node[tableLength];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public V get(Object key) {
        int index = indexForTable((hash((K) key)), tableLength);
        Node<K, V> node = hashTable[index];
        for (Node<K, V> n = node; n != null; n = n.next){
            if ((key == null && null == n.getKey()) || (key != null && key.equals(n.getKey()))){
                return n.value;
            }
        }
        return null;
    }

    private int indexForTable(int hashCode, int tableLength){
        return  Math.abs(hashCode) % tableLength;
    }
}
