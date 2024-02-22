import java.util.Scanner;

public class AncientHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number!");
        if (Integer.parseInt(scanner.nextLine()) <= 2023){
            System.out.println("Ancient history!");
        }
    }
}
