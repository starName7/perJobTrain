package date0628.java9.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable{
    int ticket = 100;
    Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while(true){
            lock.lock();
            if(ticket > 0){
                try{
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在出售" +(ticket--) + "张票");
                lock.unlock();
            }else{
                break;
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