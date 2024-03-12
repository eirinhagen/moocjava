
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // making a scanner tool

        System.out.println("Write a message:");
        // Write your program here
        String message = scanner.nextLine(); // assign variable message to result of nextline method
        System.out.println(message); // print out message variable that contains result of scanner.nextline method


    }
}
