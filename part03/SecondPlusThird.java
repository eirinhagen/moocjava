import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Give numbers:");
        while (scanner.hasNextInt()){
            int number = scanner.nextInt();
            if (number == 0){
                break;
            }
            list.add(number);
        }
        System.out.println(list.get(1)+list.get(2));
    }
}
