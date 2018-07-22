package MyCollection;

/**
 * @program: myCollection
 * @description: MyList interface
 * @author: boombaozi.com
 * @create: 2018-04-17 16
 **/
public interface MyList<E> extends Iterable {

    public void add(E e);

    public void add(int index,E e);

    public void clear();

    public boolean contains(E e);

    public E get(int index);

    public int indexOf(E e);

    public boolean isEmpty();

     public int lastIndexOf(E e);

    public boolean remove(E e);

    public E remove(int index);

    public int size();

    public E set(int index,E e);

    public void show();
}
