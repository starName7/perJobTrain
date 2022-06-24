package date0623.java7.cakeFactory;

public class FruitsFactory implements Factory{

    @Override
    public Machine create() {
        return new Fruits();
    }
}
