package date0705.java16.io.buff.assign.fourth;



import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class fileIOFourth {
    public static void main(String[] args) throws IOException {
        File file1 = new File("dir\\file1.txt");
        File file2 = new File("dir\\file2.txt");

        Reader reader = new FileReader(file1);
        Writer writer = new FileWriter(file2);

        BufferedReader fbr = new BufferedReader(reader);
        BufferedWriter fbw = new BufferedWriter(writer);

        int len = -1;
        char[] cache = new char[1024];
        Map<Character,Integer> storage = new HashMap();
        while ((len = fbr.read(cache)) != -1){
            for (char a :
                    cache) {
                if(storage.get(a) == null){
                    storage.put(a,1);
                }else{
                    int item = storage.get(a);
                    storage.put(a,item+1);
                }
            }
        }
        fbr.close();
//        System.out.println(storage);
        String a = storage.toString();
        System.out.println();
        System.out.println(a);
        char[] cacheClone = a.toCharArray();
        int first = 0;
        int last = 1024;

        while(first != cacheClone.length){

            if(last >= cacheClone.length){
                last = cacheClone.length;
            }
            fbw.write(cacheClone,first,last);
            fbw.flush();
            first = last;
            last = last + 1024;
        }
        fbw.close();

    }
}
