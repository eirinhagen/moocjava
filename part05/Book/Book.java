package Book;

public class Book {
    private String title;
    private String author;
    private  int pages;

    public Book(String bookTitle,String bookAuthor, int bookPages){
        this.title = bookTitle;
        this.author = bookAuthor;
        this.pages = bookPages;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getPages(){
        return pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                '}';
    }
}
