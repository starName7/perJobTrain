package date0623.java7.animal;

public class AnimalTest {
    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        simulator.paySound(new Dog());
        simulator.paySound(new Cat());
    }
}
