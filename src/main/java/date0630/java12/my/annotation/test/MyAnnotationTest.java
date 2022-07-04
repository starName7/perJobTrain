package date0630.java12.my.annotation.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

@MyAnnotation(value = "TIC",a = 3)
public class MyAnnotationTest {
    public static void main(String[] args) throws NoSuchMethodException {
        Class clazz = MyAnnotationTest.class;
        System.out.println(clazz);
        Annotation a = clazz.getAnnotation(MyAnnotation.class);
        System.out.println(a);
        MyAnnotation m = (MyAnnotation) a;
        String info = m.value();
        int i = m.a();
        System.out.println(info);
        System.out.println(i);

//        Method method = clazz.getMethod("test", null);
//
//        System.out.println(method);
//        System.out.println(method.getAnnotations());
//        System.out.println(method.getDeclaredAnnotations());
//        System.out.println(method.getAnnotation(MyAnnotation.class));
    }

//    @MyAnnotation(value = "abc")
    public String test() {
        return "";
    }
}
