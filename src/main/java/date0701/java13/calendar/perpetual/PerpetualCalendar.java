package date0701.java13.calendar.perpetual;

import org.junit.Test;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PerpetualCalendar {
    private CalendarFrame view;
    //此句的意义何在？（）
//    创建Calendar抽象类的子类实例
    private Calendar calendar = Calendar.getInstance();
    //此句的意义何在？（）
//     按照指定的格式创建一个日期对象
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM⽉");

    //此⽅法的意义何在？（）
//   将当前获取的日期的月份加一
    public void incMonth() {
        calendar.add(Calendar.MONTH, 1);
        updateCalendar();
    }

    //此⽅法的意义何在？（）
//    将当前获取的日期的月份减一
    public void decMonth() {
        calendar.add(Calendar.MONTH, -1);
        updateCalendar();
    }

    public PerpetualCalendar() {
        view = new CalendarFrame(this);
        updateCalendar();
    }

    //此⽅法的意义何在？（）
    private void updateCalendar() {
        //此句的意义何在？（）
//        获取一个月里天数的最大值
        int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        int currentDay = -1;
        //此句的意义何在？（）
//     创建Calendar抽象类的子类实例
        Calendar c = Calendar.getInstance();
        //此if语句的意义何在？（）
//        判断变量c和变量calendar，所指向的实例的年和月是否相等，如果相等将 当前月份的天数，赋值给变量currentDay
        if (c.get(Calendar.YEAR) == calendar.get(Calendar.YEAR)
                && c.get(Calendar.MONTH) == calendar.get(Calendar.MONTH)) {
            currentDay = c.get(Calendar.DATE);
        }
        //此句的意义何在？（）
//        修改变量c所指向的日期对象的月份为1月
        c.set(calendar.get(calendar.get(Calendar.MONTH)), 1);
        //此句的意义何在？（）
//        将当前的星期赋值给局部变量begin(每个星期是从星期日开始的)
        int begin = c.get(Calendar.DAY_OF_WEEK);
        view.setCalendar(begin, maxDay, currentDay);
        view.setYearAndMonth(sdf.format(calendar.getTime()));
    }

    public void show() {
        view.setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        for (UIManager.LookAndFeelInfo info :
                UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
        PerpetualCalendar calendar = new PerpetualCalendar();
        calendar.show();
    }
}
