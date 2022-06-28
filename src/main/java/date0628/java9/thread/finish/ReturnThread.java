package date0628.java9.thread.finish;

public class ReturnThread implements Runnable{
    int i = 0;
    @Override
    public void run() {
        while(true){
            if(i == 10){
                return;
            }
            i++;
            System.out.println(Thread.currentThread().getName() + "执行第" + i + "次");
        }
    }
}
class TestReturnThread{
    public static void main(String[] args) {
        ReturnThread r = new ReturnThread();
        Thread thread = new Thread(r,"ReturnThread");
        thread.start();
    }
}