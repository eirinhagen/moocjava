package PrintMeAnotherHashMap;

public class Book {
    private String name;
    private String contents;
    private int publicationYear;

    public Book(String name,int publicationYear){
        this.name = name;
        this.publicationYear = publicationYear;
        this.contents = contents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    public String toString(){
        return "Name: "+this.name+"("+this.publicationYear+")";
    }
}
