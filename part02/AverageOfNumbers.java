import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int averageOfNumbers = 0;
        int sumOfNumbers = 0;
        int numberOfNumbers = 0;
        while(true){
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());
            if(number == 0){
                System.out.println("Average of numbers:"+ averageOfNumbers);
                break;
            }
            numberOfNumbers++;
           sumOfNumbers = sumOfNumbers + number;
           averageOfNumbers = sumOfNumbers / numberOfNumbers;
        }


    }
}


