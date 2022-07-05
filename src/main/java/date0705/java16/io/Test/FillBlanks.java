package date0705.java16.io.Test;

import junit.framework.TestCase;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FillBlanks {
    /**
     * 将文件内容赋值到另一个文件内
     * @param is  输入文件
     * @param os  输出文件
     * @throws IOException
     */
    public static void copy(InputStream is, OutputStream os) throws IOException {
        byte[] buffer = new byte[8*1024];
        int b = -1;
//       查看是否还有流数据存在，如果存在继续执行循环，如果不存在结束循环
        while((b = is.read(buffer)) != -1){
//            将数组buffer中存储的流输出 输出到os所代表的文件中
            os.write(buffer,0,b);
        }
//       刷新输出流
        os.flush();
    }

    /**
     * 获取文件的信息，将第一个人文件的内容传入到第二个文件中，复制结束后，释放流资源
     */
    public void testCopy(){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try{
//            通过绝对路径获取文件信息
            fis = new FileInputStream("d:/temp/names.txt");
//            通过绝对路径获取文件信息
            fos = new FileOutputStream("d:/temp/names1.txt");
            FillBlanks.copy(fis,fos);
        } catch (IOException e) {
            TestCase.fail();
//            释放流资源
        }finally {
            try{
                if(fis != null){
                    fis.close();
                }
                if (fos != null){
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 获取文件的输出流，将数据写入输出流
     * @param data
     * @param dest
     * @throws IOException
     */
    public static void saveDouble(double data,OutputStream dest) throws IOException{
        //创建数据输出流
        DataOutputStream dos = new DataOutputStream(dest);
//        将数据写入输出流
        dos.writeDouble(data);
//        刷新输出流
        dos.flush();
    }

    /**
     * 获取文件的输入流，返回输入流的八个字节，解释成的double数据类型的数据
     * @param src
     * @return
     * @throws IOException
     */
    public static double loadDouble(InputStream src) throws IOException {
//        创建数据输入流
        DataInputStream dis = new DataInputStream(src);
//        返回输入流的八个字节，解释为double
        double d = dis.readDouble();
        return d;
    }

    /**
     * 将转换之后的流添加到缓冲流中，将字符串写入输出缓冲流内。
     * @param lines
     * @param src
     * @throws IOException
     */
    public static void saveLines(String[] lines,OutputStream src) throws IOException {
        // 给转换之后流添加缓冲流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(src));
        if(lines != null && lines.length > 0){
            //将字符串的内容逐个写入流bw所指向的输出流中，每次写入之后流进行换行
            for(int i = 0; i < lines.length - 1;i++){
                bw.write(lines[i]);
                bw.newLine();
            }
        }
        //将 变量lines所指向的字符串的最后一个字符写入 bw输出流内
        bw.write(lines[lines.length-1]);
        bw.flush();
    }

    /**
     * 将文件内容每一行的数据存储到list集合中，再讲list集合转换成字符串返回
     * @param src
     * @return
     * @throws IOException
     */
    public static String[] loadLines(InputStream src) throws IOException{
        //添加缓冲流
        BufferedReader br = new BufferedReader((new InputStreamReader(src)));
        List<String> lineList = new ArrayList<String>(0);
        String line = null;
        //读取文件每一行的数据添加到List集合中
        while((line = br.readLine()) != null){
            lineList.add(line);
        }
//        将集合转换成字符串 并返回
        return lineList.toArray(new String[] {});
    }

    /**
     * 传入文件对象，创建文件，项文件内打印 LogData类的信息
     * @param logDataList
     * @param logFile
     */
    public static void saveLogDataList(List<FillBlanks> logDataList,File logFile){

        PrintWriter pw = null;
        try{
            pw = new PrintWriter(new FileOutputStream(logFile));
            for(FillBlanks fi:logDataList){
                pw.println(fi.toString());
            }
            pw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("",e);
        }finally {
            if(pw != null){
                pw.close();
            }
        }
    }

    /**
     * 将文件中的每一行数据 存储到list集合中，并返回这个list集合
     * @param logFile
     * @return
     */
    public static List<FillBlanks> loadLogDataList(File logFile){
        BufferedReader br = null;
        List<FillBlanks> logDataList = new ArrayList<FillBlanks>();
        try{
            br = new BufferedReader(new InputStreamReader(new FileInputStream(logFile)));
            String line = null;
            while((line = br.readLine()) != null){
                FillBlanks fillBlanks = new FillBlanks();
                logDataList.add(fillBlanks);
            }
            return logDataList;
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("",e);
        }finally {
            if(br != null){
                try{
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
