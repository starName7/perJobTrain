package date0701.java14.question.fitst.to.third;


import java.util.*;

public class Third {
    public static void main(String[] args) {
        First first = new First();
//        first.randomNumList(1,100,100);
        List list = first.randomNumList(1, 1000, 100);
        Set set = new HashSet(list);
        int i = 0;
        while (true) {
            if (set.size() == 100) {
                break;
            } else {
                list = first.randomNumList(1, 1000, 100);
                set = new HashSet(list);
                i++;
            }
        }
        System.out.println("循环了 " + i + " 次成功了");
        Iterator it = list.iterator();
        i = 0;
        int min = (int) it.next();
        int max = (int) it.next();
        int sum = 0;
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
            sum += (int) obj;
            if (min > (int)obj) {
                min = (int) obj;
            } else if (max < (int)obj) {
                max = (int) obj;
            }
            i++;
        }
        System.out.println("总数为: " + sum + ",最小的数为: " + min + ",最大的数为: " + max);

    }


}
