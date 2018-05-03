package MyCollection;

/**
 * @program: myCollection
 * @description:
 * @author: boombaozi.com
 * @create: 2018-05-03 23
 **/
public interface MyQueue<E> extends Iterable<E>{

//    boolean add(E e);

    boolean offer(E e);

    E remove();


    E poll();


    E element();


    E peek();
}
