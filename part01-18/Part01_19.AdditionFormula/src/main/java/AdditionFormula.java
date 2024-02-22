
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Give me the first number");
            int first = Integer.parseInt(scanner.nextLine());
            System.out.println("Give me the second number");
            int second = Integer.parseInt(scanner.nextLine());
            System.out.println("Here is a result:");
            System.out.println(first+"+"+ second+"="+(first + second));


        }
}
