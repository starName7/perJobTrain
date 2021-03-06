package date0704.java16.io.file;

import java.io.*;

public class FileIO {
    public static void main(String[] args) throws IOException {
        File file1 = new File("sql.txt");
        File file2 = new File("sqil.txt");

        if(!file2.exists()){
            file2.createNewFile();
        }
        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file2);
        int len = -1;
        byte[] cache = new byte[1024];
        while((len = fis.read(cache)) != -1){
            fos.write(cache,0,len);
        }
        fis.close();
        fos.close();
    }
}
