public class printUntilNumber {
    public static void main(String[] args) {
        printUntilNr(10);
    }

    public static void printUntilNr(int number) { // defining method outside main method
        for (int i = 0; i < number; i++) {
            System.out.println(i + 1);
        }

    }
}
