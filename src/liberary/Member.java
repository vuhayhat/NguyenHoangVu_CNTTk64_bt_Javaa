package liberary;

import java.util.ArrayList;
import java.util.List;


public class Member {
    private String memberId;
    private String name;
    private String email;
    private List<Book> booksBorrowed;

    public Member(String memberId, String name, String email) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.booksBorrowed = new ArrayList<>();
    }
    public void borrowBook(Book book) {
        if (book.checkAvailability()) {
            booksBorrowed.add(book);
            book.available = false; // Mark the book as borrowed
        } else {
            System.out.println("Sach khong co san.");
        }
    }
    public void returnBook(Book book) {
        booksBorrowed.remove(book);
        book.available = true; // Mark the book as available again
    }
    public String getMemberId() {
        return memberId;
    }


}
