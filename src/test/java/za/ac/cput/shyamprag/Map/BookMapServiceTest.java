package za.ac.cput.shyamprag.Map;

import junit.framework.TestCase;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

public class BookMapServiceTest extends TestCase {

    @Test
    public void testAdd() {
        Map<Integer, Book> map = new HashMap<>();
        BookMapService service = new BookMapService(map);
        Book book = new Book();

        book.setTitle("Rich dad poor dad");
        book.setAuthor("Drummond");
        service.add(1, book);
        assertTrue(map.containsKey(1));
        assertTrue(map.containsValue(book));
    }

    @Test
    public void testFind() {
        Map<Integer, Book> map = new HashMap<>();
        BookMapService service = new BookMapService(map);
        Book book = new Book();
        book.setTitle("Rich dad poor dad");
        book.setAuthor("Drummond");
        service.add(1,book);

        Book book2 = service.find(1);
        assertEquals(book2,book);
        System.out.println(book.getTitle());
    }

    @Test
    public void testRemove() {
        Map<Integer, Book> map = new HashMap<>();
        BookMapService service = new BookMapService(map);
        Book book = new Book();
        book.setTitle("Rich dad poor dad");
        book.setAuthor("Drummond");
        service.add(1,book);

        service.remove(1);
        assertFalse(map.containsKey(1));
    }
}