package date0623.java7.salaty;

public class Graduate extends Student implements Salary {
    public static final int SALARY = 1500;
    public Graduate(String name) {
        super(name);
    }
    public boolean isLoan(){
        if (SALARY < this.fee){
            return true;
        }else{
            return false;
        }

    }
    @Override
    public int getSalaty() {
        return SALARY;
    }

    @Override
    public void setFee(int fee) {
        this.fee = fee;
    }

    @Override
    public int getFee() {
        return this.fee;
    }
}
