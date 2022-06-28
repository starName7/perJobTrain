package date0628.java9.thread.interrupt.inner;

public class InterruptThread extends Thread{

    int i = 1;

    @Override
    public void run() {
        while(true){
            System.out.println("第" + i + "次进入循环");
            System.out.println("interrupt的值为:" + Thread.currentThread().isInterrupted());
            try{
                System.out.println("休息");
                Thread.sleep(2000);
                this.interrupt();
            }catch (InterruptedException e){
                System.out.println("异常捕获，当前中断状态为" + this.isInterrupted());
                return;
            }
            i++;
        }
    }
}
class InterrruptThreadTest{
    public static void main(String[] args) {
    Thread thread = new InterruptThread();
    thread.start();
    }
}