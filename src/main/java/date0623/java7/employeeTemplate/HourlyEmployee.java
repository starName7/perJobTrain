package date0623.java7.employeeTemplate;

public class HourlyEmployee extends Employee{
    public HourlyEmployee(String name, int number, MyDate birthday, int wage, int hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    //    工资
    private int wage;
//    小时
    private int hour;
    @Override
    public int earnings() {
        return wage *hour;
    }
    public String toString(){
        return "员工的名字: " + this.getName()+ ",员工的号码: " + this.getNumber()+",员工的生日: "  + this.getBirthday().toDateString();
    }
}
