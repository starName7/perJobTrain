package date0628.java9.thread.finish;

public class BreakThread implements Runnable{
    int i = 0;
    @Override
    public void run() {
        while(true){
            if (i == 10){
                break;
            }
            i++;
            System.out.println(Thread.currentThread().getName() + "执行第" + i + "次");

        }
    }
}
class TestBreakThread{
    public static void main(String[] args) {
        BreakThread b = new BreakThread();
        Thread thread = new Thread(b,"BreakThread");
        thread.start();
    }
}