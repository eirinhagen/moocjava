public class StarSign {
    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
           /* int i = 0;
            while (i <number){
                System.out.println("*");
                i++;*/
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
/*
        public static void printStars(int number) {
            for (int i = 0; i < number; i++) {
                System.out.print("*");
           *//* int i = 0;
            while (i <number){
                System.out.println("*");
                i++;*//*
            }
            System.out.println(" ");*/


      /*  public static void printRectangle(int number, int height){
            for (int i = 0; i < height; i++) {
                printStars(number);
            }
        }*/

        printRectangle(17,3);

    }
}
