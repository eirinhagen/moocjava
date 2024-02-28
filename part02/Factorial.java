import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int number = Integer.parseInt(scanner.nextLine());
        int factorial = 1;
        for (int i = 0; i < number ; i++) {
            factorial = factorial*(i+1);
            System.out.println(i+1);
        }
        System.out.println(factorial);
    }
}
