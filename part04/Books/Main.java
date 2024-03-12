package Books;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true){
            System.out.println("Title: ");
            String userTitle = scanner.nextLine();

            if(userTitle.isEmpty()){
                break;
            }

            System.out.println("Pages: ");
            int userPages = Integer.parseInt(scanner.nextLine());

            System.out.println("Year of publication: ");
            int userYearOfPublication = Integer.parseInt(scanner.nextLine());

            books.add(new Book(userTitle,userPages,userYearOfPublication));
        }

        System.out.println("What information will be printed?");
        String userAnswer = scanner.nextLine();
        for(Book book : books){
            if(userAnswer.equals("everything")){
                System.out.println(book);
            }
            if (userAnswer.equals("name")){
                System.out.println(book.getTitle());
            }

        }
    }
}
