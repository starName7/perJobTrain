package date0628.java9.thread.interrupt.outer;

public class InterruptThread extends Thread{
    int i = 1;
    @Override
    public void run(){
        while(true){
            System.out.println("第" + i + "次进入循环");
            try{
                System.out.println("休息1000毫秒");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("异常捕获，当前终端状态为 " + this.isInterrupted());
                return;
            }
            i++;
        }
    }
}
class InterruptThreadTest{
    public static void main(String[] args) throws InterruptedException {
        Thread interruptThrad  = new InterruptThread();
        interruptThrad.start();
        Thread.sleep(3000);
        interruptThrad.interrupt();
    }
}