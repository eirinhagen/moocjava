import java.util.Scanner;

public class GradesAndPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me your score, friend!");
        int score = Integer.parseInt(scanner.nextLine());
        if (score > 100) {
            System.out.println("Excellent!");
        } else if (score >= 70) {
            System.out.println("Good!");
        } else if (score >= 40) {
            System.out.println("Fine!");
        } else if (score >= 20) {
            System.out.println("Can be better!");
        } else if (score >= 0) {
            System.out.println("Try next time!");
        } else if (score < 0) {
            System.out.println("Poor little bugger...");
        }

    }
}
