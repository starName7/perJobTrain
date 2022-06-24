package date0623.java7.employee;

public abstract class CommonEmployee {
    private String name;
    private int salary;

    private int id ;
    private static int serial = 0;
    public CommonEmployee(String name, int salary) {
        serial = serial +1;
        this.name = name;
        this.salary = salary;
        this.id = serial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public abstract void work();
}

class Manager extends CommonEmployee{
    private int bonus;

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("员工的姓名是: " + this.getName() +
                ",员工的id为: " + super.getId() +
                ",员工的薪资为: " + super.getSalary() +
                ",员工的奖金为: " + this.bonus);
    }

    public static void main(String[] args) {
        CommonEmployee c1 = new Manager("Don",5500,2001);
        CommonEmployee c2 = new Manager("Li",5500,2002);
        c1.work();
        c2.work();

    }
}