package date0628.java9.exercises.first;

public class Create10 implements Runnable{
    int sum = 0;
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++){
            sum += i;
        }
    }
}
class Test01{
    public static void main(String[] args) throws InterruptedException {
        int result = 0;
        for(int i = 0;i<10;i++){
            int sum = 0;
            Create10 threadCreate10 = new Create10();
            Thread thread1 = new Thread(threadCreate10);
            thread1.start();
            thread1.join();
            sum = threadCreate10.sum + i*10*10;
            result += sum;
            System.out.println("第"+ (i+1) + "个线程------>" + sum);
        }
        System.out.println(Thread.currentThread().getName()+"--------->" + result);
    }
}