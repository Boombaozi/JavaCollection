package MyCollection;


import org.junit.Test;


import static org.junit.Assert.*;



public class MyArrayListTest {

    MyList<String> arrayList = new MyArrayList<String>();


    @Test
    public void myarrayList() throws Exception {

    }

    @Test
    public void add() throws Exception {
        arrayList.add("测试");
        arrayList.add("测试");
        arrayList.add("测试");
        arrayList.add("测试");
        assertEquals(arrayList.size(), 4);
        arrayList.clear();
    }

    @Test
    public void clear() throws Exception {
        arrayList.add("s");
        arrayList.remove(0);
        arrayList.add("dd");
        arrayList.clear();
        assertEquals(arrayList.size(), 0);
    }

    @Test
    public void contains() throws Exception {
        Boolean b = arrayList.contains("测试");
        assertEquals(b, false);
        arrayList.add("测试");
        Boolean b2 = arrayList.contains("测试");
        assertEquals(b2, true);
    }

    @Test
    public void get() throws Exception {
    }

    @Test
    public void indexOf() throws Exception {
    }

    @Test
    public void lastIndexOf() throws Exception {
    }

    @Test
    public void remove() throws Exception {
    }

    @Test
    public void set() throws Exception {

    }

    @Test
    public void iterator() throws Exception {
        for (int i = 0; i <30 ; i++) {
            arrayList.add("s"+i);
        }
         Iterator iterator=     arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void show() throws Exception {
        for (int i = 0; i <30 ; i++) {
            arrayList.add("s"+i);
        }
        arrayList.show();
    }

}