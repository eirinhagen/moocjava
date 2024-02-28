import java.util.Scanner;

public class SumOfSequenceAndSequel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int number = Integer.parseInt(scanner.nextLine()); // feks 5
        System.out.println("First number?");
        int number01 = Integer.parseInt(scanner.nextLine()); // feks 3
        int sum = 0;
        for (int i = 0; i <= number-number01; i++) {
            sum += number01 + i;
            System.out.println(i);
            System.out.println(number01 + i);
        }
        System.out.println("The sum is " + sum);
    }
}
