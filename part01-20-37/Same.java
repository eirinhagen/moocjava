import java.util.Scanner;

public class Same {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first string");
        String first = scanner.nextLine();
        System.out.println("Enter a second string");
        String second = scanner.nextLine();
        if (first.equals(second)){
            System.out.println("Same");
        }else{
            System.out.println("Different");
        }
    }
}
