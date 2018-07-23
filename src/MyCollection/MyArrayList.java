package MyCollection;


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

    //自定义初始化大小
    public MyArrayList(int capacity) {
        this.capacity = capacity;
        list = (E[]) new Object[capacity];
    }

    public void MyarrayList(E[] e) {
        list = e;
    }


    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index :" + index + "out of bounds");
        }
        //check this size
        if (size >= capacity) {
            E[] list2 = (E[]) new Object[capacity * 2 + 1];
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


    public void clear() {
        for (int i = size; i >= 0; i--) {
            list[i] = null;
        }
        size = 0;
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (list[i] == e)
                return true;
        }
        return false;
    }


    public E get(int index) {
        return list[index];
    }


    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (list[i] == e)
                return i;
        }
        return 0;
    }


    public int lastIndexOf(E e) {

        for (int i = size - 1; i >= 0; i--) {
            if (list[i] == e) {
                return i;
            }
        }
        return -1;
    }


    public E remove(int index) {
        checkIndex(index);
        E s = get(index);
        if (index == size - 1) {
            list[index] = null;
            size--;
        } else {
            for (int i = index; i < size; i++) {
                list[i] = list[i + 1];
            }
            size--;
        }
        return s;
    }


    public E set(int index, E e) {
        checkIndex(index);
        E old = list[index];
        list[index] = e;
        return old;
    }


    public Iterator<E> iterator() {
        return new Itr();
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

    private class Itr implements Iterator<E> {
        int cursor;       // index of next element to return
        int lastRet = -1; // index of last element returned; -1 if no such

        Itr() {
        }

        //
        public boolean hasNext() {
            return cursor != size;
        }

        public E next() {
            cursor += 1;
            return list[cursor-1];
        }

        public void remove() {

        }

    }

}
