package MyHashMap;

public interface MyHashMap<K, V>{
    V put(Object key, Object value);
    V remove(Object key);
    void clear();
    int size();
    V get(Object key);
}
