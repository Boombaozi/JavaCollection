package com.boombaozi.MyCollection;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyHashSetTest {
    @Test
    public void clear() throws Exception {
    }

    @Test
    public void contains() throws Exception {
    }

    @Test
    public void add() throws Exception {
        MySet<Integer> set = new MyHashSet<>();
        set.add(1);
        set.add(1);
        set.add(1);
        set.add(2);

        assertTrue(set.size()==2);
    }

    @Test
    public void remove() throws Exception {
    }

    @Test
    public void isEmpty() throws Exception {
    }

    @Test
    public void size() throws Exception {
    }

    @Test
    public void show() throws Exception {
    }

    @Test
    public void iterator() throws Exception {
    }

}