import java.util.Scanner;

public class NumberOfNegativeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfNegative = 0 ;
        while (true){
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());
            if(number == 0){
                System.out.println("Number of negative:"+numberOfNegative);
                break;
            }
            if(number <0){
                numberOfNegative = numberOfNegative + 1;
            }

        }
    }
}
