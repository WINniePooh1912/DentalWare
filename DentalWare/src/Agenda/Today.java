
package Agenda;

public class Today {
    int day;
    int month;
    int year;

    public Today(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Today() {
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
    
    public boolean isToday(Today date) {
        return day == date.getDay() && month == date.getMonth() && year == date.getYear();
    }
}
