package date0628.java9.exercises.fourth;

public class Test04 {
    public static void main(String[] args) throws InterruptedException {
        MythreadTest1 mythread = new MythreadTest1();
        Thread thread = new Thread(mythread);
        thread.start();
        thread.join();
        System.out.println("main");
    }
}
class MythreadTest1 implements Runnable{

    @Override
    public void run() {
        System.out.println("thread1");
    }
}