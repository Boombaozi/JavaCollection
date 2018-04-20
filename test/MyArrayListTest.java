import MyCollection.MyArrayList;
import MyCollection.MyList;

/**
 * @program: myCollection
 * @description:
 * @author: boombaozi.com
 * @create: 2018-04
 **/
public class MyArrayListTest {
    public static void main(String[] args) {
        MyList<String> s = new MyArrayList<>();
        for (int i = 0; i < 100; i++) {
            s.add("" + i);
            s.show();
        }
        s.clear();
        s.show();

    }
}
