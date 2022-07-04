package date0630.java13.set.test;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    @Test
    public void test01(){
        Set set = new HashSet();
        set.add("123");
        set.add("234");
        set.add("345");
        set.add("466");
        System.out.println(set);

    }
}
