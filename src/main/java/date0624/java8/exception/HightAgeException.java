package date0624.java8.exception;

public class HightAgeException extends RuntimeException{
    private static final long serialVersionUID = 3136027914855713101L;
    public HightAgeException(){}
    public HightAgeException(String message){
        super(message);
    }
}
