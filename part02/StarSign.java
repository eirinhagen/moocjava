public class StarSign {
    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
    }

    public static void printSquare(int size){
        for (int i = 0; i < size ; i++) {
            printStars(size);}

    }
   public static void printRectangle(int width, int height){
       for (int i = 0; i < height; i++) {
           printStars(width);
       }
    }

    public static void  printTriangle(int size){
        for (int i = 0; i < size; i++) {
            printStars(i+1);
        }
    }

    public static void main(String[] args) {
        printStars(5);
        printSquare(6);
        printRectangle(17,3);
        printTriangle(4);
    }
}
