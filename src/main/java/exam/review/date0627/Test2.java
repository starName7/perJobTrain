package exam.review.date0627;

import org.junit.Test;

public class Test2 {
    @Test
    public void test1(){
//        String str1 = 4;
        String str2 = 3.5f + "";
        System.out.println(str2);
        System.out.println(2+4+"Hello!");
        System.out.println("Hello!" +3+4);
        System.out.println('a' + 1+"Hello!");
        System.out.println("Hello" + 'a' + 1);
    }
    @Test
    public void test2(){
//        常量的赋值是在编译之前
        short s = 5;
        s = (short) (s-2);
        System.out.println(s);

        byte b = 3;
        b = (byte) (b +4);
        System.out.println(b);

        char c = 'a';
        int i = 5;
        float d = .31F;
        double result = c + i + d;
        System.out.println(result);

    }
    @Test
    public void test3(){
        int a[] = new int[]{1,3,4,5,6};
        int b[] = new int[]{5,6,2,3,6};
        System.out.println(a.equals(b));

    }
}
