import java.util.Scanner;

public class TotalOfOnes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // The task is to keep count of number ones
        int ones = 0;

// The task is to read an input from the user
        while (true) {



            System.out.println("Insert a number (0 exits): ");
            // The task is to read a user inputted number
            int number = Integer.valueOf(scanner.nextLine());

            // The task is to exit the loop if the user
            // has inputted zero
            if (number == 0) {
                break;
            }

            // The task is to increase the amount of ones
            // if the user inputs a number one
            if (number == 1) {
                ones = ones + 1;
            }

            // The task is to print out the total of ones
            System.out.println("The total of ones: " + ones);
        }
    }
}
