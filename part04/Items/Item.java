package Items;

import java.util.ArrayList;
import java.util.Scanner;

public class Item {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Items> items = new ArrayList<>();

        System.out.println("Create an item:");
        while (scanner.hasNextLine()) {
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            items.add(new Items(name));
        }

        for (Items item : items) {
            System.out.println(item);
        }


    }
}
