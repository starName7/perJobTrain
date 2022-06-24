package date0624.java8.exception;

public class HightSalaryException extends RuntimeException {
    private static final long serialVersionUID = -5489669404914506884L;

    public HightSalaryException() {
    }

    public HightSalaryException(String message) {
        super(message);
    }

}
