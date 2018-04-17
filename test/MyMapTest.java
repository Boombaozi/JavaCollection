import com.boombaozi.MyHashMap;
import com.boombaozi.MyMap;

/**
 * @program: myCollection
 * @description: test
 * @author: boombaozi.com
 * @create: 2018-04
 **/
public class MyMapTest {
    public static void main(String[] args) {
        MyMap<String, Integer> m = new MyHashMap<>();

        m.put("a235", 100);
        m.put("b54", 100);
        m.put("c4", 100);
        m.put("dr", 100);
        m.put("e3434", 100);

        m.show();
        System.out.println(m.containsValue(100));
        System.out.println(m.containsValue(12300));
        m.remove("b54");
        m.show();
    }
}
