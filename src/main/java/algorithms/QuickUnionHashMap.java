package algorithms;

import java.util.HashMap;
import java.util.Map;

public class QuickUnionHashMap<K> {

    private Map<K, K> map = new HashMap<>();


    public void union(K key1, K key2) {
        if (!map.containsKey(key1)) {
            map.put(key1, key1);
        }

        if (!map.containsKey(key2)) {
            map.put(key2, key2);
        }

        map.put(key1, map.get(key2));
    }

    public boolean connected(K key1, K key2) {
        K root1 = findRoot(key1);
        K root2 = findRoot(key2);

        if (root1 != null && root2 != null) {
            return root1.equals(root2);
        }

        return false;
    }

    private K findRoot(K key) {
        if (!map.containsKey(key)) return null;
        else if (map.get(key).equals(key)) return key;
        else return findRoot(map.get(key));
    }
}
