import java.util.Scanner;

public class LargerThanOrEqualTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me a first number!");
        int first = Integer.parseInt(scanner.nextLine());
        System.out.println("Please give me a second number!");
        int second = Integer.parseInt(scanner.nextLine());
        if (first > second) {
            System.out.println("Greater number is: " + first);
        } else if (first < second) {
            System.out.println("Greater number is: " + second);
        } else if (first == second) {
            System.out.println("Numbers are equal!");
        }
    }
}
