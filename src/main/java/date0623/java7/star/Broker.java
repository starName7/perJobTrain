package date0623.java7.star;

public class Broker implements StarProxy{
    private StarProxy starProxy;
    public Broker(StarProxy starProxy){
        this.starProxy = starProxy;
    }
    @Override
    public void signContract() {
        System.out.println("经纪人代理明星完成签约");
        starProxy.signContract();
    }
}
