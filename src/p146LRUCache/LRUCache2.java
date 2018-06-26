package p146LRUCache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache2 {
    private LinkedHashMap<Integer,Integer> cache;
    private final int CAPACITY;
    public LRUCache2(int capacity) {
        CAPACITY = capacity;
        cache = new LinkedHashMap<Integer, Integer>(capacity,0.75f,true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return cache.size() > CAPACITY;
            }
        };
    }

    public int get(int key) {
        return cache.getOrDefault(key,-1);
    }

    public void put(int key, int value) {
        cache.put(key,value);
    }
}
