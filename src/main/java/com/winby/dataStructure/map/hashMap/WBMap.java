package com.winby.dataStructure.map.hashMap;

/**
 * @author Winby
 * @date 2018/12/17  16:04
 * @update
 * @since v1.0.0
 */
public interface WBMap<K, V> {
    public V put(K k, V v);

    public V get(K k);

    public int size();

    public interface Entry<K, V> {
        public K getKey();

        public V getValue();
    }
}
