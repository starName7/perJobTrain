package date0623.java7.salaty;

public class Teacher implements Salary {
    private String name;
    public static final int SALARY = 3000;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public int getSalaty() {
        return SALARY;
    }
}
