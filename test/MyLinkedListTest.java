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
        MyLinkedList<Integer> list=new MyLinkedList<>();

        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
         list.addLast(11);
         list.addLast(22);
         list.addLast(33);


//        Queue<Integer> queue=new LinkedList<>();
//        queue.peek();
        list.show();

    }
}
