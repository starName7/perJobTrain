package date0630.java13.iterator.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
    @Test
    public void test01(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(234);
        coll.add(345);
        Iterator iterator = coll.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            iterator.remove();
            System.out.println(next);
        }
        System.out.println(coll);
    }

    @Test
    public void test02(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(345);
        coll.add(456);
        for (Object o :
                coll) {
            System.out.println(o);
        }
    }

    @Test
    public void test03(){
        int[] ints = {123,123,123,123,123,123,123};
        for (int i :
                ints) {
            System.out.println(i);
        }
    }

    @Test
    public void test04(){

    }
}
