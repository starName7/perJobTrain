package date0705.java16.io.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOUtils {
    public static void copyFile(File src, File dest)throws Exception{
        InputStream ips = new FileInputStream(src);
        OutputStream ops = new FileOutputStream(dest);

        BufferedInputStream fis = new BufferedInputStream(ips);
        BufferedOutputStream fos = new BufferedOutputStream(ops);

        int len = -1;
        byte[] cache = new byte[1024 * 8];

        while ((len = fis.read(cache)) != -1){
            fos.write(cache,0,len);
            fos.flush();
        }
        fis.close();
        fos.close();
    }

    public static void copy(InputStream is, OutputStream os) throws IOException{
        int len = -1;
        byte[] cache = new byte[1024];
        while((len = is.read(cache)) != 1024){
            os.write(cache,0,len);
        }
        is.close();
        os.close();
    }

    public static void saveDouble(double data,OutputStream dest) throws IOException {
        DataOutputStream fdos = new DataOutputStream(dest);
        fdos.writeDouble(data);
        fdos.close();
    }
    public static double loadDouble(InputStream src) throws IOException {
        DataInputStream fdis = new DataInputStream(src);
        double d = fdis.readDouble();
        return d;
    }

    public static void saveLines(String[] lines,OutputStream src)throws IOException{
        OutputStreamWriter osw = new OutputStreamWriter(src);
        BufferedWriter fw = new BufferedWriter(osw);
       for (int i = 0;i < lines.length;i++){
           fw.write(lines[i]);
           fw.newLine();
           fw.flush();
       }
       fw.close();
    }
    public static String[] loadLines(InputStream src)throws IOException{
        InputStreamReader isr = new InputStreamReader(src);
        BufferedReader br = new BufferedReader(isr);
        String str = null;
        List<String> arrStr = new ArrayList<>();
        int i = 0;
        while ((str = br.readLine()) != null){
            arrStr.add(str);
        }
        br.close();
        return arrStr.toArray(new String[] {});
    }
}
