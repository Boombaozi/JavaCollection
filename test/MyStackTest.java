import MyCollection.MyStack;

/**
 * @program: myCollection
 * @description:
 * @author: boombaozi.com
 * @create: 2018-05
 **/
public class MyStackTest {
    public static void main(String[] args) {
        MyStack<Integer> stack=new MyStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.show();

        stack.pop();
        stack.pop();

        stack.show();
    }
}
