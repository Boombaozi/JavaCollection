package com.boombaozi.MyCollection;

/**
 * @program: myCollection
 * @description:
 * @author: boombaozi.com
 * @create: 2018-05
 **/
public class MyStack<E> extends MyArrayList<E> {

    //压入一个元素
    public E push(E e) {
        add(e);
        return e;
    }
    //出栈
    public E pop(){
        if(size==0){
          return null;
        }
      return remove(size-1);
    }

    //查看栈顶元素
    public E peek() {
        if(size==0){
            return null;
        }
        return get(size-1);
    }

    //是否为空
    public boolean isEmpty() {
        return size() == 0;
    }


}
