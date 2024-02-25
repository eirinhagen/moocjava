import java.util.Scanner;

public class ComparingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me number 1");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Give me number 2");
        int secondNumber = Integer.parseInt(scanner.nextLine());
        if (firstNumber > secondNumber){
            System.out.println(firstNumber + " is greater than "+ secondNumber);
        } else if (secondNumber > firstNumber) {
            System.out.println(secondNumber+" is greater than "+firstNumber);
        }else{
            System.out.println(firstNumber+" is equal "+secondNumber);
        }
    }
}
