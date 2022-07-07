package date0705.java16.io.assgin.eighth;

import java.io.File;


public class IOEighth {
    public static void deleFile(File file){
        String fileName = file.getName();
        File[] fileChild = file.listFiles();
        String[] strName = new String[fileChild.length];
        int i = 0;
        for (File F : fileChild
        ) {
            strName[i] = F.getAbsolutePath();
        }
        String fStr = file.getAbsolutePath();
        File presentFile = new File(fStr);
        String parentFile = presentFile.getParent();

        System.out.println(strName[0]);
        File fileChaildPresen = new File(strName[0]);
        File replaceFile = new File(parentFile + "\\" + fileChild[0].getName());

        boolean is = fileChaildPresen.renameTo(replaceFile);
        if(is){
            boolean createSuccess = file.delete();
            if(createSuccess){
                System.out.println("文件删除成功");
            }else{
                System.out.println("文件删除失败");
            }
            System.out.println("文件替换成功");
        }else{
            System.out.println("文件替换失败");
        }




    }

    public static void main(String[] args) {
        File file = new File("dir\\asd");
        deleFile(file);
    }
}
