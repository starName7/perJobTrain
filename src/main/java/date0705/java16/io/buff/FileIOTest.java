package date0705.java16.io.buff;

import java.io.*;

public class FileIOTest {
    public static void main(String[] args) throws IOException {
        File file1 = new File("sql.txt");
        File file2 = new File("sql2.txt");
        InputStream is = new FileInputStream(file1);
        OutputStream os = new FileOutputStream(file2,true);
        BufferedInputStream fis = new BufferedInputStream(is);
        BufferedOutputStream fos = new BufferedOutputStream(os);

        int len = 0;
        byte[] cache = new byte[8192];
        while((len = fis.read(cache)) != -1){
            fos.write(cache,0,len);
            fos.flush();
        }
        fos.close();
        fis.close();
    }
}
