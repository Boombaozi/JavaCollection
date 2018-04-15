package com.boombaozi;

/**
 * @program: myCollection
 * @description: 一个自己的Map接口
 * @author: boombaozi.com
 * @create: 2018-04-15 21
 **/
public interface MyMap<k,v> {

    public void clear();

    public  boolean containsKey(k key);

    public  String get(k key);

    public String put(k key,v value);


}
