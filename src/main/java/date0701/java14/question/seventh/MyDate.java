package date0701.java14.question.seventh;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MyDate) {
            MyDate m = (MyDate) obj;
            if (Integer.compare(m.getYear(), this.getYear()) == 0) {
                if (Integer.compare(m.getMonth(), this.getMonth()) == 0) {
                    if (Integer.compare(m.getDay(), this.getDay()) == 0) {
                        return true;
                    }
                }

            }
        }
        return false;
    }
}
