package date0704.java15.dao;

import java.util.List;

public class User {
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        DAO<User> dao = new DAO<>();
        dao.save("1", new User(1, 22, "Don"));
        dao.save("2", new User(2, 23, "asdf"));
        dao.save("3", new User(3, 25, "qwe"));
        dao.save("4", new User(4, 18, "zxc"));
        dao.save("5", new User(5, 10, "hgjh"));
        System.out.println(dao.get("3").toString());
        dao.update("3", new User(8, 20, "soa"));
        System.out.println(dao.get("3").toString());
        System.out.println();
        List list = dao.list();
//        Iterator it = list.iterator();
        for (Object o :
                list) {
            System.out.println(o);
        }
        System.out.println();
        dao.delete("3");
        List list1 = dao.list();
        for (Object o :
                list1) {
            System.out.println(o);
        }
    }
}
