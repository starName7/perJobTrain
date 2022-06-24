package date0623.java7.cakeFactory;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cake;
        for (;;){
            System.out.println("请客户输入要生产的蛋糕，如要选择不生产请输入\"不生产\"");
            System.out.println("可生产的蛋糕有\"芝士\"，\"水果\"，\"奶油\"，\"巧克力\"");
            cake = input.next();
            if(cake.equals("不生产")){
                break;
            }
            switch (cake){
                case "芝士":
                    System.out.println(Work.work(new CheeseFactory()));
                    break;
                case "水果":
                    System.out.println(Work.work(new FruitsFactory()));
                    break;
                case "奶油":
                    System.out.println(Work.work(new CreamFactory()));
                    break;
                case "巧克力":
                    System.out.println(Work.work(new ChocolateFactory()));
                    break;
                default:
                    System.out.println("请输入正确的蛋糕名称");
            }

        }
    }
}
