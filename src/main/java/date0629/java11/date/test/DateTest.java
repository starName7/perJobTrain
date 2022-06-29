package date0629.java11.date.test;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;


public class DateTest {
    @Test
    public void test23() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread.sleep(1000);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    @Test
    public void test24() {
        Date date = new Date();
        System.out.println(date);
        Date currentDate = new Date(0);
        System.out.println(currentDate);
    }

    @Test
    public void test25() {
        Date date = new Date();
        System.out.println(date.getTime());
        System.out.println(date.toString());
    }

    @Test
    public void test26() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formatDate = sdf.format(date);
        System.out.println(formatDate);
    }

    @Test
    public void test27() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String stringDate = "2022-06-29 14:14:47";
        Date parse = simpleDateFormat.parse(stringDate);
        System.out.println(parse);
    }

    @Test
    public void test28() {
        Calendar instance = Calendar.getInstance();
        int year = instance.get(Calendar.YEAR);
        int month = instance.get(Calendar.MONTH);
        int date = instance.get(Calendar.DATE);
        int hour = instance.get(Calendar.HOUR);
        int minute = instance.get(Calendar.MINUTE);
        int second = instance.get(Calendar.SECOND);
        System.out.println(year + "-" + (month + 1) + "-" + date + " " + hour + ":" + minute + ":" + second);

        //增加一个小时
        instance.add(Calendar.HOUR, 1);
        System.out.println(instance.getTime());
        System.out.println(instance.getTime());

        instance.setTime(new Date(0));
        int year1 = instance.get(Calendar.YEAR);
        int month1 = instance.get(Calendar.MONTH);
        int date1 = instance.get(Calendar.DATE);
        int hour1 = instance.get(Calendar.HOUR);
        int minute1 = instance.get(Calendar.MINUTE);
        int second1 = instance.get(Calendar.SECOND);
        System.out.println(year1 + "-" + (month1 + 1) + "-" + date1 + " " + hour1 + ":" + minute1 + ":" + second1);
    }

    @Test
    public void test29() {
        LocalDateTime max = LocalDateTime.MAX;
//        System.out.println(max);

        LocalDateTime min = LocalDateTime.MIN;
//        System.out.println(min);

        LocalDateTime now = LocalDateTime.now();
//        System.out.println(now);

        LocalDateTime nowClock = LocalDateTime.now(Clock.systemUTC());
//        System.out.println(nowClock);

        LocalDateTime nowZoneId = LocalDateTime.now(ZoneId.systemDefault());
//        System.out.println(nowZoneId);

        LocalDateTime dateTime1 = LocalDateTime.of(2021, 1, 17, 6, 30);
//        System.out.println(dateTime1);

        LocalDateTime dateTime = LocalDateTime.of(2019,10,12,6,30);
//        System.out.println(dateTime);

        LocalDateTime dateTime2 = LocalDateTime.of(2021,1,17,1,1,1);
//        System.out.println(dateTime2);

        LocalDateTime dateTime3 = LocalDateTime.of(2021, Month.JANUARY,17,1,1,1,1);
//        System.out.println(dateTime3);

        LocalDateTime localDateTime = LocalDateTime.of(2019,Month.OCTOBER,12,6,30);
//        System.out.println(localDateTime);

        LocalDateTime dateTime4  = LocalDateTime.of(2019,Month.JANUARY,17,1,1,1);
//        System.out.println(dateTime4);

        LocalDateTime dateTime5 = LocalDateTime.of(2021,Month.JANUARY,17,1,1,1,1);
//        System.out.println(dateTime5);

        LocalDateTime dateTime6 = LocalDateTime.of(LocalDate.now(),LocalTime.now());
//        System.out.println(dateTime6);

        LocalDateTime time = LocalDateTime.ofEpochSecond(55L,99999, ZoneOffset.UTC);
//        System.out.println(time);

        LocalDateTime ofInstant = LocalDateTime.ofInstant(Instant.now(),ZoneId.systemDefault());
//        System.out.println(ofInstant);

        LocalDateTime parse = LocalDateTime.parse("2019-10-17T16:54:50.941");
//        System.out.println(parse);

        LocalDateTime parse1 = LocalDateTime.parse("2019-10-17T16:54:50.941+01:00", DateTimeFormatter.ISO_OFFSET_DATE_TIME);
//        System.out.println(parse1);

        LocalDateTime plus =parse.plus(1L, ChronoUnit.HOURS);
//        System.out.println(plus);

        LocalDateTime plus1 = parse.plus(Period.ofDays(1));
//        System.out.println(plus1);

        LocalDateTime plus2 = parse.plus(Period.ofMonths(3));
//        System.out.println(plus2);

        LocalDateTime plus3 = parse.plusDays(1L);
//        System.out.println(plus3);

        LocalDateTime plus4 = parse.plusHours(1);
//        System.out.println(plus4);

        LocalDateTime plus5 = parse.plusMinutes(1);

        LocalDateTime plus6 = parse.plusMonths(1);

        LocalDateTime plus7 = parse.plusNanos(1);

        LocalDateTime plus8 = parse.plusSeconds(1);

        LocalDateTime plus9 = parse.plusWeeks(1);

        LocalDateTime plus10 = parse.plusYears(1);

        LocalDateTime minus1 = parse.minusDays(1);
    }

    @Test
    public void test30() throws InterruptedException {
        Instant start = Instant.now();

        Thread.sleep(1000);

        Instant end = Instant.now();

        Duration between = Duration.between(start,end);

        System.out.println(between.getSeconds());
        System.out.println(Instant.MAX);
        System.out.println(Instant.MIN);

        System.out.println(Instant.now().atOffset(ZoneOffset.ofHours(8)));
    }

    @Test
    public void test31(){
        String dateStr = "2021年01月17日";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");


        LocalDate date = LocalDate.parse(dateStr,formatter);
        System.out.println(date);
        String format1 = date.format(formatter);
        System.out.println(format1);

        String dateTimeStr = "2021-01-17 12:00:00";
        DateTimeFormatter formatter02 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        LocalDateTime localDateTime = LocalDateTime.parse(dateTimeStr,formatter02);
        System.out.println(localDateTime);

        String format = localDateTime.format(formatter02);
        System.out.println(format);
    }

    @Test
    public void test32(){
        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = LocalTime.of(15,23,32);

        Duration duration = Duration.between(localTime,localTime1);
        System.out.println(duration);
        System.out.println(duration.getSeconds());
        System.out.println(duration.getNano());
        LocalDateTime localDateTime = LocalDateTime.of(2016,6,12,15,23,32);
        LocalDateTime localDateTime1 = LocalDateTime.of(2017,6,12,15,23,32);
        Duration duration1 = Duration.between(localDateTime,localDateTime1);
        System.out.println(duration1.toDays());

    }

    @Test
    public void test33(){
        TemporalAdjuster temporalAdjuster = TemporalAdjusters.next(DayOfWeek.SUNDAY);
        LocalDateTime localDateTime = LocalDateTime.now().with(temporalAdjuster);
        System.out.println(localDateTime);

        LocalDate localDate = LocalDate.now().with(new TemporalAdjuster() {
            @Override
            public Temporal adjustInto(Temporal temporal) {
                LocalDate date = (LocalDate) temporal;
                if(date.getDayOfWeek().equals(DayOfWeek.FRIDAY)){
                    return date.plusDays(3);
                }else if(date.getDayOfWeek().equals(DayOfWeek.SATURDAY)){
                    return date.plusDays(2);
                }else{
                    return date.plusDays(1);
                }
            }
        });
        System.out.println("下一个工作日是:" + localDate);
    }
    @Test
    public void test34(){
        String javaVersion = System.getProperty("java.version");
        System.out.println("java的version: " + javaVersion);

        String javaHome = System.getProperty("java.home");
        System.out.println("java的home: " + javaHome);

        String osName = System.getProperty("os.name");
        System.out.println("os的name: " + osName);

        String osVersion = System.getProperty("os.version");
        System.out.println("os的version: " + osVersion);

        String userHame = System.getProperty("user.name");
        System.out.println("user的home: " + userHame);

        String userDir = System.getProperty("user.dir");
        System.out.println("user的dir: " +userDir);

    }

    @Test
    public void test35(){
        String format = new DecimalFormat("0.00").format(123.12);
        System.out.println(format);
        NumberFormat instance = NumberFormat.getInstance();
        instance.setMaximumFractionDigits(2);
        String strNumber = instance.format(12321321.123123);
        System.out.println(strNumber);
    }

    @Test
    public void test36(){
        BigInteger bi = new BigInteger("12433241123");
        BigDecimal bd = new BigDecimal("12435.351");
        BigDecimal bd2 = new BigDecimal("11");
        System.out.println(bi);

        System.out.println(bd.divide(bd2,BigDecimal.ROUND_HALF_UP));
        System.out.println(bd.divide(bd2,15,BigDecimal.ROUND_HALF_UP));
    }

}
