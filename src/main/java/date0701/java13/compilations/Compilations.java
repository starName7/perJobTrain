package date0701.java13.compilations;

import org.junit.Test;

import java.awt.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

/**
 *
 */
public class Compilations {
    @Test
    public void test01() {
        BigDecimal d1 = new BigDecimal("3.0");
        BigDecimal d2 = new BigDecimal("2.9");

//        将d1减d2的差赋值给d3，并输出
        BigDecimal d3 = d1.subtract(d2);
        System.out.println(d3);
//        将d1除d2的商保留八位小数结尾四舍五入的值赋值给d4，并输出
        BigDecimal d4 = d1.divide(d2, 8, BigDecimal.ROUND_HALF_UP);
        System.out.println(d4);
    }

    /**
     * 创建list的集合，将字符串存入到集合里，获取集合的长度，输出集合的内容，清空当前集合，判断集合是否为空
     */
    @Test
    public void test02(){
        List list = new ArrayList();
//        向结合里添加内容
        list.add("One");
        list.add("Two");
        list.add("Three");
//        查看集合当前的长度
        System.out.println(list.size());
//        输出当前的集合
        System.out.println(list.toString());
//        请空当前集合
        list.clear();
//        查看当前集合是否为空，如果为空返回true
        System.out.println(list.isEmpty());
    }

    /**
     * 创建list集合，将将三个匿名对象存入list集合中，创建Point类的对象并将空间地址赋值给Point类型的变量p
     * 利用 list接口提供，ArrayList类重写之后而的contains的方法判断当前集合是否包含变量p所指向的对象相等的对象。
     * 如果包含包含删除集合中的此对象，然后输出当前集合
     */
    @Test
    public void test03(){
        List list = new ArrayList();
        list.add(new Point(1,2));
        list.add(new Point(3,4));
        list.add(new Point(5,6));
//        System.out.println(list);

        Point p = new Point(1,2);
//        判断当前集合中是否包含变量p所指向的对象相等的对象
        if(list.contains(p)){
//            删除集合中的指定内容
            list.remove(p);
        }
        System.out.println(list);
    }
    @Test
    public void test04(){
        List list = new ArrayList();
        list.add("one");
        list.add("two");
        list.add("#");
        list.add("three");
        list.add("#");
//        获取当前集合的迭代器
        Iterator it = list.iterator();
//        使用迭代器，遍历当前集合，如果当前节点存在下一个节点，就继续执行循环
        while(it.hasNext()){
//            获取迭代器当前所指向节点的下一个节点的内容
            Object obj = it.next();
//            判断迭代器所指向的节点的下一个节点的内容是否和字符串"#"内容相等，如果相等执行删除操作
            if("#".equals(obj)){
//                删除在集合中迭代器当前节点的下一个节点的内容
                it.remove();
            }
        }
        System.out.println(list);
    }

//    @Test
//    public void test05(){
//        List list = new ArrayList();
//        list.add(123);
//        list.add(234);
//        list.add(345);
//        list.add(0,567);
//        list.set(0,908);
//        System.out.println(list);
//    }
    public String[] array(List list){
        String[] str = new String[list.size()];
       Iterator it = list.iterator();
       int i = 0;
       while(it.hasNext()){
           Object obj = it.next();
           str[i] = (String) obj;
           i++;
       }
       return str;
    }

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("one");
        list.add("two");
        list.add("#");
        list.add("three");
        list.add("#");
        Compilations c = new Compilations();
        String[] str = c.array(list);
        for (String s :
                str) {
            System.out.println(s);
        }

    }
}
