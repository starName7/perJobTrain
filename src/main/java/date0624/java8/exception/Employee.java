package date0624.java8.exception;

public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;
    private String idCard;
    private int totalEmployee = 10;
    private double totalSalary = 100000;
    public Employee(int id,int age,String name)throws Exception{
        if (age < 18){
            throw new LowAgeException("年龄太小了！");
        }else if (age > 60){
            throw new HightAgeException("年龄太大了！");
        }else if(name == null || name == ""){
            throw new NullException("输入的名字不合法!");
        }
    }
    public Employee(double salary, String idCard) throws Exception{

        if (salary < 600){

            throw new LowSalaryException("工资低了！");
        }
    }
    public void addSalary(double addSalaty)throws HightSalaryException{
        double newSalary = salary + addSalaty;
        if(newSalary > totalSalary){
            throw new HightSalaryException("工资高了！");
        }
    }
    public void minusSalary(double minusSalary)throws LowSalaryException{
        double min = salary - minusSalary;
        if(min < 600){
            throw  new LowSalaryException("工资低了！");
        }
    }
    public void showTotalSalary()throws NullException{
        if(totalSalary == 0){
            throw new NullException("工资为0！");
        }
    }
    public void showTotalEmployee() throws NullException{
        if(totalEmployee == 0){
            throw new NullException("人数为0！");
        }
    }
}
