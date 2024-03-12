import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Please, give me numbers and I'll find greatest for you!");
        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        int greatest = numbers.getFirst();
        for (int i = 0; i <  numbers.size(); i++) {
            int number = numbers.get(i);
            if (greatest == number){

            }
            if (greatest < number){
                greatest = number;
            }

        }
        System.out.println(greatest);
    }
}
