
public class Book {
        private String title;
        String code;
        Author author;

    public Book(String title, String code, Author author) {
        this.title = title;
        this.code = code;
        this.author = author;
    }

    public void printBook() {
        System.out.println("Title: " + title);
        System.out.println("ISBN: " + code);
        System.out.println("Author: " + author.name);
        System.out.println("Biography: " + author.desc);
        System.out.println("-------------------------------------------");
    }

}
