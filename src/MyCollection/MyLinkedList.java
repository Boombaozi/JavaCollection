package MyCollection;

import java.util.Iterator;

/**
 * @program: myCollection
 * @description: 实现了MyList 和 MyQueue接口
 * @author: boombaozi.com
 * @create: 2018-04
 **/
public class MyLinkedList<E> extends MyAbstractList<E>
        implements MyList<E>, MyQueue<E> {
    private Node<E> head;
    private Node<E> tail;

    @Override
    public void add(int index, E e) {
        if(index<0||index>size){
            return;
        }
        if(index==size){
            addLast(e);
            return;
        }
        if(index==0){
            addFirst(e);
            return;
        }
        Node<E> newnode=new Node<>(e);
        Node<E> temp = head;
        int sum = 0;
        while (true) {
            if (sum == index-1) {
                newnode.next= temp.next;
                temp.next=newnode;
                size++;
                return;
            }

            temp = temp.next;
            sum++;
        }
    }

    @Override
    public void clear() {
        head = tail = null;
        size = 0;
    }

    @Override
    public boolean contains(E e) {
        Node<E> temp = head;
        while (true) {
            if (temp.next == null) {
                if (temp.element == e) {
                    return true;
                }
                return false;
            }
            if (temp.element == e) {
                return true;
            }
            temp = temp.next;
        }
    }

    @Override
    public E get(int index) {
        Node<E> temp = head;
        int sum = 0;
        while (true) {
            if (sum == index) {
                return temp.element;
            }
            temp = temp.next;
            sum++;
        }
    }

    @Override
    public int indexOf(E e) {
        Node<E> temp = head;
        int sum=0;
        while (true) {
            if (temp.next == null) {
                if (temp.element == e) {
                    return sum;
                }
                return -1;
            }
            if (temp.element == e) {
                return sum;
            }
            temp = temp.next;
            sum++;
        }
    }

    @Override
    public int lastIndexOf(E e) {
        return -1;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public E set(int index, E e) {
        if(index<0||index>=size){
            return null;
        }
        Node<E> temp = head;
        int sum = 0;
        while (true) {
            if (sum == index) {
                E temint= temp.element;
                temp.element=e;
                return temint;
            }
            temp = temp.next;
        }
    }

    @Override
    public void show() {
        if (size == 0) {
            System.out.println("null");
        } else {
            System.out.println("Size :" + size);
            System.out.println("First :" + getFirst());
            System.out.println("Tail :" + getLast());
            Node<E> temp = head;
            while (true) {
                System.out.print(temp.element + "->");
                temp = temp.next;
                if (temp.next == null) {
                    System.out.print(temp.element + "-END");
                    break;
                }
            }
        }
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }


    public void addFirst(E e) {
        Node<E> node = new Node<>(e);
        if (head == null) {
            head = tail = node;
            size++;
        } else {
            node.next = head;
            head = node;
            size++;
        }
    }

    public void addLast(E e) {
        Node<E> node = new Node<>(e);
        if (tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = tail.next;
        }
        size++;
    }

    public E getFirst() {
        if (head == null) {
            return null;
        } else {
            return head.element;
        }
    }

    public E getLast() {
        if (tail == null) {
            return null;
        } else {
            return tail.element;
        }
    }

    public E removeFirst() {
        if (head == null) {
            return null;
        } else if (head.next != null) {
            head = head.next;
            size--;
            return head.element;
        } else {
            E temp;
            temp = head.element;
            head = null;
            size--;
            return temp;
        }
    }

    public E removeLast() {
        return null;
    }


    private static class Node<E> {
        E element;
        Node<E> next;

        public Node(E element) {
            this.element = element;
        }
    }


    //stack
    @Override
    public boolean offer(E e) {
        return false;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E element() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

}
