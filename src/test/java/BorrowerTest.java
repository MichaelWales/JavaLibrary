import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;

    @Before
    public void before() {
       borrower =  new Borrower("Steve");
       book = new Book("The Girl with All the Gifts", "M.R. Carey", "Thriller");
    }

    @Test
    public void testCountBooks() {
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void testCanAddBook() {
        borrower.addBook(book);
        assertEquals(1, borrower.bookCount());
    }

}
