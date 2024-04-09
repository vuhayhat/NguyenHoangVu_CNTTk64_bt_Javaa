package liberary;

import java.util.ArrayList;
import java.util.List;


public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void registerMember(Member member) {
        members.add(member);
    }
    public void borrowBook(String bookId, String memberId) {
        Book bookToBorrow = findBookById(bookId);
        Member borrowingMember = findMemberById(memberId);

        if (bookToBorrow != null && borrowingMember != null) {
            borrowingMember.borrowBook(bookToBorrow);
        } else {
            System.out.println("Không tìm thấy sách hoặc thành viên.");
        }
    }
    public void returnBook(String bookId, String memberId) {
        Book bookToReturn = findBookById(bookId);
        Member returningMember = findMemberById(memberId);

        if (bookToReturn != null && returningMember != null) {
            returningMember.returnBook(bookToReturn);
        } else {
            System.out.println("Không tìm thấy sách hoặc thành viên.");
        }
    }
    private Book findBookById(String bookId) {
        for (Book book : books) {
            if (book.getBookId().equals(bookId)) {
                return book;
            }
        }
        return null;
    }
    private Member findMemberById(String memberId) {
        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }
        }
        return null;
    }
    public List<Book> getBooks() {
        return books;
    }

}
