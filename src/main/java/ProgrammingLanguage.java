public class ProgrammingLanguage {

    private String name;
    private String author;
    private String firstVersionDate;

    public ProgrammingLanguage(String name, String author, String firstVersionDate) {
        this.name = name;
        this.author = author;
        this.firstVersionDate = firstVersionDate;
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

    public String getFirstVersionDate() {
        return firstVersionDate;
    }

    public void setFirstVersionDate(String firstVersionDate) {
        this.firstVersionDate = firstVersionDate;
    }
}


