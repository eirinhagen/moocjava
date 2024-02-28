import java.util.Scanner;

public class WhereToWhereFrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to?");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("Where from?");
        int number1 = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= number-number1; i++) {
            System.out.println(number1+i);

        }
    }
}
