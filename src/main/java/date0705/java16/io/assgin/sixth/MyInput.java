package date0705.java16.io.assgin.sixth;

import java.util.Scanner;

public class MyInput {
    private MyInput(){}
    public static String readString(){
        Scanner input = new Scanner(System.in);
        String str = input.next();
        return str;
    }
    public static int readInt(){
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        return i;
    }
    public static double readDouble(){
        Scanner input = new Scanner(System.in);
        double d = input.nextDouble();
        return d;
    }
    public static double readByte(){
        Scanner input = new Scanner(System.in);
        byte b = input.nextByte();
        return b;
    }
    public static double readShort(){
        Scanner input = new Scanner(System.in);
        short s = input.nextShort();
        return s;
    }
    public static double readFloat(){
        Scanner input = new Scanner(System.in);
        float f = input.nextFloat();
        return f;
    }
}
