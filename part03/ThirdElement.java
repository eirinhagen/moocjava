import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {
    public static void main(String[] args) {
        System.out.println("Who is your friends?");
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (scanner.hasNextLine()){
            String name = scanner.nextLine();
            list.add(name);
            if (name.isEmpty()){
                break;
            }
        }
        System.out.println(list.get(2));
    }
}
