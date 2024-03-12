package Books;

public class BookNew {
    private String name;
    private int publicationYear;

    public BookNew(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return this.name;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof BookNew)) {
            return false;
        }
        BookNew comparedBook = (BookNew) compared;

        if (
                this.name.equals(comparedBook.name) &&
                        this.publicationYear == comparedBook.publicationYear
        ) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "BookNew{" +
                "name='" + name + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }
}
