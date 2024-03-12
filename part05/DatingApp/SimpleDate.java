package DatingApp;

public class SimpleDate {
    private int day;
    private int month;
    private int year;
    private int limitDay;

    private int limitMonth;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.limitDay = 30;
        this.limitMonth = 12;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }


    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        return this.year == compared.year && this.month == compared.month &&
                this.day < compared.day;
    }

    public void advance() {
        this.day = this.day + 1;
        if (this.day > this.limitDay) {
            this.day = 1;
            this.month = this.month + 1;

            if (this.month > this.limitMonth) {
                this.month = 1;
                this.year = this.year + 1;
            }
        }

    }

    public void advance(int howManyDays) {
        for (int i = 0; i < howManyDays; i++) {
            this.advance();
        }
    }

    public SimpleDate afterNumberOfDays(int days){
        SimpleDate newDate = new SimpleDate(day,month,year);
        for (int i = 0; i < days; i++) {
            newDate.advance(days);
        }
        return newDate;
    }

}




