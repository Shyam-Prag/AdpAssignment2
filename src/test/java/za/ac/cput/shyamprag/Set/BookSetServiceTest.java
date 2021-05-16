package za.ac.cput.shyamprag.Set;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class BookSetServiceTest extends TestCase {

    @Test
    public void testAddToSet() {


        Set<Book> set = new HashSet<>();
        BookSetService service = new BookSetService(set);
        Book book = new Book();
        book.setTitle("rich dad poor dad");
        service.add(book);

        assertTrue(set.contains(book));


    }

    @Test
    public void testFindInSet() {


        Set<Book> set = new HashSet<>();
        BookSetService service = new BookSetService(set);
        Book book = new Book();
        book.setTitle("rich dad poor dad");
        service.add(book);


        Book book2 = service.find("rich dad poor dad");
        assertEquals(book2,book);
        System.out.println(book.getTitle());

    }

    @Test
    public void testRemoveFromSet() {

        Set<Book> set = new HashSet<>();
        BookSetService service = new BookSetService(set);
        Book book = new Book();
        book.setTitle("rich dad poor dad");
        service.add(book);

        service.remove(book);
        assertFalse(set.contains(book));

    }
}