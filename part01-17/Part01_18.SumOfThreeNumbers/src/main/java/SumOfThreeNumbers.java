
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Give me the first number");
            int first = Integer.parseInt(scanner.nextLine());
            System.out.println("Give me the second number");
            int second = Integer.parseInt(scanner.nextLine());
            System.out.println("Give me the third number");
            int third = Integer.parseInt(scanner.nextLine());
            int result = first + second + third;
            System.out.println("Here is a result:");
            System.out.println(result);


        }
}
