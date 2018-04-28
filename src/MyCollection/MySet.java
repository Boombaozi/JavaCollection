package MyCollection;

/**
 * @program: myCollection
 * @description:
 * @author: boombaozi.com
 * @create: 2018-04-28 12
 **/
public interface MySet<E> extends java.lang.Iterable<E> {

    public void clear();

    public boolean contains(E e);

    public boolean add(E e);

    public boolean remove(E e);

    public boolean isEmpty();

    public int size();

    public void show();
}
