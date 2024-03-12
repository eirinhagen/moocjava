
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days want you to convert to seconds?");
        int days = Integer.parseInt(scanner.nextLine());
        int result = days * 86400;
        System.out.println("There is " + result + " seconds in " + days +" days!");
    }
}
