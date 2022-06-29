package date0629.java12.enumerate;

public enum ArithmeticEnum implements Arithmetic{
    ADD(){
        @Override
        public void cal(double x, double y) {
            System.out.println(x + y);
        }
    },
    SUBTRACT(){
        @Override
        public void cal(double x, double y) {
            System.out.println(x - y);
        }
    },
    MULTIPLY(){
        @Override
        public void cal(double x, double y) {
            System.out.println(x * y);
        }
    },
    DIVIDE(){
        @Override
        public void cal(double x, double y) {
            System.out.println( x / y);
        }
    },
    REMAINDER(){
        @Override
        public void cal(double x, double y) {
            System.out.println(x % y);
        }
    };

    private ArithmeticEnum(){}

    public static void main(String[] args) {
        ArithmeticEnum.ADD.cal(10,10);
    }
}
