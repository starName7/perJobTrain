package date0704.java15.apple;

public class Apple <T>{
    private T weight;

    public T getWeight() {
        return weight;
    }

    public void setWeight(T weight) {
        this.weight = weight;
    }

    public Apple(T weight) {
        this.weight = weight;
    }
    public Apple(){

    }

    public static void main(String[] args) {
        Apple<String> a1 = new Apple<>();
        Apple<Integer> a2 = new Apple<>(500);
        Apple<Double> a3 = new Apple<>(500.0);
        a1.setWeight("500克");
        System.out.println(a1.getWeight());
        System.out.println(a2.getWeight());
        System.out.println(a3.getWeight());
    }
}
