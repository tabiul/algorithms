package algorithms;

import java.util.HashMap;
import java.util.Map;

public class QuickFindHashMap<K> {
    private Map<K, K> map = new HashMap<>();


    public void union(K key1, K key2) {
        if (!map.containsKey(key1)) {
            map.put(key1, key1);
        }

        if (!map.containsKey(key2)) {
            map.put(key2, key2);
        }

        if(!connected(key1, key2)) {
            K val = map.get(key1);

            for(Map.Entry<K,K> e: map.entrySet()) {
                if(e.getValue().equals(map.get(key2))) {
                    map.put(e.getKey(), val);
                }
            }
        }
    }

    public boolean connected(K key1, K key2) {

        if (map.containsKey(key1) && map.containsKey(key2)) {
            return map.get(key1).equals(map.get(key2));
        }

        return false;
    }

    private K findRoot(K key) {
        if (!map.containsKey(key)) return null;
        else if (map.get(key).equals(key)) return key;
        else return findRoot(map.get(key));
    }
}
