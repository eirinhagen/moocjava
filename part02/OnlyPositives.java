import java.util.Scanner;

public class OnlyPositives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Give a number?");
            int number = Integer.parseInt(scanner.nextLine());
            if (number <0){                                     // look, important thing. If goes before other statements because code is being read from top to bottom
                System.out.println("Unsustainable number!");
                continue;
            }
            if (number == 0){
                break;
            }
            int result = number * number;
            System.out.println(result);
        }
    }
}
