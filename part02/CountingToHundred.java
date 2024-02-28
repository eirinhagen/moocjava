import java.util.Scanner;

public class CountingToHundred {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < 100; i++) {
            System.out.println(number+i);
        }
    }
}
