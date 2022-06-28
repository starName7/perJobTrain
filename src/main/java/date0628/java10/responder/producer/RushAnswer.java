package date0628.java10.responder.producer;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class RushAnswer implements Callable {
    private boolean flag = false;
    @Override
    public Object call() throws Exception {
       Thread.sleep(2000);
       synchronized (this){
           if(!this.flag){
               this.flag = true;
               return Thread.currentThread().getName() + "抢答成功";
           }else{
               return Thread.currentThread().getName()+"抢答失败";
           }
       }
    }
}
class RushAnswerTest{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable reshAnswer = new RushAnswer();
        FutureTask taskA = new FutureTask(reshAnswer);
        FutureTask taskB = new FutureTask(reshAnswer);
        FutureTask taskC = new FutureTask(reshAnswer);

        new Thread(taskA).start();
        new Thread(taskB).start();
        new Thread(taskC).start();

        System.out.println(taskA.get());
        System.out.println(taskB.get());
        System.out.println(taskC.get());

    }
}