package date0624.java8.input.prompt;

import java.util.Scanner;

public class Test {
    private static Scanner input;

    public static void main(String[] args) {
        int index = 0;
        int[] array = new int[10];
        int max,min;
        while(true){
            if(index == array.length){
                break;
            }
            input = new Scanner(System.in);
            try{
                array[index] = input.nextInt();
                index++;
            }
            catch(Exception e){
                System.out.println("输入错误，请重新输入！");
            }

        }
        max = array[0];
        min = array[0];
        for (int i = 1;i< array.length;i++){
            if(array[i] > max){
                max = array[i];
            }
            if (array[i] < min){
                min = array[i];
            }

        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
