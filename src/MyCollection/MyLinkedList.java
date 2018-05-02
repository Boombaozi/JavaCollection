package MyCollection;

import java.util.Iterator;

/**
 * @program: myCollection
 * @description:
 * @author: boombaozi.com
 * @create: 2018-04
 **/
public class MyLinkedList<E> extends MyAbstractList<E>{
    private Node<E> head;
    private Node<E> tail;


    @Override
    public void add(int index, E e) {

    }
    @Override
    public void clear() {

    }
    @Override
    public boolean contains(E e) {
        return false;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int indexOf(E e) {
        return 0;
    }

    @Override
    public int lastIndexOf(E e) {
        return 0;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public E set(int index, E e) {
        return null;
    }

    @Override
    public void show() {
        if(size==0){
            System.out.println("null");
        }else {
            System.out.println("Size :"+size);
            System.out.println("First :"+getFirst());
            System.out.println("Tail :"+getLast());
            Node<E> temp=head;
            while (true){
                System.out.print(temp.element+"->");
                temp=temp.next;
                if(temp.next==null){
                    System.out.print(temp.element+"-END");
                    break;
                }
            }
        }
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }



    public void addFirst(E e){

    }

    public void addLast(E e){
        Node<E> node=new Node<>(e);
        if(tail==null){
            head=tail=node;
        }else {
            tail.next=node;
            tail=tail.next;
        }
        size++;
    }
    public E getFirst(){
        if(head==null) {
            return null;
        }else {
            return head.element;
        }
    }
    public E getLast(){
        if(tail==null) {
            return null;
        }else {
            return tail.element;
        }
    }
    public E removeFirst(){
        return null;
    }
    public E removeLast(){
        return null;
    }

    private static class Node<E>{
        E element;
        Node<E> next;
        public Node(E element){
            this.element=element;
        }
    }
}
