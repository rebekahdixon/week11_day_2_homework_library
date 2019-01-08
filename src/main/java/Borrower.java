import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<>();
    }

    public int countCollection() {
        return collection.size();
    }


    public void addBook(Book book) {
        collection.add(book);
    }

    public void borrowBook(Library library, Book book) {
        Book borrowedBook = library.removeBook(book);
        addBook(borrowedBook);
    }

}
