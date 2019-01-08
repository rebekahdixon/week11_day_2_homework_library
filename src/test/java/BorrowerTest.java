import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    Borrower borrower;
    Library library;
    Book book;

    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library(1);
        book = new Book("Harry Potter", "J.K. Rowling", "Fiction");
    }

    @Test
    public void checkHowManyBooksInCollection(){
        assertEquals(0, borrower.countCollection());
    }

    @Test
    public void addBookToCollection(){
        borrower.addBook(book);
        assertEquals(1, borrower.countCollection());

    }

    @Test
    public void addBookFromLibraryToCollection(){
        library.addBook(book);
        borrower.borrowBook(library, book);
        assertEquals(1, borrower.countCollection());
        assertEquals(0, library.countBooks());
    }
}
