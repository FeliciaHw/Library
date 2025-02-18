import java.util.ArrayList;

public class Borrower {
    String peminjam;
    ArrayList <Book> books = new ArrayList<>();

    public Borrower(String peminjam) {
        this.peminjam = peminjam;

    }

    public void displayBorrowedBooks() {
        System.out.println(peminjam + "'s" + " Borrowed Books: ");
        for (Book book : books) {
            book.printBook();
        }
    }

    public void mengambil(Book book) {
        this.books.add(book);
    }

    public void mengembalikan(Book book) {
        this.books.remove(book);
        System.out.println(peminjam + " returned: " + book.title);
    }

}
