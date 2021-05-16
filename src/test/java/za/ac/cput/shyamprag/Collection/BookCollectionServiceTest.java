package za.ac.cput.shyamprag.Collection;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;


public class BookCollectionServiceTest extends TestCase {

    @Test
    public void testAdd() {
        ArrayList<Book> collection = new ArrayList<>();
        BookCollectionService service = new BookCollectionService(collection);
        Book book = new Book();

        book.setTitle("Rich dad poor dad");
        book.setAuthor("Drummond");
        service.add(book);
        assertTrue(collection.contains(book));
    }

    @Test
    public void testFind() {
        ArrayList<Book> collection = new ArrayList<>();
        BookCollectionService service = new BookCollectionService(collection);
        Book book = new Book();

        book.setTitle("Rich dad poor dad");
        book.setAuthor("Drummond");
        service.add(book);

        Book book2 = service.find("Rich dad poor dad");
        assertEquals(book2,book);
        System.out.println(book.getTitle());
    }

    @Test
    public void testRemove() {
        ArrayList<Book> collection = new ArrayList<>();
        BookCollectionService service = new BookCollectionService(collection);
        Book book = new Book();

        book.setTitle("Rich dad poor dad");
        book.setAuthor("Drummond");
        service.add(book);

        service.remove(book);
        assertFalse(collection.contains(book));
    }
}