import java.util.Scanner;

public class SpeedingTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //making a scanner tool
        System.out.println("Hello,dear friend! Let's make a speeding test!");
        int number = Integer.parseInt(scanner.nextLine()); //assigning result of scanner to number
        if (number > 120) {  // conditional statement
            System.out.println("Speeding ticket to this gentlemen!");
        }
    }
}
