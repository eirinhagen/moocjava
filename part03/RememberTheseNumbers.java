import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Gimme numbers;)");
        while (scanner.hasNextInt()){
            int number = scanner.nextInt();
            if (number == -1){
                System.out.println("Thank you for numbers!");
                break;
            }
            arrayList.add(number);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
