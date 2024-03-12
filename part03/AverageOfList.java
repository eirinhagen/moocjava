import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int sum = 0;
        int numberOfNumbers = 0;
        double average = 0;
        while (true){
            int number = Integer.parseInt(scanner.nextLine());
            if (number == -1){
                break;
            }
            arrayList.add(number);
        }
        for(Integer number : arrayList){
            sum = sum + number;
            numberOfNumbers++;
        }
        average = sum * 1.0 / numberOfNumbers;
        System.out.println("The average is "+average);
    }
}
