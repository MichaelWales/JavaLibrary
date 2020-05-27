import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;

    private Book book1;
    private Book book2;
    private Book book3;

    private Borrower borrower;

    @Before
    public void before() {
        library = new Library(1);
        book1 = new Book("Life of Pi", "Yann Martel", "Fiction");
        book2 = new Book("Seven Eves", "Neal Stephenson", "Sci-fi");
        book3 = new Book("Great North Road", "Peter F. Hamilton", "Sci-fi");
        borrower = new Borrower("Steve");
    }

    @Test
    public void canReportCapacity() {
        assertEquals(true, library.hasCapacity());
    }

    @Test
    public void canAddBook__whenThereIsRoom() {
        library.addBook(book1);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void cantAddBook__whenNoRoom() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void checkBookAvailable() {
        assertEquals(false, library.checkInStock(book1));
    }

    @Test
    public void checkBookAvailable__true() {
        library.addBook(book1);
        assertEquals(true, library.checkInStock(book1));
    }

    @Test
    public void testCanLendBook() {
        library.addBook(book1);
        library.loanBook(book1, borrower);
        assertEquals(1, borrower.bookCount());
        assertEquals(0, library.bookCount());
        assertEquals(false, library.checkInStock(book1));
    }

}
