package date0623.java7.cakeFactory;

public class ChocolateFactory implements Factory{

    @Override
    public Machine create() {
        return new Chocolate();
    }
}
