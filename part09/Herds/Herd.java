package Herds;

import java.util.ArrayList;

public class Herd implements Movable {

    private ArrayList<Organism> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    public void  addToHerd(Organism organism){
        this.herd.add(organism);
    }
    @Override
    public void move(int dx, int dy) {
        for (Organism organism : herd){
            organism.move(dx,dy);
        }
    }

    public String toString() {
        String value = "";

        for (Movable organism: herd) {
            value += organism.toString();
            value += "\n";
        }
        return value;
    };

}
