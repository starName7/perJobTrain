package date0629.java12.workday;



public enum Workday {
    MON,TUE,WED,THU,FRI,SAT,SUN;

    public static void main(String[] args) {
        Workday workday = MON;
        switch (workday){
            case MON:
                System.out.println("星期一，要上班的");
                break;
            case TUE:
                System.out.println("星期二，要上班的");
                break;
            case WED:
                System.out.println("星期三，要上班的");
                break;
            case THU:
                System.out.println("星期四，要上班的");
                break;
            case FRI:
                System.out.println("星期五，要上班的");
                break;
            case SAT:
                System.out.println("星期六，希望能休息");
                break;
            case SUN:
                System.out.println("星期天，希望能休息");
                break;

        }
    }
}
