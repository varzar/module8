package MyHashMap;

public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap<String, Integer> myHashMap = new MyHashMapImpl<String, Integer>(64);
        MyHashMap<String, Integer> myHashMap2 = new MyHashMapImpl<String, Integer>();
        myHashMap.put("KING", 100);
        myHashMap.put("BLAKE", 10);
        myHashMap.put("KING", 50);
        myHashMap2.put("BLAKE", 10);
        myHashMap2.put("KING", 50);
        System.out.println(myHashMap2.get("KING"));

        System.out.println(myHashMap2.get("BLAKE"));

        System.out.println(myHashMap.get("KING"));

        System.out.println(myHashMap.get("BLAKE"));

        System.out.println("size: " + myHashMap2.size());


        System.out.println("REMOVE: " + myHashMap2.remove("KING"));
        System.out.println("REMOVE: " + myHashMap2.remove("KING"));
        System.out.println("REMOVE: " + myHashMap2.remove("BLAKE"));
        System.out.println("REMOVE: " + myHashMap2.remove("BLAKE"));
        System.out.println("size: " + myHashMap2.size());
        System.out.println("size before clear: " + myHashMap.size());

        myHashMap.clear();
        System.out.println("size after clear: " + myHashMap.size());

    }
}
