public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for (int i = 0; i < size; i++) {
            printSpaces(size - (i + 1));
            printStars(i*2 +1);

        }
    }

    public static void printBase(int space, int width, int height) {
        for (int i = 0; i < height; i++) {
            printSpaces(space);
            printStars(width);
        }
    }

    public static void printChristmasTree(int height) {
    printTriangle(height);
    printBase(height-2,3,2);
    }

    public static void main(String[] args) {
        printChristmasTree(10);
    }
}
