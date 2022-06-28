package date0628.java9.code.block;

public class Ticket implements Runnable {
    int ticket = 100;

    @Override
    public void run() {
        while(true){
            synchronized (Ticket.class){
                if (ticket > 0){
                    try{
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在售卖第" + (ticket--) +"张票");
                }else{
                    System.out.println("没有票了");
                    break;
                }
            }
        }
    }
}
class TicketTest{
    public static void main(String[] args) {
        Runnable ticketRunnable = new Ticket();
        Thread thicket1 = new Thread(ticketRunnable,"售票口1");
        Thread thicket2 = new Thread(ticketRunnable,"售票口2");
        Thread thicket3 = new Thread(ticketRunnable,"售票口3");

        thicket1.start();
        thicket2.start();
        thicket3.start();
    }
}