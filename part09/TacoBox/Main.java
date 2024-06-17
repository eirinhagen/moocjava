package TacoBox;

public class Main {
    public static void main(String[] args) {
        TacoBox tacoBox = new TripleTacoBox();
        System.out.println(tacoBox.tacosRemaining());
        tacoBox.eat();
        System.out.println(tacoBox.tacosRemaining());
        tacoBox.eat();
        System.out.println(tacoBox.tacosRemaining());
        tacoBox.eat();
        System.out.println(tacoBox.tacosRemaining());
        tacoBox.eat();
        System.out.println(tacoBox.tacosRemaining());
        CustomTacoBox tacoBox1 = new CustomTacoBox(10);
        TacoBox tacoBox2 = new CustomTacoBox(115);
    }

}
