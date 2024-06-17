package Warehousing;

public class Program {
    public static void main(String[] args) {
        ProductWarehouse bookWarehouse = new ProductWarehouse("Books",1000.0);
        System.out.println(bookWarehouse.getName());
        System.out.println(bookWarehouse.getCapacity());
        System.out.println(bookWarehouse.getBalance());
        System.out.println(bookWarehouse.howMuchSpaceLeft());
        bookWarehouse.addToWarehouse(100.0);
        System.out.println(bookWarehouse.howMuchSpaceLeft());
        bookWarehouse.addToWarehouse(1000.0);
        System.out.println(bookWarehouse.howMuchSpaceLeft());
        bookWarehouse.takeFromWarehouse(500.0);
        System.out.println(bookWarehouse.howMuchSpaceLeft());
        System.out.println(bookWarehouse);
    }
}
