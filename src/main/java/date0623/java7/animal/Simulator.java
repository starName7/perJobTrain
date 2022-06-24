package date0623.java7.animal;

public class Simulator {
    public void paySound(Animal animal){
        AbstractAnimal a = (AbstractAnimal) animal;
        a.getAnimalName();
        a.cry();
    }
}
