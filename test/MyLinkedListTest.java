import MyCollection.MyLinkedList;
import MyCollection.MyList;

/**
 * @program: myCollection
 * @description:
 * @author: boombaozi.com
 * @create: 2018-05
 **/
public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> list=new MyLinkedList<>();

        list.addLast(3);
        list.addLast(2);
        list.addLast(1);

        list.show();

    }
}
