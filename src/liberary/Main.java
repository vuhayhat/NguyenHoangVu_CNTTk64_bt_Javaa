package liberary;

public class Main {
    public static void main(String[] args) {
        // Tạo thư viện
        Library library = new Library();

        // Thêm một số sách vào thư viện
        Book book1 = new Book("a001", "toan", "vu", "582889");
        Book book2 = new Book("a002", "van", "nam ", "928227");
        library.addBook(book1);
        library.addBook(book2);

        // Đăng ký các thành viên
        Member member1 = new Member("1", "vuhoang", "a@gmail.com");
        Member member2 = new Member("2", "nhung", "b@gmail.com");
        library.registerMember(member1);
        library.registerMember(member2);

        // Hiển thị trạng thái sách trong thư viện
        System.out.println("Trạng thái sách trong thư viện:");
        for (Book book : library.getBooks()) {
            System.out.println("Mã sách: " + book.getBookId());
            System.out.println("Tiêu đề: " + book.getTitle());
            System.out.println("Tác giả: " + book.getAuthor());
            System.out.println("Trạng thái: " + (book.checkAvailability() ? "Có sẵn" : "Đã được mượn"));
            System.out.println();
        }

        // Mượn sách và hiển thị lại trạng thái sách
        System.out.println("\nvuhoang mượn sách:");
        library.borrowBook("a001", "1");
        System.out.println("\nTrạng thái sách sau khi mượn:");
        for (Book book : library.getBooks()) {
            System.out.println("Mã sách: " + book.getBookId());
            System.out.println("Tiêu đề: " + book.getTitle());
            System.out.println("Tác giả: " + book.getAuthor());
            System.out.println("Trạng thái: " + (book.checkAvailability() ? "Có sẵn" : "Đã được mượn"));
            System.out.println();
        }

        // Trả sách và hiển thị lại trạng thái sách
        System.out.println("\nvuhoang trả sách:");
        library.returnBook("b001", "1");
        System.out.println("\nTrạng thái sách sau khi trả:");
        for (Book book : library.getBooks()) {
            System.out.println("Mã sách: " + book.getBookId());
            System.out.println("Tiêu đề: " + book.getTitle());
            System.out.println("Tác giả: " + book.getAuthor());
            System.out.println("Trạng thái: " + (book.checkAvailability() ? "Có sẵn" : "Đã được mượn"));
            System.out.println();
        }
    }
}
