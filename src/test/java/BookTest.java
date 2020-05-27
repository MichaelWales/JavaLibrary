import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before() {
        book = new Book("The Girl with All the Gifts", "M.R. Carey", "Thriller");
    }

    @Test
    public void bookHasTitle() {
        assertEquals("The Girl with All the Gifts", book.getTitle());
    }

    @Test
    public void bookHasAuthor() {
        assertEquals("M.R. Carey", book.getAuthor());
    }

    @Test
    public void bookHasGenre() {
        assertEquals("Thriller", book.getGenre());
    }

}