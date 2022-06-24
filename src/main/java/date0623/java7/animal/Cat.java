package date0623.java7.animal;

public class Cat extends AbstractAnimal{
    @Override
    public void cry() {
        System.out.println("喵喵喵");
    }

    @Override
    public void getAnimalName() {
        System.out.println("这是一只猫");
    }
}
