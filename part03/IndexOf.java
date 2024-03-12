import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write numbers:");
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (true){ //  while (scanner.hasNext()) // while(true)
            int number = Integer.parseInt(scanner.nextLine()); // scanner.nextInt()
            if (number == -1){
                System.out.println("Thank you for your answer!");
                break;
            }
            arrayList.add(number);
        }
        System.out.println("Search for?");
        int index = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < arrayList.size(); i++) {
            if (i == index){
                System.out.println(arrayList.get(i)+" is at index "+index);
            }
        }
    }
}
