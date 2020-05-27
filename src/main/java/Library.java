import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> bookCollection;
    private int capacity;
    private HashMap<String, Integer> genreHashmap;

    public Library(int capacity) {
        this.bookCollection = new ArrayList<Book>();
        this.capacity = capacity;
        this.genreHashmap = new HashMap<String, Integer>();
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean hasCapacity() {
        return capacity > bookCollection.size();
    }

    public int bookCount() {
        return this.bookCollection.size();
    }

    public void addBook(Book book) {
        if(hasCapacity()){
            this.bookCollection.add(book);
            this.addToGenreHashmap(book);
        }
    }

    public void addToGenreHashmap(Book book){

        String genre = book.getGenre();
        if(this.genreHashmap.containsKey(genre)){
            int counter = genreHashmap.get(genre);
            counter++;
            this.genreHashmap.put(genre, counter);
        } else {
            this.genreHashmap.put(genre, 1);
        }
    }

    public void loanBook(Book book, Borrower borrower) {
        if(this.bookCollection.contains(book)){
            this.bookCollection.remove(book);
            borrower.addBook(book);
        }
    }

    public boolean checkInStock(Book book) {
        for(Book individualBook:this.bookCollection){
            if(individualBook == book){
                return true;
            }
        }
        return false;
    }

    public int checkGenreFrequency(String genre) {
        return this.genreHashmap.get(genre);
    }

}
