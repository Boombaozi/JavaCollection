package com.boombaozi.MyCollection;

/**
 * @program: myCollection
 * @description:
 * @author: boombaozi.com
 * @create: 2018-07-23 23
 **/
public  interface  Iterator<E> {

    public boolean 	hasNext();

    public E next();

    public void remove();

}
