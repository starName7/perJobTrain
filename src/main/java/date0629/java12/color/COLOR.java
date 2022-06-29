package date0629.java12.color;

public enum COLOR implements Show {
    RGB("艳红", new RGB(237, 90, 101)),
    GREEN("石绿",new RGB(87,195,194)),
    BLUE("瀑布蓝",new RGB(81,196,211));
    private RGB rgb;
    private String name;
    public RGB getRgb() {
        return rgb;
    }
    @Override
    public void show() {
        System.out.println("RGB("+ getRgb().getRed()+"."+ getRgb().getGreen()+"."+ getRgb().getBlue()+")");
    }
    COLOR(String name, RGB rgb) {
        this.name = name;
        this.rgb = rgb;
    }

    public static void main(String[] args) {
        COLOR.RGB.show();
        COLOR.GREEN.show();
        COLOR.BLUE.show();
    }
}
