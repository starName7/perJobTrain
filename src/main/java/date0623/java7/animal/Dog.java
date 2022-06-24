package date0623.java7.animal;

public class Dog extends AbstractAnimal{
    @Override
    public void getAnimalName() {
        System.out.println("这是一只狗");
    }

    @Override
    public void cry() {
        System.out.println("汪汪汪");
    }
}
