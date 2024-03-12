import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println("Please name your favorite movies:");
        while (scanner.hasNextLine()){
            String input = scanner.nextLine();
            if(input.isEmpty()){
                break;
            }
            arrayList.add(input);
        }
        String first = arrayList.getFirst();
        String last = arrayList.getLast();
        System.out.println(first);
        System.out.println(last);
    }
}
