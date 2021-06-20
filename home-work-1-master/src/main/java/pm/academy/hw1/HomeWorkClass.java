package pm.academy.hw1;

public class HomeWorkClass {
    public int getPrimitiveFive() {
        return 5;
    }

    public Integer getMinInteger() { return Integer.MIN_VALUE; }

    public Integer getMaxInteger() {
        return Integer.MAX_VALUE;
    }

    public Long getMinLong() {
        return Long.MIN_VALUE;
    }

    public Long getMaxLong() {
        return Long.MAX_VALUE;
    }

    public String writeToString() {
        String res = new String();
       for(int i = 1; i <= 10; i++)
           res += String.valueOf(i);
        return res;
    }

    public boolean checkForNegativeValue(int number) {
        return number < 0 ? true : false;

    }

    public int getWeekday(Weekdays weekday) {
        int day = 0;
        if (weekday == null) {
            return -1;
        }
        switch (weekday) {
            case MONDAY:
                day = 1;
                break;
            case TUESDAY:
                day = 2;
                break;
            case WEDNESDAY:
                day = 3;
                break;
            case THURSDAY:
                day = 4;
                break;
            case FRIDAY:
                day = 5;
                break;
            case SATURDAY:
                day = 6;
                break;
            case SUNDAY:
                day = 7;
                break;
        }
        return day;
        //return weekday.dayOfWeek;
    }

    public int getFactorial(int val) {
        if(val < 0)
            return -1;
        if(val == 0)
            return 1;
        else
            return val * getFactorial(val - 1);
    }

    public int findMaxValue(int a, int b) {
        return a > b ? a : b;
    }
}
