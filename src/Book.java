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
}
