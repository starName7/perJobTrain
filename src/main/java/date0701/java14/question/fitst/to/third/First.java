package date0701.java14.question.fitst.to.third;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class First {
    public List randomNumList(int min,int max,int size){
        List list = new ArrayList(size);
        while(list.size() <= size){
            list.add((int)(Math.random() * (max - min + 1) + min));
        }
        return list;
    }
    public static void main(String[] args) {
//        个数
        int sum = 0;
//        位置
        int loc = 0;
        First first = new First();
        List list = first.randomNumList(1,100,100);
        Iterator it = list.iterator();
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int i = 0;
        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
            if(Integer.valueOf(num).equals(obj)){
                if(sum == 0){
                    loc = i;
                }
                sum++;
            }
            i++;
        }
        if (sum == 0){
            System.out.println("无");
        }else{
            System.out.println("这个数的首个位置索引为: " + loc + "这个数的个数为: " + sum);
        }

    }
}
