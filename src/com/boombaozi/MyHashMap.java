package com.boombaozi;

import java.util.LinkedList;
import java.util.Set;

/**
 * @program: myCollection
 * @description: 实现了MyMap接口
 * @author: boombaozi.com
 * @create: 2018-04
 **/
public class MyHashMap<K, V> implements MyMap<K, V> {

    /**
     * @description: default initial capacity
     **/

    private static int DEFAULT_INITIAL_CAPACITY = 4;

    private static int MAXIMUM_CAPACITY = 1 << 30;

    private int capacity;

    private static float DEFAULT_MAX_LOAD_FACTOR = 0.75f;

    private float loadFactorThreshold;

    private int size = 0;

    LinkedList<Entry<K, V>>[] table;


    public MyHashMap() {
        this(DEFAULT_INITIAL_CAPACITY, DEFAULT_MAX_LOAD_FACTOR);
    }

    public MyHashMap(int capacity, float load_factor) {
        this.capacity = capacity;
        this.loadFactorThreshold = load_factor;
        table = new LinkedList[capacity];
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean containsKey(K key) {

        int index = hash(key.hashCode());
        boolean flag = false;
        if (table[index] == null) {
            return flag;
        } else {
            for (Entry entry : table[index]) {
                if (entry.getKey().equals(key)) {
                    flag = true;
                }
            }
        }
        return flag;
    }

    @Override
    public boolean containsValue(V value) {
        boolean flag = false;

        for (int i = 0; i < capacity; i++) {
            if (table[i] == null) {

            } else {
                for (Entry entry : table[i]) {
                    if (entry.getValue() == value) {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }


    @Override
    public V get(K key) {

        int index = hash(key.hashCode());

        if (table[index] != null) {

            for (Entry<K, V> entry : table[index]) {
                if (entry.getKey().equals(key)) {
                    return entry.getValue();
                } else {
                    return null;
                }
            }
        } else {
            return null;
        }
        return null;
    }

    @Override
    public V put(K key, V value) {

        int index = hash(key.hashCode());

        if (table[index] == null) {
            table[index] = new LinkedList<Entry<K, V>>();
        }

        if (get(key) != null) {
            for (Entry<K, V> entry : table[index]) {
                if (entry.getKey().equals(key)) {
                    V oleValue = entry.getValue();
                    entry.value = value;
                    return oleValue;
                }
            }
        } else {


            table[index].add(new Entry(key, value));
            size++;
            System.out.println("table[" + index + "] add new Entry(" + key + "," + value + ")");
        }


        return value;
    }

    @Override
    public void remove(K key) {
        int index = hash(key.hashCode());
        if (table[index] != null) {
            for (Entry entry : table[index]) {
                if (entry.getKey() == key) {
                    table[index].remove(entry);
                    size--;
                    System.out.println("table[" + index + "] remove Entry(" + key+ ")");
                    break;
                }
            }
        }
    }


    private int hash(int hashCode) {
        return supplementalHash(hashCode) & (capacity - 1);
    }

    private static int supplementalHash(int h) {
        h ^= (h >>> 20) ^ (h >>> 12);
        return h ^ (h >>> 7) ^ (h >>> 4);
    }


    public void show() {
        System.out.println("───────────────────────");
        float lamda=size/capacity;
        System.out.println(" length = " + capacity+"  rehash :"+ loadFactorThreshold);
        System.out.println(" size = " +size +"  lamda :"+lamda);
        for (int index = 0; index < table.length; index++) {
            if (table[index] == null) {
                System.out.println(" ["+index+"]"+"[null]");
            } else {
                System.out.print(" ["+index+"]");
                for (Entry entry : table[index]) {

                    System.out.print(entry.toString() + "→");
                }
                System.out.println();
            }
        }

        System.out.println("───────────────────────");
    }
}
