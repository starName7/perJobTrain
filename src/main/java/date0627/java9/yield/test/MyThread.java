package date0627.java9.yield.test;

public class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 30;i++){
            System.out.println(Thread.currentThread().getName() + "线程第" + i + "次执行！");
            if (i % 5  == 0){
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();

        Thread thread1 = new Thread(myThread1,"低级线程");
        Thread thread2 = new Thread(myThread2,"中极线程");
        Thread thread3 = new Thread(myThread3,"高级线程");

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread3.setPriority(Thread.MAX_PRIORITY);
    }
}
