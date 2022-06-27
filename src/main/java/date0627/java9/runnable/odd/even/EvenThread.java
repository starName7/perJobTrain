package date0627.java9.runnable.odd.even;

public class EvenThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
//                try {
//                    Thread.sleep(500);
//
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }

            }
        }
    }
}
