package date0705.java16.io.assgin.seventh;



import java.io.File;
import java.util.Arrays;

public class IOSeventh {

    public static void findFile(File file,int index){


        int i = index;
        String[] strFile = file.list();
        File[] arrFile = file.listFiles();
//        System.out.println(Arrays.toString(strFile));

        if(strFile.length == 0){
            return;
        }
        int max = 0;
        for (int x = 0;x < strFile.length;x++){
            if(strFile[x].endsWith(".java")){
                strFile[x] = "|----文件" + strFile[x];
            }else{
                strFile[x] = "|----文件夹" + strFile[x];
            }
            if(max < strFile[x].length()){
                max = strFile[x].length();
            }
        }

        String str = " ";
        for (int j = 0;j < i;j++){
            str = str + " ";
        }
        i = i + max;
        for (int j = 0;j < arrFile.length ;j++){
            if(strFile[j].endsWith(".java")){
                System.out.println(str + strFile[j]);
            }else if(arrFile[j].isDirectory()){
                System.out.println(str + strFile[j]);
                findFile( arrFile[j].getAbsoluteFile(),i);
            }else{
                continue;
            }

        }
    }
    public static void main(String[] args) {
        File file = new File("src\\main\\java");
        findFile(file,0);
    }
}
