import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Check if year is leap");
        int year = Integer.parseInt(scanner.nextLine());
        if (year % 100 == 0 && year % 400 == 0){
            System.out.println("Year is leap!");
        } else if (year % 4 == 0) {
            System.out.println("Year is leap(2)!");
        }else{
            System.out.println("Year is not leap!");
        }
    }
}
