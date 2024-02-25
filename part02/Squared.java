import java.util.Scanner;

public class Squared {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, give me a number!");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(number+"*"+number+"="+number*number);
    }
}
