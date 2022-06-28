package date0628.java9.save.money.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SaveMoney implements Runnable {
    int money = 0;
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        int a = 0;
        while (true) {
            if (a == 3) {
                break;
            } else {
                a++;
                lock.lock();
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                money += 1000;
                System.out.println(Thread.currentThread().getName() + "存进1000现在的账户余额为" + money);

                lock.unlock();
            }


        }
    }

    public static void main(String[] args) {
        SaveMoney sm = new SaveMoney();
        Thread thread1 = new Thread(sm, "储户A");
        Thread thread2 = new Thread(sm, "储户B");

        thread1.start();
        thread2.start();


    }
}
