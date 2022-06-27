package date0627.java9.join.test;

public class MyThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"线程第" + i + "次执行!");

        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        Thread thread1 = new Thread(myThread,"子线程");
        thread1.start();
        for (int i = 0;i < 30;i++){
            System.out.println(Thread.currentThread().getName() + "线程第" + i + "次执行");
            if (i == 20){
                thread1.join(100);
            }
        }
    }
}
