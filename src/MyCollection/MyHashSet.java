package MyCollection;

import java.util.LinkedList;

/**
 * @program: myCollection
 * @description:
 * @author: boombaozi.com
 * @create: 2018-04
 **/
public class MyHashSet<E> implements MySet<E> {

    private int size = 0;

    private static int DEFAULT_INITIAL_CAPACITY = 10;

    private int capacity;

    private static float DEFAULT_MAX_LOAD_FACTOR = 0.75f;

    private float loadFactorThreshold;

    private LinkedList<E>[] table;


    public MyHashSet() {
        capacity = DEFAULT_INITIAL_CAPACITY;
        table = new LinkedList[capacity];
    }

    public MyHashSet(int capacity) {
        this.capacity = capacity;
        table = new LinkedList[capacity];
    }

    @Override
    public void clear() {

    }


    @Override
    public boolean contains(E e) {
        return false;
    }

    @Override
    public boolean add(E e) {
        if (size >= capacity) {
            LinkedList<E>[] temp = new LinkedList[capacity * 2];

            for (int i = 0; i < table.length; i++) {
                if (table[i] == null)
                   continue;
                for (E e1 : table[i]) {
                    int index = hash(e1);
                    if (temp[index] == null) {
                        temp[index] = new LinkedList<E>();
                    }
                    temp[index].add(e1);
                }
            }
            table = temp;
            this.capacity = capacity * 2;
        }
        int index = hash(e);

        if (table[index] == null) {
            table[index] = new LinkedList<E>();
        }
        if (table[index].contains(e)) {
            return true;
        } else {
            table[index].add(e);
            size += 1;
            return true;
        }
    }

    @Override
    public boolean remove(E e) {
        int index = hash(e);

        if (table[index] == null) {
            return false;
        } else if (table[index].contains(e)) {
            table[index].remove(e);
            size -= 1;
        } else {
            return false;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void show() {
        System.out.println("───────────────────────");
        float lamda = (float) size / (float) capacity;

        System.out.println(" length = " + capacity + "  rehash :" + loadFactorThreshold);
        System.out.println(" size = " + size + "  lamda :" + lamda);
        for (int index = 0; index < table.length; index++) {
            if (table[index] == null) {
                System.out.println(" [" + index + "]" + "[null]");
            } else {
                System.out.print(" [" + index + "]");
                for (E e : table[index]) {

                    System.out.print(e.toString() + "→");
                }
                System.out.println();
            }
        }
        System.out.println("───────────────────────");

    }

    @Override
    public MyCollection.Iterator<E> iterator() {
        return null;
    }


    private int hash(E e) {

        return (e.hashCode() % capacity);
    }
}
