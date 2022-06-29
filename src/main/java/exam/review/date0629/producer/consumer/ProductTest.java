package exam.review.date0629.producer.consumer;

public class ProductTest {
    public static void main(String[] args) {


    Clerk clerk  = new Clerk();
    Consumer consumer = new Consumer(clerk);
    Productor productor = new Productor(clerk);

    Thread thread1 = new Thread(consumer);
    Thread thread2 = new Thread(productor);

    thread1.start();
    thread2.start();
    }
}
