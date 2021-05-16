package za.ac.cput.shyamprag.Set;

import java.util.HashSet;
import java.util.Set;

public class BookSetService {
    private Set<Book> set;

    public BookSetService(){

        set= new HashSet<Book>(){};
    }

    public BookSetService(Set<Book> set){

        this.set = set;

    }

    public void add(Book book){

        set.add(book);

    }

    public Book find(String title){

        for(Book book: set){
            if (book.getTitle().equals(title)){
                return book;
            }
        }
        return null;
    }

    public void remove(Book book){
        set.remove(book);
    }

}
