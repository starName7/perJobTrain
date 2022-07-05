package date0705.java16.io.buff.assign.first;

import java.io.*;

public class FileIOFirst {


    public static void main(String[] args) throws IOException {
        File file1 = new File("sql.txt");
        File file2 = new File("sql2.txt");

        FileReader fr = new FileReader(file1);
        FileWriter fw = new FileWriter(file2, true);

        Reader reader = fr;
        Writer writer = fw;

        BufferedReader br = new BufferedReader(reader);
        BufferedWriter bw = new BufferedWriter(writer);
        int len = -1;
        char[] cache = new char[1023];

        while ((len = br.read(cache)) != -1) {
            bw.write(cache, 0, len);
        }
        bw.close();
        br.close();
    }
}
