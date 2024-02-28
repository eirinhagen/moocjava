import java.util.Scanner;

public class RepeatingBreakingAndRemembering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numberOfNumbers = 0;
        int even = 0;
        int odd = 0;
        System.out.println("Write numbers:");
        while (true){
            int number = Integer.parseInt(scanner.nextLine());
            if (number == -1){
                break;
            }
            if(number % 2 == 0){
                even++;
            }
            if (number % 2 != 0){
                odd++;
            }
            numberOfNumbers++;
            sum +=number;
        }
        System.out.println("Thnx bye!");
        System.out.println("Sum:" + sum);
        System.out.println("Number of numbers:" + numberOfNumbers);
        System.out.println("Average:" + sum/numberOfNumbers);
        System.out.println("Even numbers:"+even);
        System.out.println("Odd numbers:"+odd);
    }
}
