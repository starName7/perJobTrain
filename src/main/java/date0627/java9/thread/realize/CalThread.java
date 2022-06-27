package date0627.java9.thread.realize;

public class CalThread extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 100 ;i++){
            System.out.println(Thread.currentThread().getName() + "执行的是" + (i +1) + "次");

        }
    }

    public static void main(String[] args) {
        Thread thread1 = new CalThread();
        Thread thread2 = new CalThread();
        thread1.start();
        thread2.start();
    }
}
