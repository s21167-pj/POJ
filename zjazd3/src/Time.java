/*
Time UML chart implemented in Java.
Author: Marcel P
 */
public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }


    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        String formattedHour = String.format("%02d", hour);
        String formattedMinute = String.format("%02d", minute);
        String formattedSecond = String.format("%02d", second);
        return String.format("%s:%s:%s", formattedHour, formattedMinute, formattedSecond);
    }

    public Time nextSecond() {
        if (second == 59) {
            second = 0;
            if (minute == 59) {
                minute = 0;
                if (hour == 23)
                    hour = 0;
                else
                    hour += 1;
            } else {
                minute += 1;
            }
        } else
            second += 1;
        return this;
    }

    public Time previousSecond() {
        if (second == 0) {
            second = 59;
            if (minute == 0) {
                minute = 59;
                if (hour == 0)
                    hour = 23;
                else
                    hour -= 1;
            } else {
                minute -= 1;
            }
        } else
            second -= 1;
        return this;
    }
}
