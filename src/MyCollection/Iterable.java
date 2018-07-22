package MyCollection;

import java.util.Iterator;

/**
 * @program: myCollection
 * @description:
 * @author: boombaozi.com
 * @create: 2018-07-22 23
 **/
public interface Iterable<T> {

   public Iterator<T> iterator();
}
