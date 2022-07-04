package date0701.java14.question.sixth;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("Tom", 88);
        map.put("Jerry", 99);
        map.put("Michael", 78);
        map.put("Jeck", 67);
        map.put("Mark", 69);
        map.put("Lily", 56);

//        System.out.println(map.keySet());
        System.out.println(map.size());
        int[] value = new int[map.size()];
        String[] key = new String[map.size()];
        Set set = map.keySet();
        int i = 0;
        for (Object o :
                set) {
            key[i] = (String) o;
            value[i] = (int) map.get(o);
            i++;
        }
        for (i = 0; i < value.length - 1; i++) {
            for (int j = 0; j < value.length - i - 1; j++) {
                if (value[j] > value[j + 1]) {
                    int temp = value[j];
                    value[j] = value[j + 1];
                    value[j + 1] = temp;
                    String str = key[j];
                    key[j] = key[j + 1];
                    key[j + 1] = str;
                }
            }
        }
        System.out.println(key[key.length - 1]);
        System.out.println(key[key.length - 2]);
        System.out.println(key[key.length - 3]);

    }
}
