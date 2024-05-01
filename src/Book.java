public class Book {
    private String titleBook;
    private String authorBook;
    private int yearBook;

    public Book(String titleBook, String authorBook, int yearBook) {
        this.titleBook = titleBook;
        this.authorBook = authorBook;
        this.yearBook = yearBook;
    }

    public String getTitleBook() {
        return this.titleBook;
    }

    public String getAuthorBook() {
        return this.authorBook;
    }

    public int getYearBook() {
        return this.yearBook;
    }

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }
}
