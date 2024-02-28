import java.util.Scanner;

public class SumOfSequence {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0 ; i < number ; i++) {
           sum += (i +1);
           System.out.println(i+1);
        }
        System.out.println("The sum is "+ sum);
    }
}