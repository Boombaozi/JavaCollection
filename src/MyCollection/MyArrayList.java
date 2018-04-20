package MyCollection;

import java.util.Iterator;

/**
 * @program: myCollection
 * @description:
 * @author: boombaozi.com
 * @create: 2018-04
 **/
public class MyArrayList<E> extends MyAbstractList<E> {

    private E[] list;

    private static int DEFAULT_INITIAL_CAPACITY = 16;

    private static int capacity;


    public MyArrayList() {
        capacity = DEFAULT_INITIAL_CAPACITY;
        list = (E[]) new Object[capacity];
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        list = (E[]) new Object[capacity];
    }

    public void MyarrayList(E[] e) {
        list = e;
    }

    @Override
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index :" + index + "out of bounds");
        }
        //check this size
        if (size >= capacity) {
            E[] list2 = (E[]) new Object[capacity * 2];
            capacity = capacity * 2;
            for (int i = 0; i < list.length; i++) {
                list2[i] = list[i];
            }
            list = list2;
        }

        if (index == size) {
            list[index] = e;
            size++;
        } else {
            for (int i = size - 1; i >= index; i--) {
                list[i + 1] = list[i];
            }
            list[index] = e;
            size++;
        }


    }

    @Override
    public void clear() {
        for (int i = size; i >=0 ; i--) {
            list[i]=null;
        }
        size=0;
    }

    @Override
    public boolean contains(E e) {
        return false;
    }

    @Override
    public E get(int index) {
        return list[index];
    }

    @Override
    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (list[i] == e)
                return i;
        }
        return 0;
    }

    @Override
    public E remove(int index) {
        checkIndex(index);
        E s=get(index);
        if (index == size - 1) {
            list[index] = null;
            size--;
        } else {
            for (int i = index; i <size; i++) {
                    list[i]=list[i+1];
            }
            size--;
        }
          return  s;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    private void checkIndex(int index) {
        System.out.println(size);
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("index  " + index + "  out of bounds");
    }

    public void show() {
        System.out.println("───────────────────────");
        System.out.println("size :" + size + " capcity :" + capacity);
        for (int i = 0; i < size; i++) {
            System.out.print("[" + i + "]" + list[i].toString() + ",");
        }
        System.out.println();
        System.out.println("───────────────────────");
    }
}
