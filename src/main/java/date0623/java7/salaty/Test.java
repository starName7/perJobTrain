package date0623.java7.salaty;

public class Test {
    public static void main(String[] args) {
        Graduate g = new Graduate("小亮");
        g.setFee(1000);

        University u = new University();
        u.payOff(g);
        System.out.println();
        System.out.println("是否需要贷款" + g.isLoan());

        Teacher t = new Teacher("大王");
        u.payOff(t);
    }
}
