package date0705.java16.io;

import java.io.*;
import java.util.Arrays;

public class TestData {
    public static void main(String[] args) throws IOException {
//        File filer = new File("dir\\score_highscore.txt");
//        File filew = new File("dir\\score_highscore.txt");
//
//        InputStream fis = new FileInputStream(filer);
//        OutputStream fos = new FileOutputStream(filew);
//
//        DataInputStream fdis = new DataInputStream(fis);
//        DataOutputStream fdos = new DataOutputStream(fos);
//        double a = 1;
//        fdos.writeDouble(a);
//        double v = fdis.readDouble();
//        System.out.println(v);
//
//        fdis.close();
//        fdos.close();
        File file = new File("dir\\score.txt");
        String[] str = file.list();
        System.out.println(Arrays.toString(str));
//        System.out.println(str[0]);
        System.out.println(str.length == 0);


    }
}
