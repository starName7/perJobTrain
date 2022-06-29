package exam.review.date0629.producer.consumer;

public class Clerk {
    private int product = 0;

    public synchronized void addProduct() {

            if (this.product >= 20) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                product++;
                System.out.println("生产者生产了 第" + product + "个产品");
                notifyAll();
            }

    }
    public synchronized  void getProduct(){

            if(this.product <= 0){
                try{
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{

                System.out.println("消费者消费了 第" + product + "个产品");
                product--;
                notifyAll();
            }
        }

}
