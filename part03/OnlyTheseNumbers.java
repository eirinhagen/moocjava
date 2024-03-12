import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Gimme numbers:");
        while (scanner.hasNextInt()) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }

        System.out.println("From where?");
        int start = Integer.parseInt(scanner.nextLine());
        System.out.println("To where?");
        int end = Integer.parseInt(scanner.nextLine());

        for (int i = start; i <= end; i++) {
            System.out.println(numbers.get(i));
        }

    }
}