package date0623.java7.star;

public class Test {
    public static void main(String[] args){
        StarProxy star = new Star();
        StarProxy borker = new Broker(star);
        borker.signContract();
    }
}
