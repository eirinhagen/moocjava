import java.util.ArrayList;

// IKKE FERDIG
public class Statistics {

    //fields
    private int count;
    private int sum;
    private ArrayList<Integer> numbers = new ArrayList<>();

    //constructor
    public Statistics() {
        this.count = 0;
    }

    public void addNumber(int number) {
        this.numbers.add(number);
        this.count++;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        if (this.count == 0) {
            return 0;
        } else {
            return sum;
        }
    }

    public double average() {
        double average;
        if (this.count == 0) {
            average = 0;
        } else {
            average = 1.0 * this.sum / this.count;
        }
        return average;
    }


    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
    }
}
