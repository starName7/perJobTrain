package date0623.java7.employeeTemplate;

public class SalariedEmployee extends Employee{
    public SalariedEmployee(String name, int number, MyDate birthday, int monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    //    月工资
    private int monthlySalary;

    @Override
    public int earnings() {
        return monthlySalary;
    }
    public String toString(){
        return "员工的名字: " + this.getName()+ ",员工的号码: " + this.getNumber()+",员工的生日: "  + this.getBirthday().toDateString();
    }
}
