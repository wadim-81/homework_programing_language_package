public class Main {
    public static void main(String[] args) {


    //        1. Создайте класс "Язык программирования"
//        1.1 Добавьте поля: название языка, автор языка (или компания), дата первой версии языка
//        1.2 Создайте несколько языков программирования
//        1.3 Найдите среди них самых старый язык, используя любой подход (стримы привествуются)
//
//        2. Создайте класс "посылка".
//        2.1 Добавьте поля: город отправления и город получения, вес посылки, дата-время создания посылки
//        (посылки могут создаваться по всему миру, очень много часовых поясов, нам важна не конкретная дата,
//        а лишь какая посылка была создана ранее, чем другая)
//        2.2 Создать несколько посылок
//        2.3 Найти самую новую посылку среди тех, кто отправляется в Берлин
//
//        3. Создать класс Meeting (встреча),
//                3.1 В класс добавьте поля: кто встречается, с кем встречается и дату-время встречи
//        3.2 Создайте несколько встреч
//        3.3 Найдите среднее время начала всех встреч
//        (Например, две встречи - одна встреча начинается 14-00, другая встреча начинается 16-00.
//        Тогда среднее время начала встречи - 15-00)

    ProgrammingLanguage java = new ProgrammingLanguage("Java", "James Gosling", "1995");
    ProgrammingLanguage python = new ProgrammingLanguage("Python", "Guido van Rossum", "1991");

    ProgrammingLanguage oldestLanguage = findOldestLanguage(java,python);


        System.out.println("Самый старый язык: " + oldestLanguage.getName());
    }
    private static ProgrammingLanguage findOldestLanguage(ProgrammingLanguage... languages) {
        ProgrammingLanguage oldestLanguage = null;
        int oldestYear = Integer.MAX_VALUE;

        for (ProgrammingLanguage language : languages) {
            int year = Integer.parseInt(language.getFirstVersionDate());
            if (year < oldestYear) {
                oldestYear = year;
                oldestLanguage = language;
            }
        }

        return oldestLanguage;
    }
    }