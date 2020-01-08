package com.boombaozi.MyCollection;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyHashMapTest {
    @Test
    public void clear() throws Exception {

    }

    @Test
    public void containsKey() throws Exception {
    }

    @Test
    public void containsValue() throws Exception {
    }

    @Test
    public void isEmpty() throws Exception {
    }

    @Test
    public void size() throws Exception {
    }

    @Test
    public void get() throws Exception {
    }

    @Test
    public void put() throws Exception {
        MyMap<String, Integer> m = new MyHashMap<>();
      
        for (int i = 0; i < 100; i++) {
            m.put(String.valueOf(i) , i);
        }
        assertTrue(m.size()==100);
    }

    @Test
    public void remove() throws Exception {
    }

    @Test
    public void show() throws Exception {
    }

}