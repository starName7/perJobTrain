package date0627.java9.runnable.odd.even;

public class OddThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            if(i % 2 !=0){
                try {
                    Thread.sleep(1);
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
