public class FromNumberToOne {
    public static void main(String[] args) {
        printFromNumber(10);
    }

    public static void printFromNumber(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(number-i);
        }
    }

}

