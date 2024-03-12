package OverloadedCounter;

public class Counter {
    private int value;

    public Counter(int startingValue) {
        this.value = startingValue;
    }

    public Counter() {
        this(0);
    }

    public int getValue() {
        return this.value;
    }

    public void increase() {
        this.increaseBy(1);
    }

    public void increaseBy(int increaseBy) {
        if (increaseBy > 0) {
            this.value = this.value + increaseBy;
        }
    }

    public void decrease() {
        this.decreaseBy(1);
    }

    public void decreaseBy(int decreaseBy) {
        if (decreaseBy > 0) {
            this.value = this.value - decreaseBy;
        }

    }

}
