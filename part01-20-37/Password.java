import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Password please!");
        String password = scanner.nextLine();
        if (password.equals("Caput Draconis")){
            System.out.println("Welcome,friend!");
        }else{
            System.out.println("Off with you!");
        }
    }
}
