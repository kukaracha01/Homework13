import java.util.Objects;

public class Author {
    private String firstNameAuthor;
    private String secondNameAuthor;

    public Author(String firstNameAuthor, String secondNameAuthor) {
        this.firstNameAuthor = firstNameAuthor;
        this.secondNameAuthor = secondNameAuthor;
    }

    public String getFirstNameAuthor() {
        return this.firstNameAuthor;
    }

    public String getSecondNameAuthor() {
        return this.secondNameAuthor;
    }

    @Override
    public String toString() {
        return this.firstNameAuthor + " " + this.secondNameAuthor;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        Author a = (Author) other;
        return Objects.equals(firstNameAuthor, a.firstNameAuthor) && Objects.equals(secondNameAuthor, a.secondNameAuthor);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstNameAuthor, secondNameAuthor);
    }
}

