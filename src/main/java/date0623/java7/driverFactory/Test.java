package date0623.java7.driverFactory;

import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请老板输入司机需要开的车");
        String vehicle = input.next();
        for (; ; ) {
            if (vehicle.equals("benz")){
                System.out.println(Work.work(new BenzFactory()));
                break;
            }else if (vehicle.equals("bmw")){
                System.out.println(Work.work(new BmwFactory()));
                break;
            }else{
                System.out.println("请输入您拥有的车");
            }
        }

    }
}
