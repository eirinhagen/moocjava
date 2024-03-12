package Books;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BookNew> books = new ArrayList<>();
        int numberOfBooks = 0;

        while (true) {
            System.out.println("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Publication year : ");
            int publicationYear = Integer.parseInt(scanner.nextLine());
            BookNew book = new BookNew(name, publicationYear);
            if (books.contains(book)) {
                System.out.println("The book is already on list!");
            } else {
                books.add(book);
                numberOfBooks++;
            }
        }
        for (BookNew book : books) {
            System.out.println(book);
        }
        System.out.println(numberOfBooks);
    }
}
