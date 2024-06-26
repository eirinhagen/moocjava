package Warehousing;

public class Warehouse {
    private double capacity;
    private double balance;

    public Warehouse(double capacity) {
        if (capacity <= 0.0) {
            this.capacity = 0.0;
        } else {
            this.capacity = capacity;
        }
        this.balance = 0;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double howMuchSpaceLeft() {
        double space = this.capacity - this.balance;
        return space;
    }

    public void addToWarehouse(double amount) {
        if (amount < 0.0) {
            return;
        }
        if (amount <= howMuchSpaceLeft()) {
            this.balance = this.balance + amount;
        } else {
            this.balance = this.capacity;
        }
    }

    public double takeFromWarehouse(double amount) {
        if (amount < 0.0) {
            return 0.0;
        }
        if (amount > this.balance) {
            double allWeCanTake = this.balance;
            this.balance = 0.0;
            return allWeCanTake;

        } else {
            this.balance = this.balance - amount;
            return amount;
        }

    }

    public String toString() {
        return "balance = " + this.balance + ", space left " + howMuchSpaceLeft();
    }

}
