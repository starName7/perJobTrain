package date0705.java16.io.assgin.third;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IOThird {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入需要读取的文件");
        String readerFile = input.next();
        System.out.println("请输入需要写入的文件");
        String writerFile = input.next();
        File fileR = new File(readerFile);
        File fileW = new File(writerFile);
        Reader reader = new FileReader(fileR);
        Writer writer = new FileWriter(fileW);
        BufferedReader fbr = new BufferedReader(reader);
        BufferedWriter fbw = new BufferedWriter(writer);
        String str = null;
        List<String> list = new ArrayList<>();
        while ((str = fbr.readLine()) != null) {
            list.add(str);
        }
        for (int i = list.size() - 1; i > 0; i--) {
            fbw.write(list.get(i));
            fbw.newLine();
            fbw.flush();
        }
        fbr.close();
        fbw.close();

    }
}
