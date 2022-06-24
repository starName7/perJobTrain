package date0624.java8.exception;

public class LowAgeException extends RuntimeException {

    private static final long serialVersionUID = -8556385708149669144L;

    public LowAgeException() {
    }

    public LowAgeException(String message) {
        super(message);
    }
}
