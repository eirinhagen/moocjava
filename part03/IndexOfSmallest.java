import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (true){
            int number = Integer.parseInt(scanner.nextLine());
            if(number == -1){
                break;
            }
            arrayList.add(number);
        }
        int smallest = arrayList.getFirst();
        for (int i = 0; i < arrayList.size(); i++) {
            int number = arrayList.get(i);
            if (smallest > number){
                smallest = number;
            }
        }
        System.out.println("Smallest number: " + smallest);
        System.out.println("Found at index: "+ arrayList.indexOf(smallest));
    }
}
