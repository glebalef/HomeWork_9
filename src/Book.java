import java.util.Objects;

public class Book {
    private String bookName;
    private Author author;
    private int year;

    public Book(String name, Author author, int year) {
        this.bookName = name;
        this.author = author;
        this.year = year;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Книга: "+this.bookName+"; " +"год издания:"+"; "+this.year+"; "+"Автор книги: "+this.author.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookName.equals(book.bookName) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author);
    }
}
