package com.boombaozi;

import java.util.Set;

/**
 * @program: myCollection
 * @description: 一个自己的Map接口
 * @author: boombaozi.com
 * @create: 2018-04-15 21
 **/
public interface MyMap<K,V> {

    public void clear();

    public  boolean containsKey(K key);

    public boolean containsValue(V value);

    public boolean isEmpty();

    public int size();

    public  V get(K key);

    public V put(K key,V value);

    public void remove(K key);

    public void show();



public  class Entry<K,V>{
    K key;
    V value;

    public  Entry(K key,V value) {
        this.key = key;
        this.value=value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "["+key+","+value+"]";
    }
}

}
