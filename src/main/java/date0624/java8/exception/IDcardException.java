package date0624.java8.exception;

public class IDcardException extends RuntimeException{

    private static final long serialVersionUID = 5815460711152957825L;
    public IDcardException(){}
    public IDcardException(String message){
        super(message);
    }
}
