package Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        menu.addMeal("Pizza");
        menu.addMeal("Pasta");
        menu.printMeals();
        menu.clearMenu();
        menu.printMeals();
    }
}
