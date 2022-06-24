package date0623.java7.cakeFactory;

public class CheeseFactory implements Factory{

    @Override
    public Machine create() {
        return new Cheese();
    }
}
