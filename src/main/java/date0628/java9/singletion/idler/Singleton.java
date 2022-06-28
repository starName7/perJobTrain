package date0628.java9.singletion.idler;

public class Singleton {
    private Singleton(){}
    private static Singleton instance;
    public static Singleton getInstance() throws InterruptedException {
        if(instance == null){
            synchronized(Singleton.class){
                if(instance == null){
                    Thread.sleep(1000);
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println(getInstance() == getInstance());
    }
}
