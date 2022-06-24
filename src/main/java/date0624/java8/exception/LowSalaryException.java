package date0624.java8.exception;

public class LowSalaryException extends RuntimeException{
    private static final long serialVersionUID = 7752190087838501139L;
    public LowSalaryException(){}
    public LowSalaryException(String message){
        super(message);
    }
}
