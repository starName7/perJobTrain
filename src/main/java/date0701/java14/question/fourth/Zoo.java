package date0701.java14.question.fourth;

import java.time.LocalDateTime;
import java.util.List;

public class Zoo {
    private String zooName;
    private LocalDateTime zooCreateTime;
    private int count;
    private List list;

    public Zoo(String zooName) {
        this.zooName = zooName;
        this.zooCreateTime = LocalDateTime.now();
    }

    public String getZooName() {
        return zooName;
    }

    public void setZooName(String zooName) {
        this.zooName = zooName;
    }

    public LocalDateTime getZooCreateTime() {
        return zooCreateTime;
    }

    private void setZooCreateTime(LocalDateTime zooCreateTime) {
        this.zooCreateTime = zooCreateTime;
    }

    public int getCount() {
        return count;
    }

    private void setCount(int count) {
        this.count = count;
    }

    public void addAnimal(Animal ani){
        this.list.add(ani);
        this.setCount(list.size());
    }
    public Animal findAnimal(int index){
        return (Animal) this.list.get(index);
    }
    public void updateAnimal(int index,Animal properties){
        this.list.set(index,properties);
    }
    public void removeAnimal(int index){
        this.list.remove(index);
        this.setCount(list.size());
    }
    public void changeZooName(String Name){
        this.setZooName(Name);
    }

}
