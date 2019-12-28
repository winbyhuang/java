package com.winby.tool.hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Winby
 * @date 2018/12/17  16:04
 * @update
 * @since v1.0.0
 */
public class WBHashMap<K, V> implements WBMap<K, V> {

    // aka 16
    static int defaultLength = 1 << 4;

    private float defaultLoadFactor = 0.75f;

    private Entry[] table = null;

    private int size = 0;

    public WBHashMap(int length, float loader) {
        defaultLength = length;
        defaultLoadFactor = loader;
        table = new Entry[defaultLength];
    }

    public WBHashMap() {
        table = new Entry[defaultLength];
    }

    @Override
    public V put(K k, V v) {
        if (size > defaultLength * defaultLoadFactor) {
            resize();
        }
        int i = getIndex(k);
        Entry entry = table[i];
        table[i] = newEntry(k, v, entry);
        if (null == entry) {
            size++;
        }
        return (V) table[i].getValue();
    }

    private int getIndex(K k) {
        int n = defaultLength;
        int index = k.hashCode() % n;
        return index >= 0 ? index : -index;
    }

    private Entry<K, V> newEntry(K k, V v, Entry<K, V> next) {
        return new Entry<>(k, v, next);
    }

    private final void resize() {
        Entry[] newTable = new Entry[defaultLength * 2];
        reHash(newTable);
//        defaultLength++;
    }

    private final void reHash(Entry[] newTable) {
        List<Entry> list = new ArrayList<>();
        for (int i = 0; i < table.length; i++) {
            if (table[i] == null) {
                continue;
            }
            entryNext(table[i], list);
        }
        if (list.size() > 0) {
            size = 0;
            defaultLength = defaultLength * 2;
            table = newTable;
            for (Entry entry : list) {
                if (entry.next != null) {
                    entry.next = null;
                }
                put((K) entry.getKey(), (V) entry.getValue());
            }
        }
    }

    private void entryNext(Entry entry, List<Entry> list) {
        if (entry != null && entry.next != null) {
            list.add(entry);
            entryNext(entry.next, list);
        } else {
            list.add(entry);
        }
    }

    @Override
    public V get(K k) {
        int i = getIndex(k);
        return getValue(table[i], k);
    }

    private V getValue(Entry entry, K k) {
        if (entry.getKey() == k || entry.getKey().equals(k)) {
            return (V) entry.getValue();
        } else {
            if (entry.next != null) {
                return getValue(entry.next, k);
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    /**
     * @param <K>
     * @param <V>
     */
    static class Entry<K, V> implements WBMap.Entry<K, V> {
        K k;
        V v;
        Entry<K, V> next;

        public Entry(K k, V v, Entry<K, V> next) {
            this.k = k;
            this.v = v;
            this.next = next;
        }

        @Override
        public K getKey() {
            return k;
        }

        @Override
        public V getValue() {
            return v;
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap();
        WBMap<String, String> wbMap = new WBHashMap();
        int a = 1000000;
        Long s1 = System.currentTimeMillis();
        for (int i = 0; i < a; i++) {
            hashMap.put("wb" + i, "test" + i);
        }
        for (int i = 0; i < a; i++) {
            hashMap.get("wb" + i);
        }
        System.out.println(System.currentTimeMillis() - s1);
        Long s = System.currentTimeMillis();
        for (int i = 0; i < a; i++) {
            wbMap.put("wb" + i, "test" + i);
        }
        for (int i = 0; i < a; i++) {
            wbMap.get("wb" + i);
        }
        System.out.println(System.currentTimeMillis() - s);
    }
}
