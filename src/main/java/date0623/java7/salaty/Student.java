package date0623.java7.salaty;

public abstract class Student {
    private String name;
    public int fee;
    public Student(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void setFee(int fee);
    public abstract int getFee();
}
