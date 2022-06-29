package date0629.java12.season;

public enum Season implements Love{
    SPRING("春天"){
        @Override
        public void live() {
            System.out.println("爱春暖花开");
        }
    },
    SUMMER("夏天"){
        @Override
        public void live() {
            System.out.println("爱热情似火");
        }
    },
    AUTUMN("秋天"){
        @Override
        public void live() {
            System.out.println("爱秋高气爽");
        }
    },
    WINTER("冬天"){
        @Override
        public void live() {
            System.out.println("爱银装素裹");
        }
    };

    Season(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name ;
    }

    private String name;

    public static void main(String[] args) {
        System.out.println(Season.valueOf("SPRING") == Season.SPRING);

        System.out.println(Season.SPRING.toString().equals("春天"));

        System.out.println(Season.SPRING.equals(Season.SPRING));

        System.out.println(Season.SPRING.getDeclaringClass() == Season.AUTUMN.getDeclaringClass());

        System.out.println(Season.SPRING.ordinal());

        System.out.println(Season.SPRING.compareTo(Season.SPRING));

        Season[] values = Season.values();
        for (int i = 0;i < values.length;i++){
            System.out.println(values[i].toString());
            values[i].live();
        }
    }
}
