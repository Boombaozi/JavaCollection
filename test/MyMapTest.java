import com.boombaozi.MyHashMap;
import com.boombaozi.MyMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: myCollection
 * @description: test
 * @author: boombaozi.com
 * @create: 2018-04
 **/
public class MyMapTest {
    public static void main(String[] args) {
        MyMap<String, Integer> m = new MyHashMap<>();
        m.put("e", 300);
        m.put("a", 400);
        m.put("c", 400);

        m.put("d1", 400);
        m.put("c1", 500);
        m.put("e1", 300);
        m.put("a2", 400);
        m.put("c3", 400);

        m.put("d4", 400);
        m.put("c5", 500);
        m.put("e6", 300);
        m.put("a7", 400);
        m.put("c8", 400);

        m.put("d9", 400);
        m.put("c0", 500);

        m.put("d13", 400);
        m.put("c14", 500);
        m.put("e12", 300);
        m.put("a21", 400);
        m.put("c33", 400);

        m.put("d44", 400);
        m.put("c55", 500);
        m.put("e66", 300);
        m.put("a76", 400);
        m.put("c84", 400);

        m.put("d93", 400);
        m.put("c02", 500);
        m.show();

        System.out.println(m.get("e"));


    }
}
