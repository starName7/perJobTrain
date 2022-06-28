package date0628.java9.save.money;

public class SaveMoney implements Runnable {
    int money = 0;

    @Override
    public void run() {
        int a = 0;
        while (true) {
            if(a == 3){
                break;
            }else{
                a++;
                synchronized (SaveMoney.class) {
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        money += 1000;
                        System.out.println(Thread.currentThread().getName() + "存进1000现在的账户余额为" + money);

                }
            }


        }
    }

    public static void main(String[] args) {
        SaveMoney sm = new SaveMoney();
        Thread thread1 = new Thread(sm, "储户A");
        Thread thread2 = new Thread(sm, "储户B");

        thread1.start();
        thread2.start();


    }
}
