package date0624.java8.exception;

public class NullException extends RuntimeException{
    private static final long serialVersionUID = 8645709248382809870L;
    public NullException(){

    }
    public NullException(String message){
        super(message);
    }
}
