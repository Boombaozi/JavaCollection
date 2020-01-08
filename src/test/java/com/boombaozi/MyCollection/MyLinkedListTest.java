package com.boombaozi.MyCollection;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyLinkedListTest {

    @Test
    public void add() throws Exception {
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        assertTrue(list.size==3);

    }

    @Test
    public void clear() throws Exception {
    }

    @Test
    public void contains() throws Exception {
    }

    @Test
    public void get() throws Exception {
    }

    @Test
    public void indexOf() throws Exception {
    }

    @Test
    public void lastIndexOf() throws Exception {
    }

    @Test
    public void remove() throws Exception {
    }

    @Test
    public void set() throws Exception {
    }

    @Test
    public void show() throws Exception {
    }

    @Test
    public void iterator() throws Exception {
        // MyLinkedList<Integer> linkedList = new MyLinkedList<Integer>();
        // for (int i = 0; i < 30; i++) {
        //     linkedList.add("ss" + i);
        // }
        // Iterator iterator = linkedList.iterator();

        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }
    }

    @Test
    public void addFirst() throws Exception {
    }

    @Test
    public void addLast() throws Exception {
    }

    @Test
    public void getFirst() throws Exception {
    }

    @Test
    public void getLast() throws Exception {
    }

    @Test
    public void removeFirst() throws Exception {
    }

    @Test
    public void removeLast() throws Exception {
    }

    @Test
    public void offer() throws Exception {
    }

    @Test
    public void remove1() throws Exception {
    }

    @Test
    public void poll() throws Exception {
    }

    @Test
    public void element() throws Exception {
    }

    @Test
    public void peek() throws Exception {
    }

}