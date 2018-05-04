import MyCollection.MyLinkedList;
import MyCollection.MyList;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: myCollection
 * @description:
 * @author: boombaozi.com
 * @create: 2018-05
 **/
public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(11);
        list.addLast(22);
        list.addLast(33);
        list.add(6,111);
        list.add(0,111);
        list.add(3,111);
        System.out.println(list.get(0));
        System.out.println(list.get(2));
        System.out.println(list.get(5));
        System.out.println("indexof :"+list.indexOf(33));
        System.out.println(list.contains(3));
        System.out.println(list.contains(34));

        list.show();
        list.clear();
        list.show();
    }


}
