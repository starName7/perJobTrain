package date0628.java9.exercises.second;

import java.util.Scanner;

public class ThreadJoinTest extends Thread {
    public ThreadJoinTest(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.getName());
    }
}

class ThreadTest {
    private static int num = 3;

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String cid = scanner.nextLine();
        System.out.print(cid);
        while (true) {
            if (num > 0) {
                ThreadJoinTest t1 = new ThreadJoinTest("_A");
                ThreadJoinTest t2 = new ThreadJoinTest("_B");
                ThreadJoinTest t3 = new ThreadJoinTest("_C");
                t1.start();
                t1.join(10);
                t2.start();
                t2.join(10);
                t3.start();
                num = -3;
            }
        }
    }
}