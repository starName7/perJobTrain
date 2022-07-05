package date0705.java16.io.buff.assign.second;

import java.io.*;

public class FileIOSecond {
    public static void main(String[] args) throws IOException {
//        fileIO("file1.txt","file2.txt");
//        fileIO("pic1.jpg","pic2.jpg");
//        fileIO("vid1.mp4","vid2.mp4");
//        fileBuffIO("file1.txt","file2.txt");
//        fileBuffIO("pic1.jpg","pic2.jpg");
//        fileBuffIO("vid1.mp4", "vid2.mp4");
    }

    public static void fileIO(String file1, String file2) throws IOException {
        File fileIO1 = new File("dir\\" + file1);
        File fileIO2 = new File("dir\\" + file2);

        InputStream fileInput = new FileInputStream(fileIO1);
        OutputStream fileOutput = new FileOutputStream(fileIO2, true);

        int len = -1;
        byte[] cache = new byte[1024];

        while ((len = fileInput.read(cache)) != -1) {
            fileOutput.write(cache, 0, len);
        }
    }

    public static void fileBuffIO(String file1, String file2) throws IOException {
        File fileIO1 = new File("dir\\" + file1);
        File fileIO2 = new File("dir\\" + file2);

        InputStream fileInput = new FileInputStream(fileIO1);
        OutputStream fileOutput = new FileOutputStream(fileIO2, true);

        BufferedInputStream bis = new BufferedInputStream(fileInput);
        BufferedOutputStream bos = new BufferedOutputStream(fileOutput);

        int len = -1;
        byte[] cache = new byte[1024];

        while ((len = bis.read(cache)) != -1) {
            bos.write(cache, 0, len);
            bos.flush();
        }
    }
}
