import java.time.Instant;

public class ProgrammingLanguage {
    private String name;

    private String author;

    private Instant dateOfCreation;

    public ProgrammingLanguage(String name, String author, Instant dateOfCreation) {
        this.name = name;
        this.author = author;
        this.dateOfCreation = dateOfCreation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Instant getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Instant dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    @Override
    public String toString() {
        return "ProgrammingLanguage{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", dateOfCreation=" + dateOfCreation +
                '}';
    }
}


