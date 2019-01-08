import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library(1);
        book = new Book("Harry Potter", "J.K. Rowling", "Fiction");
    }

    @Test
    public void checkNumberOfBooksInStock(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void addBookToLibrary(){
        library.addBook(book);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void doesntAddBookToLibraryOnlyIfCapcaityFull(){
        library.addBook(book);
        library.addBook(book);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void removeBook(){
        library.addBook(book);
        assertEquals(1, library.countBooks());
        library.removeBook(book);
        assertEquals(0, library.countBooks());
    }
}
