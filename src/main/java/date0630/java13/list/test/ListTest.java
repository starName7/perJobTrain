package date0630.java13.list.test;

import org.junit.Test;

import java.util.*;

public class ListTest {
    @Test
    public void test01(){
        List list = new ArrayList();
        System.out.println(list.size());
    }

    @Test
    public void test02(){
        List list = new ArrayList();
        System.out.println(list.isEmpty());
    }
    @Test
    public void test03(){
        List list = new ArrayList();
        list.add(123);
        list.add(234);
        System.out.println(list.contains(123));
    }

    @Test
    public void test04(){
        List list = new ArrayList();
        Iterator iterator = list.iterator();
    }
    @Test
    public void test05(){
        List list = new ArrayList();
        list.add(123);
        list.add(234);
        Object[] objects = list.toArray();
        for (Object object :
                objects) {
            System.out.println(object);
        }
    }

    @Test
    public void test06(){
        List list = new ArrayList();
        list.add(123);
        list.add(234);
        list.add(0,123);
        System.out.println(list);
    }
    @Test
    public void test07(){
        List list = new ArrayList();
        list.add("123");
        list.add("234");
        list.add("123");
        list.remove("123");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
    @Test
    public void test08(){
        List list1 = new ArrayList();
        List list2 = new ArrayList();

        list1.add(123);
        list1.add(234);

        list2.add(123);

        boolean b = list1.retainAll(list2);
        System.out.println(b);
        System.out.println(list1);
    }

    @Test
    public void test09(){
        List list = new ArrayList();
        list.add(123);
        list.clear();
        System.out.println(list);
    }

    @Test
    public void test10(){
        List list = new ArrayList();
        list.add(123);
        list.add(234);
        list.add(345);
        System.out.println(list.get(2));
        for (int i = 0; i < list.size();i++){
            System.out.println(list.get(i));
        }
    }

    @Test
    public void test11(){
        List list = new ArrayList();
        list.add("123");
        list.add("234");
        list.set(1,"abc");
        System.out.println(list);
    }

    @Test
    public void test12(){
        List list = new ArrayList();
        list.add(123);
        list.add(234);
        list.add(345);
        ListIterator listIterator = list.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
            System.out.println(listIterator.nextIndex());
        }
    }

    @Test
    public void test14(){
        List list = new ArrayList();
        list.add(123);
        list.add(234);
        list.add(123);
        list.replaceAll(x->{
            if((int)x == 123){
                return "abc";
            }
            return x;
        });
//        list.replaceAll();
        System.out.println(list);
    }

    @Test
    public void test15(){
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
               int a  = (int) o1;
               int b = (int) o2;
               return a - b > 0 ? -1 : 1;
            }
        });
        System.out.println(list);
    }

    @Test
    public void test16(){
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        Spliterator spliterator = list.spliterator();
        System.out.println(spliterator.estimateSize());
        while(spliterator.tryAdvance(x ->{
            System.out.println(x);
        }));
    }

    @Test
    public void test17(){
        List list = Arrays.asList('a',1,"asdf");
        System.out.println(list);
    }
}
