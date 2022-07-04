package date0630.java13.collection.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
    @Test
    public void test01(){
        Collection list = new ArrayList();
        Collection list1 = new ArrayList();
        list1.add(123);
        Collection list2 = new ArrayList(list1);
        System.out.println(list2);
    }
    @Test
    public void test02(){
        Collection list = new ArrayList();
        list.add(123);
        list.add("123");
        System.out.println(list);
    }
    @Test
    public void test03(){
        Collection coll1 = new ArrayList();
        coll1.add(123);
        coll1.add("123");
        Collection coll2 = new ArrayList();
        coll2.add("abc");
        coll1.addAll(coll2);
        System.out.println(coll1);
    }

    @Test
    public void test04(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add("123");
        System.out.println(coll.size());
    }

    @Test
    public void test05(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add("123");
        coll.clear();
        System.out.println(coll);
    }

    @Test
    public void test06(){
        Collection coll = new ArrayList();
        System.out.println(coll.isEmpty());
    }

    @Test
    public void test07(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add("123");
        System.out.println(coll.contains("abc"));
    }

    @Test
    public void test08(){
        Collection coll1 = new ArrayList();
        Collection coll2 = new ArrayList();
        coll1.add("abc");
        coll1.add(123);
        coll2.add("abc");
        System.out.println(coll1.containsAll(coll2));
        coll2.add(234);
        System.out.println(coll1.containsAll(coll2));
    }
    @Test
    public void test09(){
        Collection coll1 = new ArrayList();
        coll1.add("abc");
        coll1.add("abc");
        coll1.remove("abc");
        coll1.remove("123");
        System.out.println(coll1);
    }

    @Test
    public void test10(){
        Collection coll1 = new ArrayList();
        Collection coll2 = new ArrayList();
        coll1.add(123);
        coll1.add(234);
        coll2.add(234);
        boolean b = coll1.retainAll(coll2);
        System.out.println(b);
        System.out.println(coll1);
    }

    @Test
    public void test11(){
        Collection coll1 = new ArrayList();
        Collection coll2 = new ArrayList();
        coll1.add(123);
        coll1.add(234);
        coll2.add(555);
        boolean b = coll1.retainAll(coll2);
        System.out.println(b);
        System.out.println(coll1);
        coll2.add(456);
        coll1.add(666);
        boolean c = coll1.retainAll(coll2);
        System.out.println(c);
        System.out.println(coll1);
    }

    @Test
    public void test12(){
        Collection coll1 = new ArrayList();
        Collection coll2 = new ArrayList();
        coll1.add("abc");
        coll2.add("abc");
        System.out.println(coll1.equals(coll2));
    }

    @Test
    public void test13(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(234);
        Object[] objects = coll.toArray();
        System.out.println(Arrays.toString(objects));
    }

    @Test
    public void test14(){
        Collection coll = new ArrayList();
        coll.add(1234);
        coll.add(1234);
        System.out.println(coll.hashCode());
    }

    @Test
    public void test15(){
        Collection coll = new ArrayList();
        coll.add(123);
        Iterator it = coll.iterator();
    }
}
