import java.util.Scanner;

public class CarryOn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Shall we carry on?");
            String input = scanner.nextLine();
            if (input.equals("no")) {
                System.out.println("Understood!");
                break;
            }else{
                System.out.println("Yohoo the ride never ends!");
            }
        }
    }
}
