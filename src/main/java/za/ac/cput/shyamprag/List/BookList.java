package za.ac.cput.shyamprag.List;

import java.util.ArrayList;
import java.util.List;

public class BookList {
    private List<Book>list;

    public BookList(){
    list = new ArrayList<Book>(){};
    }

    public BookList(List<Book>list){
        this.list = list;
    }

    public void add(Book book){
        list.add(book);
    }

    public Book find(String bookTitle){
        for(Book book: list){
            if (book.getTitle().equals(bookTitle)){
                return book;
            }
        }
        return null;
    }

    public void remove(Book book){
        list.remove(book);
    }

}



