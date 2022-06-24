package date0624.java8.dividendZero;

public class ExceptionTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try{
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally {
            System.out.println("这个是算数异常");
        }
    }
}
