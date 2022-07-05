package date0705.java16.io.assgin.first;

import java.io.*;
import java.util.Scanner;

public class IOFirst {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        File file = new File(str);
        if(file.exists()){
            Reader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            String strFile = null;
            while((strFile = br.readLine()) != null){
                System.out.println(strFile);
            }
        }else{
            System.out.println("您输入的文件不存在");
        }
    }
}
