package IdenticalTwins;

public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof SimpleDate)) {
            return false;
        }

        SimpleDate comparedDate = (SimpleDate) compared;

        if (this.day == comparedDate.day && this.month == comparedDate.month && this.year == comparedDate.year) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

}
