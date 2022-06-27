package date0627.java9.runnable.odd.even;

public class Test {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();
        Thread thread1 = new Thread(evenThread,"打印偶数");
        Thread thread2 = new Thread(oddThread,"打印奇数");

        thread2.setDaemon(true);

        thread1.start();
        thread2.start();

        thread1.setPriority(Thread.MAX_PRIORITY);


    }
}
