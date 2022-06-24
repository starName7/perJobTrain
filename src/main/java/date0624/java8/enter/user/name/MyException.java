package date0624.java8.enter.user.name;

import java.util.Scanner;

public class MyException extends Exception{
    public static void main(String[] args) throws MyException {
        Scanner input = new Scanner(System.in);
        while(true){
            String username = input.next();
            if(username.length() < 3){
                throw new MyException("用户名小于三位");
            }else if (username.length() > 10){
                throw new MyException("用户名大于10位");
            }else if(username != null && "exit".equals(username)){
                System.out.println("您是高级管理员");
                break;
            }else {
                System.out.println("用户名格式正确");
                break;
            }
        }
    }

    private static final long serialVersionUID = -4901077201660800971L;

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}
