import java.util.Scanner;

public class Positivity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number!");
        if(Integer.parseInt(scanner.nextLine()) >0){
            System.out.println("Your number is positive!");
        }else{
            System.out.println("Your number is negative!:(");
        }
    }
}

