package za.ac.cput.shyamprag.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class BookCollectionService {
    private Collection <Book> collection;

    public BookCollectionService(){

        collection = new ArrayList();
    }

    public BookCollectionService(ArrayList <Book> collection){
        this.collection = collection;

    }

    public void add(Book book){
        collection.add(book);

    }

    public Book find(String title){
        for(Book book: collection){
            if (book.getTitle().equals(title)){
                return book;
            }
        }
        return null;
    }

    public void remove(Book key){
        collection.remove(key);
    }


}
