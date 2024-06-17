package Herds;

public class MainProgram {
    public static void main(String[] args) {
        Organism eirin = new Organism(0,0);
        Organism charles = new Organism(0,0);
        Herd herd = new Herd();
        eirin.move(10,20);
        System.out.println(eirin);
        herd.addToHerd(eirin);
        herd.addToHerd(charles);
        System.out.println(herd);
        herd.move(30,20);
        System.out.println(herd);
    }
}
