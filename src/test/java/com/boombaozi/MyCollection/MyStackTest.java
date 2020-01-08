package com.boombaozi.MyCollection;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyStackTest {

    @Test
    public void normal() throws Exception {
        MyStack<Integer> stack = new MyStack<>();
       
        for (int i = 0; i < 100; i++) {
            stack.push(i);
        }
        for (int j = 0; j < 99; j++) {
            stack.pop();
        }
        System.out.println(stack.peek());
        assertTrue("出入栈顺序错误",stack.peek()==0);
        assertTrue("出栈 入栈 数量错误",stack.size==1);
    }

    @Test
    public void push() throws Exception {
        assertEquals(1, 1);
    }

    @Test
    public void pop() throws Exception {
        assertEquals(1, 1);
    }

    @Test
    public void peek() throws Exception {
        assertEquals(1, 1);
    }

    @Test
    public void isEmpty() throws Exception {
        assertEquals(1, 1);
    }

}