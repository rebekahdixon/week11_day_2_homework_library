import java.util.ArrayList;

public class Library {
    private ArrayList<Book> stock;
    private int capacity;

    public Library(int capacity){
        this.capacity = capacity;
        this.stock = new ArrayList<>();
    }

    public int countBooks() {
        return stock.size();
    }

    public void addBook(Book book) {
        if (countBooks() < capacity) {
            stock.add(book);
        }
    }


    public Book removeBook(Book book) {
       int correctBook =  stock.indexOf(book);
       return stock.remove(correctBook);
    }
}
