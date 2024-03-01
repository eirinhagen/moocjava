public class Smallest {
    public static int smallest(int number1, int number2) {
        return Math.min(number1, number2);
    }

    public static void main(String[] args) {
        int answer =  smallest(2, 1);
        System.out.println("Smallest: " + answer);
    }
}
