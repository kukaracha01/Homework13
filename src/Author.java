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
//
//    public String getSecondNameAuthor() {
//        return this.secondNameAuthor;
//    }
    @Override
    public String toString() {
        return this.firstNameAuthor + " " + this.secondNameAuthor;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author a = (Author) other;
        return firstNameAuthor.equals(a.firstNameAuthor);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstNameAuthor);
    }
}

