package date0628.java10.producer.consumer;

public class Productor implements Runnable{
    private Clerk clerk;

    public Productor(Clerk clerk){
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("生产者开始生产产品");
        while (true){
            try{
                Thread.sleep((int) Math.random() * 1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.addProduct();
        }
    }
}
