package date0705.java16.io.buff.assign.third;

import java.io.*;

public class FileIOThird {
    public static void main(String[] args) throws IOException {
        File fileIO1 = new File("dir\\pic1.jpg");
        File fileIO2 = new File("dir\\pic2.jpg");

        InputStream fileInput = new FileInputStream(fileIO1);
        OutputStream fileOutput = new FileOutputStream(fileIO2, true);

        BufferedInputStream bis = new BufferedInputStream(fileInput);
        BufferedOutputStream bos = new BufferedOutputStream(fileOutput);

        int len = -1;
        byte[] cache = new byte[1024];
        while ((len = bis.read(cache)) != -1) {
            byte[] cacheClone = cache;
            for (int i = 0;i < cacheClone.length;i++){
                cacheClone[i] = (byte) (cacheClone[i] ^ 5);
            }
            bos.write(cacheClone, 0, len);
            bos.flush();
        }
    }

}
