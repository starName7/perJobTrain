package date0623.java7;

public class Test {

    public static void main(String[] args) {
        BuyingTickets s = new Student();
        BuyingTickets scalper = new Scalper(s);
        scalper.BuyTicket();
    }
}
interface BuyingTickets{
    void BuyTicket();
}
class Scalper implements  BuyingTickets{
    private BuyingTickets buyingTickets;
    public  Scalper(BuyingTickets buyingTickets){
        this.buyingTickets = buyingTickets;
    }
    public void BuyTicket(){
        System.out.println("黄牛蹲点");
        buyingTickets.BuyTicket();

    }
}

class Student implements BuyingTickets{

    @Override
    public void BuyTicket() {
        System.out.println("学生买票");
    }
}