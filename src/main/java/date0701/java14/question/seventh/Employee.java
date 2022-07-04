package date0701.java14.question.seventh;


import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Employee implements Comparable {
    private String name;
    private int age;
    private MyDate birthday;
    private String gender;
//split

    public Employee(String name, int age, String birthday, String gender) {
        String[] str = birthday.split("-");
//        for (String ser :
//                str) {
//            System.out.println(ser);
//        }

        int year = Integer.parseInt(str[0]);
        int month = Integer.parseInt(str[1]);
        int day = Integer.parseInt(str[2]);
        MyDate date = new MyDate(year, month, day);
        this.name = name;
        this.age = age;
        this.birthday = date;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public int compareTo(Object o) {
//        String s = "a";
//        String v = "a";
//        s.compareTo(v);
        if (o instanceof Employee) {
            Employee e = (Employee) o;
            return this.name.compareTo(e.name);
        } else {
            throw new RuntimeException("传入的数据类型不一致");
        }
    }

    public boolean equals(Object o) {
//        判断是否为同一对象
        if (o == this) {
            return true;
        }
//        判断类型是否相同
        if (o instanceof Employee) {
//            转型
            Employee e = (Employee) o;
//            分别判断各个成员属性是否相同
            if (this.name.equals(e.name)) {
                if (Integer.compare(this.getAge(), e.getAge()) == 0) {
                    if (this.getBirthday().equals(e.getBirthday())) {
                        if (this.getGender().equals(e.getGender())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Set set = new TreeSet(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                MyDate m1 = e1.getBirthday();
                MyDate m2 = e2.getBirthday();
                if (m1.getYear() < m2.getYear()) {
                    return -1;
                } else if (m1.getYear() == m2.getYear()) {
                    if (m1.getMonth() < m2.getMonth()) {
                        return -1;
                    } else if (m1.getMonth() == m2.getMonth()) {
                        if (m1.getDay() < m2.getDay()) {
                            return -1;
                        } else if (m1.getDay() == m2.getDay()) {
                            return 0;
                        } else {
                            return 1;
                        }
                    } else {
                        return 1;
                    }
                } else {
                    return 1;
                }
            }
        });

        set.add(new Employee("Michael", 18, "2000-4-23", "F"));
        set.add(new Employee("Jerry", 20, "1998-6-1", "F"));
        set.add(new Employee("Tom", 20, "1998-6-6", "F"));
        set.add(new Employee("Miko", 25, "1995-12-30", "M"));
        set.add(new Employee("Jen", 18, "2000-2-12", "M"));
        for (Object o :
                set) {
            Employee e = (Employee) o;
            System.out.println(e.getName());
            System.out.println(e.getAge());
            System.out.println(e.getBirthday().getYear() + "-" + e.getBirthday().getMonth() + "-" +e.getBirthday().getDay());
            System.out.println(e.getGender());
            System.out.println("===========");
            System.out.println();
        }

    }
}
