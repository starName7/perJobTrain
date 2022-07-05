package date0705.java16.io.assgin.second;

import java.io.*;
import java.util.Scanner;

public class IOSecond {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        File file = new File("sql2.txt");
        Writer writer = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(writer);
        int index1 = str.indexOf("quit");
        int index2 = str.indexOf("end");
        int index = index1 > index2 ? index1:index2;
        String strFile = str.substring(0,index);
        bw.write(strFile);
        bw.flush();
        bw.close();
    }
}
