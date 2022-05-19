import java.sql.SQLOutput;

public class Main {

    // Метод, чтобы сразу печатать навзание книги, автора и год
    private static void printBookData(Book book) {
        System.out.println("Название книги: "+book.getBookName());
        System.out.println("Автор книги: "+book.getAuthor().getName()+" "+book.getAuthor().getSurname());
        System.out.println("Год издания книги: "+book.getYear());
        System.out.println("------------------------------------------");
    }
    // Книги и авторы для задачи:
    public static void main(String[] args) {

        Author bAkunin = new Author("Борис", "Акунин");
        Author sLem = new Author("Станислав", "Лем");
        Book almazKoles = new Book ("Алмазная колесница", bAkunin, 2002);
        Book solaris = new Book("Солярис", sLem, 1961);

        //добавим еще одну книгу для ДЗ-10
        Book solarisNew = new Book ("Солярис", sLem, 2002 );

        // Проверка работы классов Book и Author
        printBookData(almazKoles);
        printBookData(solaris);

        // проверка работы Сеттера
        almazKoles.setYear(2022);
        System.out.println("Книга "+almazKoles.getBookName()+" переиздана в году: "+almazKoles.getYear());


        // Домашнее задание 10:
        System.out.println(bAkunin.toString());
        System.out.println(almazKoles.toString());

        System.out.println(solaris.equals(solarisNew));


    }
}