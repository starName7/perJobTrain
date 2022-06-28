package date0628.java9.thread.finish;

public class ConditionThread implements Runnable{
    int i = 0;
    boolean condition = true;
    @Override
    public void run() {
        while(condition){
            i++;
            if(i == 10){
                condition = false;
            }
            System.out.println(Thread.currentThread().getName() + "执行第" + i + "次");
        }
    }
}
class TestConditionThread{
    public static void main(String[] args) {
        ConditionThread c = new ConditionThread();
        Thread thread = new Thread(c,"ConditionThread");
        thread.start();
    }
}