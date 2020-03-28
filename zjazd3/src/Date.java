/*
Date UML chart implemented in Java.
Author: Marcel P
 */

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }



    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        String formattedDay = String.format("%02d", day);
        String formattedMonth = String.format("%02d", month);
        System.out.println(String.format("%s/%s/%s", formattedDay, formattedMonth, year));
        return String.format("%s/%s/%s", formattedDay, formattedMonth, year);
    }

    public static void main(String[] args) {
        Date date = new Date(5, 1, 1996);
        date.toString();
    }
}
