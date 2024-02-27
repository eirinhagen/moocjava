import java.util.Scanner;

public class InfiniteMyaw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Want to exit? Press y!");
            String input = scanner.nextLine();
            if (input.equals("y")){
               break;
            }

            System.out.println("Myaw");
        }
    }
}
