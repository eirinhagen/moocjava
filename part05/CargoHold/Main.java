package CargoHold;

public class Main {
    public static void main(String[] args) {
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        Suitcase suitcase = new Suitcase(5);
        Suitcase suitcase1 = new Suitcase(5);
        Hold hold = new Hold(15);


        System.out.println(suitcase);
        suitcase.addItem(book);
        System.out.println(suitcase);
        suitcase.addItem(brick);
        System.out.println(suitcase);
        System.out.println(suitcase.heaviestItem());
        suitcase1.addItem(phone);
        System.out.println(suitcase1);
        suitcase1.printItems();

        hold.addSuitcase(suitcase);
        hold.addSuitcase(suitcase1);
        System.out.println(hold.totalWeight());
        hold.printItems();

    }
}
