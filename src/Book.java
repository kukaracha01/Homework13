public class Book {
    private String titleBook;
    private Author authorBook;
    private int yearBook;

    public Book(String titleBook, Author authorBook, int yearBook) {
        this.titleBook = titleBook;
        this.authorBook = authorBook;
        this.yearBook = yearBook;
    }

//    public String getTitleBook() {
//        return this.titleBook;
//    }
//
//public String getAuthorBook() {
//    return this.authorBook.getNameAuthor();
//}
//
//    public int getYearBook() {
//        return this.yearBook;
//    }
//
//    public void setYearBook(int yearBook) {
//        this.yearBook = yearBook;
//    }

    @Override
    public String toString() {
        return this.titleBook + ": " + this.authorBook.toString() + ", " + this.yearBook;
    }
}