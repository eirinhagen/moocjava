import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int sum = 0;
        while (true){
            int number = Integer.parseInt(scanner.nextLine());
            if (number == -1){
                break;
            }
            arrayList.add(number);
        }
        for (Integer number : arrayList) {
            sum = sum + number;
        }
        System.out.println("The sum is "+ sum);
    }
}
