package liberary;

public class Book {
    private String bookId;
    private String title;
    private String author;
    private String isbn;
    boolean available;
    public Book(String bookId, String title, String author, String isbn) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
    }
    public boolean checkAvailability() {
        return available;
    }
    public String getBookId() {
        return bookId;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public boolean isAvailable() {
        return available;
    }
}
