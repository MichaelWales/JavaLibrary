import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookCollection;
    private int capacity;

    public Library(int capacity) {
        this.bookCollection = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int bookCount() {
        return this.bookCollection.size();
    }

    public int getCapacity() {
        return this.capacity;
    }
}
