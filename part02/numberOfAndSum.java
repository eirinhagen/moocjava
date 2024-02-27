import java.util.Scanner;

public class numberOfAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfNumbers = 0;
        int numberOfNumbers = 0;
        while(true){
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());
            if(number == 0){
                System.out.println("Sum of numbers:"+ sumOfNumbers);
                System.out.println("Number of numbers:" + numberOfNumbers);
                break;
            }
            sumOfNumbers = sumOfNumbers + number;
            numberOfNumbers++;
        }


    }
}

