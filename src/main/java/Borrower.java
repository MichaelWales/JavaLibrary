import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> borrowedBooks;

    public Borrower(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<Book>();
    }

    public void borrowBookFromLibrary(Library library) {
        Book book = library.removeBook();
        this.borrowedBooks.add(book);
    }

    public int numberOfBorrowedBooks() {
        return this.borrowedBooks.size();
    }

    public void returnBookToLibrary(Book book) {
        this.borrowedBooks.clear();
    }
}
