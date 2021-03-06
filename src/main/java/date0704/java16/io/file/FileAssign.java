package date0704.java16.io.file;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileAssign {
    @Test
    public void fileCreation() throws IOException {
        File file = new File("file.txt");
        if (!file.exists()) {
            boolean createSuccess = file.createNewFile();
            Assert.assertTrue(createSuccess);
            System.out.println("创建文件成功");
        }
    }

    @Test
    public void dirCreation() {
        File file = new File("dir");
        if (!file.exists()) {
            boolean createSuccess = file.mkdir();
            Assert.assertTrue(createSuccess);
            System.out.println("创建文件夹成功");
        }
    }

    //     将file.txt⽂件更名为source.txt⽂件，并移动到dir⽂件夹下。
    @Test
    public void fileChangeMove() {
        File file = new File("file.txt");
        String absoluteFile = file.getAbsolutePath();
        File currentAbsolutePath = new File(absoluteFile);
        String parentFile = currentAbsolutePath.getParent();

        File file1 = new File(absoluteFile);
        File file2 = new File(parentFile + "/dir/source.txt");
        boolean isTrue = file1.renameTo(file2);
        if (isTrue) {
            System.out.println("更改成功");
        } else {
            System.out.println("更改失败");
        }

    }

    //④ 输出source.txt⽂件的属性内容，包括⼤⼩，最后更改时间，扩展名，实际⽬录。
    @Test
    public void fileInfo() {
        File file = new File("dir/source.txt");
        System.out.println(file.length());
        System.out.println(file.lastModified());
        String absoluteFile = file.getAbsolutePath();
        System.out.println(absoluteFile);
        String[] str = absoluteFile.split("\\.");
        System.out.println(str.length);
        System.out.println(str[str.length - 1]);

    }

    @Test
    public void fileDelect() {
        File file = new File("dir/source.txt");
        if (file.exists()) {
            boolean createSuccess = file.delete();
            Assert.assertTrue(createSuccess);
            System.out.println("文件删除成功");
        }
    }

    @Test
    public void fileFind() {
        File file = new File("dir");
        String[] str = file.list();
        for (String s :
                str) {
            String[] str1 = s.split("\\.");
            if (str1[str1.length - 1].equals("jpg")) {
                System.out.println(s);
            }
        }
    }

    @Test
    public void fileSize() {
        File file = new File("dir");
        String absoluteFile = file.getAbsolutePath();
        System.out.println(file.length());
        System.out.println(absoluteFile);
        String[] str = file.list();
        int sum = 0;
        for (String s :
                str) {
            File file1 = new File(absoluteFile + "\\" + s);
            sum += file1.length();
            file1.delete();

        }
        System.out.println(sum);
    }

    public static void fileTotal() throws IOException {
        File file = new File("dir");
        File file1 = file.getAbsoluteFile();
        File file2 = file1.getParentFile();
        String fileP = file2.getAbsolutePath();
        String[] str = file2.list();
        System.out.println(str.length);
        System.out.println("输入1查看，输入2新建，输入3删除");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        int j = 0;
        if (i == 1) {
            for (String s :
                    str) {
                File file3 = new File(s);
                System.out.println("第" + ++j + "个文件");
                System.out.println("文件名" + s);
                System.out.println("文件的大小" + file3.length());
                int index = s.lastIndexOf(".");
                if (index > 0) {
                    String fileName = s.substring(index);
                    System.out.println("文件的种类的为" + fileName);
                } else {
                    System.out.println("该文件为目录");
                }

            }
        } else if (i == 2) {
            System.out.println("新建文件夹请输入1，新建文件请输入2");
            int n = input.nextInt();
            if (n == 1) {
                System.out.println("请输入文件名称和后缀  xxx.xxx格式");
                String fileNameNew = input.next();
                File fileNew = new File(fileP + "\\" + fileNameNew);
                if (!fileNew.exists()) {
                    boolean createSuccess = fileNew.createNewFile();
                    Assert.assertTrue(createSuccess);
                    System.out.println("创建文件成功");
                }
            } else if (n == 2) {
                System.out.println("请输入文件目录名称  xxx格式");
                String fileNameNew = input.next();
                File fileNew = new File(fileP + "\\" + fileNameNew);
                if (!fileNew.exists()) {
                    boolean createSuccess = fileNew.mkdirs();
                    Assert.assertTrue(createSuccess);
                    System.out.println("创建文件夹成功");
                }
            }
        }else if(i == 3){
            System.out.println("请输入您要删除的文件名");
            String fileDe = input.next();
            File fileDele = new File(fileP+"\\" + fileDe);
            if (fileDele.exists()) {
                boolean createSuccess = fileDele.delete();
                Assert.assertTrue(createSuccess);
                System.out.println("文件删除成功");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        fileTotal();
    }
}
