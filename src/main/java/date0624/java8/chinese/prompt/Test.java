package date0624.java8.chinese.prompt;

public class Test {
    public static void main(String[] args) {
        try{
            String s = null;
            System.out.println(s.charAt(0));
        }catch(NullPointerException e){
            System.out.println("空指针异常");
        }catch (ArithmeticException e){
            System.out.println("计算异常");
        }catch(Exception e){
            System.out.println("其他异常");
            e.printStackTrace();
        }
    }
}
