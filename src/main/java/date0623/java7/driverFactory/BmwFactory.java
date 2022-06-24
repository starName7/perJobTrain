package date0623.java7.driverFactory;

public class BmwFactory implements Factory{
    @Override
    public Machine create() {
        return new Bmw();
    }
}
