package date0629.java12.annotation.docTest;

/**
 * module-service-function
 * @author Michael
 * @version 1.0
 * @see java.lang.Math
 */

public class DocTest {
    /**
     * 程序的入口函数
     * @param args String[] 命令行参数
     */
    public static void main(String[] args) {

    }

    /**
     *
     * @param radius double 半径
     * @return double 圆的面积
     * @throws Exception
     */
    public static double getArea(double radius) throws  Exception{
        return Math.PI * Math.pow(radius,2);
    }
}
