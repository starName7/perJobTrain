package test15.dao.impl;



import test15.dao.IDeptDao;
import test15.domain.Dept;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeptDaoImpl implements IDeptDao {
    private static List<Dept> data;

    private static boolean flag = false;
    @Override
    public List<Dept> list() {
        if (data == null) {
            load();
        }
        return data;
    }

    static {
        if (flag == true) {
            load();
        }
    }

    public static void  load () {
        File file = new File("dept");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);

            List<Dept> data = (List<Dept>)ois.readObject();

            DeptDaoImpl.data = data;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void init() throws Exception{
        List<Dept> list = new ArrayList(Arrays.asList(
                new Dept(1l, "开发部"),
                new Dept(2L, "设计部"),
                new Dept(3L, "测试部"),
                new Dept(4L, "办公室")
        ));
        File file = new File("dept");

        OutputStream is = new FileOutputStream(file);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(is);

        objectOutputStream.writeObject(list);

        objectOutputStream.close();

        flag = true;
    }

    public static void main(String[] args) throws Exception {
        init();

//        IDeptDao dao = new DeptDaoImpl();
//        List<Dept> list = dao.list();
//        System.out.println(list);

    }
}
