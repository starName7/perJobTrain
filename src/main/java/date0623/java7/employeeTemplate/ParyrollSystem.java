package date0623.java7.employeeTemplate;

import java.util.Scanner;

public class ParyrollSystem {


    public static void main(String[] args) {
        int year;
        int month;
        int day;
        int number;
        int hour;
        Employee employee[] = new Employee[10];
        for (int i = 0; i < employee.length; i++) {
            year = (int) (Math.random() * 11 + 1990);
            month = (int) (Math.random() * 12 + 1);
            day = (int) (Math.random() * 31 + 1);
            number = (int) (Math.random() * 99999 + 10000);
            hour = (int) (Math.random() * 24 +1);
            int observer = (int)(Math.random() * 10 +1);
            if(month == 2){
                for (; ; ) {
                    if (day < 29) {
                        break;
                    }
                    day = (int) Math.random() * 31 + 1;
                }
            }
            if(observer % 2 == 0){
                employee[i] = new SalariedEmployee("员工"+(i+1),number,new MyDate(year,month,day),5000);
            }else{
                employee[i] = new HourlyEmployee("员工"+(i+1),number,new MyDate(year,month,day),20,hour);
            }
        }
        for(int i = 0;i<employee.length;i++){
            System.out.println(employee[i]);
        }
        Scanner input = new Scanner(System.in);
        System.out.println("请输入当前的月份");
        int samemonth = input.nextInt();
        for (int i = 0;i< employee.length; i++){
            if(employee[i].getBirthday().getMonth() == samemonth){
                System.out.println(employee[i].getName() + "是本月过生日的员工");
                System.out.println("当前的工资为：" +  employee[i].earnings() );
                System.out.println("他本月的工资为" + (employee[i].earnings() + 100));
                System.out.println();
            }
        }
    }


}
