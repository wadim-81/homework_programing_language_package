import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main01 {
    public static void main(String[] args) {
        List<Package> packages = new ArrayList<>();

        packages.add(new Package("Москва", "Берлин", 5.0, LocalDateTime.of(2024, 7, 26, 10, 0)));
        packages.add(new Package("Лондон", "Берлин", 2.5, LocalDateTime.of(2024, 7, 27, 9, 0)));
        packages.add(new Package("Париж", "Берлин", 3.0, LocalDateTime.of(2024, 7, 25, 14, 30)));
        packages.add(new Package("Токио", "Нью-Йорк", 4.0, LocalDateTime.of(2024, 7, 24, 11, 15)));

        Package newestPackageToBerlin = FindNewestPackageToBerlin.findNewestPackageToBerlin(packages);


            if (newestPackageToBerlin != null) {
                System.out.println("Самая новая посылка в Берлин: " + newestPackageToBerlin);
            } else {
                System.out.println("Посылок в Берлин нет.");
            }

        }}

