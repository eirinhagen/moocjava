package OverloadedCounter;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(5);
        System.out.println(counter.getValue());
        counter.increase();
        System.out.println(counter.getValue());
        System.out.println(counter.getValue());
        counter.decrease();
        System.out.println(counter.getValue());
        counter.increaseBy(4);
        System.out.println(counter.getValue());
    }
}
