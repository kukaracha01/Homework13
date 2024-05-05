public class Author {
    private String firstNameAuthor;
    private String secondNameAuthor;

    public Author(String firstNameAuthor, String secondNameAuthor) {
        this.firstNameAuthor = firstNameAuthor;
        this.secondNameAuthor = secondNameAuthor;
    }

    //    public String getFirstNameAuthor() {
//        return this.firstNameAuthor;
//    }
//    public String getSecondNameAuthor() {
//        return this.secondNameAuthor;
//    }
    @Override
    public String toString() {
        return this.firstNameAuthor + " " + this.secondNameAuthor;
    }
}

