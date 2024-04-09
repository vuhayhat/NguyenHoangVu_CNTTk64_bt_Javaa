package liberary;

import java.time.LocalDate;

public class Borrow {
    private String borrowId;
    private Book book;
    private Member member;
    private LocalDate borrowDate;
    private LocalDate returnDate;
    public Borrow(String borrowId, Book book, Member member) {
        this.borrowId = borrowId;
        this.book = book;
        this.member = member;
        this.borrowDate = LocalDate.now();
        this.returnDate = this.borrowDate.plusWeeks(2); // Two weeks borrowing period by default
    }
    public boolean isOverdue() {
        return LocalDate.now().isAfter(returnDate);
    }

}
