package IntarfaceInABox;

import ABC.B;
import CargoHold.Item;

import java.util.ArrayList;

public class Box implements Packable{
    private double capacity;

    private ArrayList<Packable> items;

    public Box(double capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();

    }

    public void add(Packable item) {
        if (item.weight() <= this.capacity) {
            this.items.add(item);
            this.capacity -= item.weight();
        }
    }

    public double weight(){
        double weight = 0;
        for (Packable item : items){
            weight += item.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box{" +
                "capacity=" + capacity +
                ", items=" + items +
                '}';
    }
}
