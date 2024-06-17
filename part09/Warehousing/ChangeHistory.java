package Warehousing;

import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public String toString() {
        return history.toString();
    }

    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double maxValue = this.history.getFirst();
        for (Double value : this.history) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    public double minValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double minValue = this.history.getFirst();
        for (Double value : this.history) {
            if (value < minValue) {
                minValue = value;

            }
        }
        return minValue;
    }

    public double average() {
        if (this.history.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (Double value : this.history) {
            sum += value;
        }
        return sum / this.history.size();
    }
}
