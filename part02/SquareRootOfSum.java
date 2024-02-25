import java.util.Scanner;

public class SquareRootOfSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me first number!");
        int first = Integer.parseInt(scanner.nextLine());
        System.out.println("Please give me second number!");
        int second = Integer.parseInt(scanner.nextLine());
        int result = first + second;
        System.out.println(result);
        double squareRoot = Math.sqrt(result);
        System.out.println(squareRoot);
    }
}