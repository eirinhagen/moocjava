
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me string");
        String first = input.nextLine();
        System.out.println("Give me integer");
        int second = Integer.parseInt(input.nextLine());
        System.out.println("Give me double");
        double third = Double.parseDouble(input.nextLine());
        System.out.println("Give me boolean");
        boolean forth = Boolean.parseBoolean(input.nextLine());
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(forth);

    }
}
