package exam.review.date0627;

import org.junit.Test;

public class Test1 {

    @Test
    public void Test(){
        int num1 = 234;
        double f1 = 23.4;
        String str = String.valueOf(num1);
        String str1 = String.valueOf(f1);
        Integer numInt = Integer.valueOf(num1);

        System.out.println(str);
        System.out.println(numInt);
        System.out.println(str1);
    }

    @Test
    public void Test1(){
//        Integer 里面存储这 127以内的值
        Integer num1 = 127;
        Integer num2 = 127;

        Integer num3 = new Integer(127);
        Integer num4 = new Integer(127);

        System.out.println(num1==num2);
        System.out.println(num3==num4);

        String s1 = "abc";
        String s2 = new String("abc");

        System.out.println(s1 == s2.intern());
    }

    @Test
    public void Test2(){
        Integer num1 = 123;

        int a  = num1.intValue();
        String str = num1.toString();

        System.out.println(str);
        System.out.println(a);
    }

    @Test
    public void Test3(){
        String str = "12.3";
        String str1 = "345";
        Double d = Double.valueOf(str);
        Integer i = Integer.valueOf(str1);


        double d1 = Double.parseDouble(str);
        int a1 = Integer.parseInt(str1);

        System.out.println(d);
        System.out.println(i);
        System.out.println(d1);
        System.out.println(a1);

    }


}
