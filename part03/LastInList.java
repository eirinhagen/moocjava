import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println("Please name your favorite animals:");
        while (scanner.hasNextLine()){
            String input = scanner.nextLine();
            if (input.isEmpty()){
                System.out.println("Thanks for your answer!");
                break;
            }
            arrayList.add(input);
        }
        System.out.println(arrayList.getLast());
    }
}
