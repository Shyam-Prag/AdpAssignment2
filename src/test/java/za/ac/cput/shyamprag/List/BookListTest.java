package za.ac.cput.shyamprag.List;

import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.shyamprag.Collection.Book;
import za.ac.cput.shyamprag.Collection.BookCollectionService;
import java.util.ArrayList;

public class BookListTest extends TestCase {

    @Test
    public void testAdd() {
        ArrayList<Book> list = new ArrayList<>();
        BookCollectionService service = new BookCollectionService(list);
        Book book = new Book();

        book.setTitle("Rich dad poor dad");
        book.setAuthor("Drummond");
        service.add(book);
        assertTrue(list.contains(book));
    }

    @Test
    public void testFind() {
        ArrayList<Book> list = new ArrayList<>();
        BookCollectionService service = new BookCollectionService(list);
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
        ArrayList<Book> list = new ArrayList<>();
        BookCollectionService service = new BookCollectionService(list);
        Book book = new Book();

        book.setTitle("Rich dad poor dad");
        book.setAuthor("Drummond");
        service.add(book);

        service.remove(book);
        assertFalse(list.contains(book));
    }
}