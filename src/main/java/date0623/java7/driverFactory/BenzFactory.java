package date0623.java7.driverFactory;

public class BenzFactory implements Factory{
    @Override
    public Machine create() {
        return new Benz();
    }
}
