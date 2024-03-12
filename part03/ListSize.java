import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Name your top anime:");
        while (scanner.hasNextLine()){
            String answer = scanner.nextLine();
            if (answer.isEmpty()){
                System.out.println("Thanks for your answer!");
                break;
            }
            list.add(answer);
        }
        System.out.println("You have " + list.size()+" favorite anime!");
    }
}
