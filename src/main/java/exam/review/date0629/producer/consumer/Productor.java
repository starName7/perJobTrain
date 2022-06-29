package exam.review.date0629.producer.consumer;

public class Productor implements Runnable{
    private Clerk clerk;

    public Productor(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("生产者开始生产商品");
        while (true){
            try{
                Thread.sleep((int) Math.random() *1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.addProduct();
        }

    }
}
