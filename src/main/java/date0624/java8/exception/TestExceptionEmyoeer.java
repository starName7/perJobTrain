package date0624.java8.exception;

public class TestExceptionEmyoeer {
    public static void main(String[] args) {
        try{
            Employee e1 = new Employee(12,34,"张三");
            Employee e2 = new Employee(100000,"12345624");
            e2.addSalary(1200);
            e2.minusSalary(100);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
