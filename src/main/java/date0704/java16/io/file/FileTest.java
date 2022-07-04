package date0704.java16.io.file;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;

public class FileTest {
    @Test
    public void test01(){
        File file = new File("D:\\IdeaWorkSpace\\preJobTrain\\src");
        System.out.println(file);
    }

    @Test
    public void test02(){
        File file = new File("D:\\IdeaWorkSpace\\preJobTrain\\src\\main\\java",
                "\\date0704\\java16\\io\\file\\FileIO.java");
        System.out.println(file);
    }
    @Test
    public void test03(){
        File parentdir = new File("D:\\IdeaWorkSpace\\preJobTrain\\src\\main\\java");
        File file = new File(parentdir,"\\date0704\\java16\\io\\file\\FileIO.java");
        System.out.println(file);
    }
    @Test
    public void test04(){
        System.out.println(File.separator);
        System.out.println(File.pathSeparator);
    }
    /**
     * public String getAbsolutePath():获取绝对路径。
     * public String getPath() :获取路径。
     * public String getName() :获取名称。
     * public String getParent():获取上层⽂件⽬录路径。若⽆，返回null。
     * public long length() :获取⽂件⻓度(即:字节数)。不能获取⽬录的⻓度。
     * public long lastModified() :获取最后⼀次的修改时间，毫秒值。
     * public String[] list() :获取指定⽬录下的所有⽂件或者⽂件⽬录的名称数组。
     * public File[] listFiles() :获取指定⽬录下的所有⽂件或者⽂件⽬录的File数组。
     */
    @Test
    public void test05(){
        File file = new File("sql.txt");
        System.out.println(file.getAbsoluteFile());

    }
    @Test
    public void test06(){
        File file = new File("sql.txt");
        System.out.println(file.getPath());
    }
    @Test
    public void test07(){
        File file = new File("sql.txt");
        System.out.println(file.getName());
    }
    @Test
    public void test08(){
        File file = new File ("sql.txt");
//        通过绝对路径获取，上一层文件目录
        System.out.println(file.getAbsoluteFile().getParent());
    }
    @Test
    public void test09(){
        File file = new File("sql.txt");
        System.out.println(file.length());
    }
    @Test
    public void test10(){
        File file = new File("sql.txt");
//        Instant lasModifiedTime = Instant.ofEpochMilli(file.lastModified());
//        ZonedDateTime zonedDateTime = lasModifiedTime.atZone(ZoneId.systemDefault());
//        System.out.println(zonedDateTime);
        System.out.println(file.lastModified());
    }
    @Test
    public void test11(){
        File file = new File("sql.txt");
       String absolutePath = file.getAbsolutePath();
       File file1 = new File(absolutePath);
       File parent = file1.getParentFile();
        System.out.println(parent);
        System.out.println(Arrays.toString(parent.list()));
    }
    @Test
    public void test12(){
        File currentFileName = new File("sql.txt");
        String absoluteFile = currentFileName.getAbsolutePath();
//        System.out.println(absoluteFile);
        File currentAbsolutePath = new File(absoluteFile);
        File parentFile = currentAbsolutePath.getParentFile();
        File[] files = parentFile.listFiles();
        for(File file : files){
            System.out.println(file);
        }
    }
    @Test
    public void test13(){
        File fileName = new File("sql.txt");
        String absoluteFile = fileName.getAbsolutePath();
        File currentAbsolutePath = new File(absoluteFile);
        File parentFile = currentAbsolutePath.getParentFile();

        String[] fileNames = parentFile.list();
//        断言
        Assert.assertNotNull(fileNames);
        for (String file : fileNames){
            System.out.println(file);
        }
    }
    @Test
    public void test14(){
        File file1 = new File("1.txt");
        File file2 = new File("2.txt");
        boolean isTrue = file1.renameTo(file2);
        if(isTrue){
            System.out.println("重命名移动成功");
        }else{
            System.out.println("重命名移动失败");
        }
    }
    /**
     * public boolean createNewFile() :创建⽂件。若⽂件存在，则不创建，返回false
     * public boolean mkdir() :创建⽂件⽬录。如果此⽂件⽬录存在，就不创建了。
     * 如果此⽂件⽬录的上层⽬录不存在，也不创建。
     * public boolean mkdirs() :创建⽂件⽬录。如果上层⽂件⽬录不存在，⼀并创建
     * 注意事项:如果你创建⽂件或者⽂件⽬录没有写盘符路径，那么，默认在项⽬路径下。
     */
    @Test
    public void test15() throws IOException {
        File file = new File("1.txt");
        if(!file.exists()){
            boolean createSuccess = file.createNewFile();
            Assert.assertTrue(createSuccess);
            System.out.println("文件创建成功");
        }
    }
    @Test
    public void test16(){
        File file = new File("abc");
        if(!file.exists()){
            boolean createSuccess = file.mkdir();
            Assert.assertTrue(createSuccess);
            System.out.println("文件夹创建成功");
        }
    }
    @Test
    public void test17(){
        File file = new File("abc/bcd/efg");
        if(!file.exists()){
            boolean createSuccess = file.mkdirs();
            Assert.assertTrue(createSuccess);
            System.out.println("文件创建成功");
        }
    }
    @Test
    public void test18(){
        File file = new File("abc");
        if(file.exists()){
            boolean createSuccess = file.delete();
            Assert.assertTrue(createSuccess);
            System.out.println("文件删除成功");
        }
    }
}
