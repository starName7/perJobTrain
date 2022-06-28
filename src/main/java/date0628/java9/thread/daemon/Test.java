package date0628.java9.thread.daemon;

public class Test {
    public static void main(String[] args) {
        DemonThread d = new DemonThread();
        UserThread u = new UserThread();
        Thread demon = new Thread(d,"守护线程");
        Thread user = new Thread(u,"用户线程");
        demon.setDaemon(true);
        demon.start();
        user.start();
    }
}
