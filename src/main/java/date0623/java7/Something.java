package date0623.java7;

public class Something {
    public int addOne(final Other o){
//        o = new Other();
        return o.i++;
    }

    public static void main(String[] args) {
        Other o = new Other();
        new Something().addOne(o);
    }

}

class Other{
    public int i;
}
