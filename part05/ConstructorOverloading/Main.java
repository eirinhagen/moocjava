package ConstructorOverloading;

public class Main {
    public static void main(String[] args) {
        Product tapeMeasure = new Product("Tape Measure");
        Product plaster = new Product("Plaster","Home improvement");
        Product tyre = new Product("Tyre",5);
        System.out.println(tapeMeasure);
        System.out.println(plaster);
        System.out.println(tyre);
    }
}
