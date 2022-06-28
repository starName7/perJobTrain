package date0628.java9.thread.daemon;

public class DemonThread implements Runnable{

    @Override
    public void run() {
        for(int i = 0;i < 1000000000; i++){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "打印" + (i +1)+ "次");
        }
    }
}
