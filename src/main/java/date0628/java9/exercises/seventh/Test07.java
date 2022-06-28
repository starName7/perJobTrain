package date0628.java9.exercises.seventh;

public class Test07 {
    public static void main(String[] args) {
        Tickets tickets = new Tickets();
        Thread t1 = new Thread(tickets,"窗口1");
        Thread t2 = new Thread(tickets,"窗口2");
        Thread t3 = new Thread(tickets,"窗口3");
        t1.start();
        t2.start();
        t3.start();

    }
}
class Tickets implements Runnable{
    int tickets = 100;
    Object obj = new Object();

    @Override
    public void run() {
    while(true){
        synchronized (obj){
            if(tickets > 0){
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String name = Thread.currentThread().getName();
                System.out.println(name + "正在卖: " + tickets--);
            }
        }
    }
    }
}
