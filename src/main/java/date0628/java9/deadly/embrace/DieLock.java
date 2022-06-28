package date0628.java9.deadly.embrace;

public class DieLock implements Runnable{
    private boolean flag = false;

    public DieLock(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if(flag){
            synchronized(LockConstant.Key01){
                System.out.println(Thread.currentThread().getName() + "通过Key1开启了第一扇门");
                synchronized (LockConstant.Key02){
                    System.out.println(Thread.currentThread().getName() + "通过Key2开启了第二扇门");
                }
            }
        }else{
            synchronized(LockConstant.Key02){
                System.out.println(Thread.currentThread().getName() + "通过Key2开启了第二扇门");
                synchronized (LockConstant.Key01){
                    System.out.println(Thread.currentThread().getName() + "通过Key1开启了第一扇门");
                }
            }
        }
    }
}
class DieLockTest{
    public static void main(String[] args) {
        DieLock d1 = new DieLock(true);
        DieLock d2 = new DieLock(false);
        Thread work01 = new Thread(d1,"一号工人");
        Thread work02 = new Thread(d2,"二号工人");
        work01.start();
        work02.start();
    }
}
