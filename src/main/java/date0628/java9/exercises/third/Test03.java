package date0628.java9.exercises.third;

public class Test03 {
    public static void main(String[] args) {
        Object obj = new Object();
        new Thread(() ->{
            synchronized (obj){
                int i = 1;
                while(i <= 52){
                    System.out.println(i);
                    i++;
                    System.out.println(i);
                    i++;
                    obj.notify();
                    try{
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(()->{
            synchronized (obj){
                char c = 'A';
                while(c <= 'z'){
                    System.out.println(c++);
                    obj.notify();
                    try{
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
