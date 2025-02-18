import java.util.ArrayList;

public class Library {
        ArrayList <Book> buku = new ArrayList<>();

    public void addBook(Book buku) {
        this.buku.add(buku);
        System.out.println("Book added to library: " + buku.title);
    }

    public void borrowBook(Borrower borrower, Book book) {
        // borrower.mengambil(book);
        borrower.books.add(book);
        this.buku.remove(book);
        System.out.println(borrower.peminjam + " Borrowed Books: " + book.title);
    }

    public void displayLibraryBooks() {
    System.out.println("Books in Library: ");
    for (Book book : buku) {
            book.printBook();
        }
    }

    public void returnBook(Borrower borrower, Book book) {
        // borrower.mengembalikan(book);
        borrower.books.remove(book);
        System.out.println(borrower.peminjam + "Book returned: " + book.title);
        this.buku.add(book);
    }

}
