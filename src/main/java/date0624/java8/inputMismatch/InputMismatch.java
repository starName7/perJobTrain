package date0624.java8.inputMismatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = 0,n = 0;
        while(true){
            System.out.println("m = " + m + ",n = " + n);
            try{
                m = input.nextInt();
                n = input.nextInt();
                System.out.println("Sum is" + (m + n));
                break;
            }catch(InputMismatchException e){
                System.out.println("Incorrect inpty and re-enter two integers.");
//                TODO: 使用next()结束死循环是因为什么，缓冲区吗？
                input.next();
                continue;
            }
        }
        input.close();
    }
}
