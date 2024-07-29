import java.util.List;
import java.util.Comparator;

public class ProgrammingLanguageUtils {

        public static ProgrammingLanguage findOldestLanguage(List<ProgrammingLanguage> languages) {
            return languages.stream()
                    .min(Comparator.comparing(ProgrammingLanguage::getDateOfCreation))
                    .orElse(null);

    }
}
