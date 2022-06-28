package date0628.java9.exercises.fifth;

public class Test05 {
    private static int j = 0;
    public synchronized static void add(){
        j++;
    }
    public synchronized static void dec(){
        j--;
    }

    public static void main(String[] args) throws InterruptedException {
        for(int i = 0;i < 2;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true){
                        add();
                        System.out.println(j);
                    }
                }
            }).start();
            Thread.sleep(1000);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while(true){
                        dec();
                        System.out.println(j);
                    }
                }
            }).start();
        }
    }
}
