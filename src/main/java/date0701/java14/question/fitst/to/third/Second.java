package date0701.java14.question.fitst.to.third;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        First first = new First();
        int M = input.nextInt();
        List list = first.randomNumList(1,M,M);
        Iterator it = list.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            if(Integer.valueOf(M).equals(obj)){
                sum++;
            }
        }
        if(sum == 0){
            System.out.println("总和为0");
        }else{
            System.out.println("总和为" + sum);
        }
    }
}
