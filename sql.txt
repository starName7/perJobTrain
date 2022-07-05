package date0705.java16.io.buff;

import java.io.*;

public class Buffered {


    public static void main(String[] args) {
        Reader reader = null;
        Writer writer = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            reader = new FileReader("sql.txt");
            writer = new FileWriter("sql2.txt", true);
            br = new BufferedReader(reader);
            bw = new BufferedWriter(writer);
            String str = null;
            while ((str = br.readLine()) != null) {
                bw.write(str);
                bw.newLine();
            }
            bw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(br != null){
                try{
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bw != null){
                try{
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
