
import java.time.Instant;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
public class ParcelMain{
public static void main(String[] args) {

ProgrammingLanguage java = new ProgrammingLanguage("Java", "James Gosling", Instant.parse("1995-01-01T00:00:00Z"));
ProgrammingLanguage c = new ProgrammingLanguage("C", "Dennis Ritchie", Instant.parse("1972-01-01T00:00:00Z"));
ProgrammingLanguage python = new ProgrammingLanguage("Python", "Guido van Rossum", Instant.parse("1991-01-01T00:00:00Z"));
ProgrammingLanguage javascript = new ProgrammingLanguage("JavaScript", "Brendan Eich", Instant.parse("1995-01-01T00:00:00Z"));

List<ProgrammingLanguage> languages = Arrays.asList(java, c, python, javascript);

ProgrammingLanguage oldestLanguage = languages.stream()
        .min(Comparator.comparing(ProgrammingLanguage::getDateOfCreation))
        .orElse(null);

        if (oldestLanguage != null) {
        System.out.println("Самый старый язык программирования: " + oldestLanguage.getName());
        } else {
        System.out.println("Нет доступных языков программирования.");
    }
}}

