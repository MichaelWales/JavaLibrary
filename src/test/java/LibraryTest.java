import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;

    @Before
    public void before() {
        library = new Library(4);
        book1 = new Book("Life of Pi", "Yann Martel", "Fiction");
        book2 = new Book("Seven Eves", "Neal Stephenson", "Sci-fi");
        book3 = new Book("Great North Road", "Peter F. Hamilton", "Sci-fi");
        book4 = new Book("The Silent Patient", "Alex Michaelides", "Thriller");
        book5 = new Book("The Atrocity Archives", "Charles Stross", "Horror");
    }

    @Test
    public void bookCountStartsAt0() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void bookCapacityIs4() {
        assertEquals(4, library.getCapacity());
    }

}