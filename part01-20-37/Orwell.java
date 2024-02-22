import java.util.Scanner;

public class Orwell {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, friend!Give me a number please.");
        int answer = Integer.parseInt(scanner.nextLine());
        if (answer == 1984) {
            System.out.println("Orwell");
        }
    }
}
