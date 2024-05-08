import java.util.Objects;

public class Book {
    private String titleBook;
    private Author authorBook;
    private int yearBook;

    public Book(String titleBook, Author authorBook, int yearBook) {
        this.titleBook = titleBook;
        this.authorBook = authorBook;
        this.yearBook = yearBook;
    }

    public String getTitleBook() {
        return this.titleBook;
    }

    public String getAuthorBook() {
        return this.authorBook.toString();
    }

    public int getYearBook() {
        return this.yearBook;
    }

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }

    @Override
    public String toString() {
        return this.titleBook + ": " + this.authorBook.toString() + ", " + this.yearBook;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        Book b = (Book) other;
        return Objects.equals(titleBook, b.titleBook) && Objects.equals(authorBook, b.authorBook) && Objects.equals(yearBook, b.yearBook);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(titleBook, authorBook, yearBook);
    }
}
