package date0623.java7.employeeTemplate;

public abstract class Employee {
    private String name;
    private int number;
    private MyDate birthday;

    public Employee(String name, int number, MyDate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    //    薪水
    public abstract int earnings();

    public String toString(){
        return "员工的名字: " + this.getName()+ ",员工的号码: " + this.getNumber()+",员工的生日: "  + this.getBirthday().toDateString();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }


}
