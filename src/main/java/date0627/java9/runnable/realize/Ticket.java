package date0627.java9.runnable.realize;

import java.math.BigDecimal;

public class Ticket implements Runnable {
    int ticket = 100;

    private static final Object o = new Object();

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                try {
                    synchronized (o) {
                        Thread.sleep(1000);
                        System.out.println(ticket -= 1);
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread thread1 = new Thread(ticket, "售票口一");
        Thread thread2 = new Thread(ticket, "售票口二");
        Thread thread3 = new Thread(ticket, "售票口三");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
