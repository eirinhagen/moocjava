import java.util.Scanner;

public class Repeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times do you want to print a phrase?");
        int answer = Integer.parseInt(scanner.nextLine());
      /*  for (int i = 0; i < answer; i++) {
            printTxt();
        }*/
        int number = 0;
        while (number < answer){
            printTxt();
            number++;
        }
    }
    public static void printTxt(){
        System.out.println("In a hole in the ground there lived a method!");
    }
}
