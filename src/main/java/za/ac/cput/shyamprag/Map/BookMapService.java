package za.ac.cput.shyamprag.Map;

import java.util.*;

public class BookMapService {
    private Map<Integer, Book> map;

    public BookMapService(){

        map= new HashMap<>();
    }

    public BookMapService(Map<Integer, Book> map){
        this.map = map;
    }

    public void add(int key, Book book){
        map.put(key,book);
    }

    public Book find(int key){
        return map.get(key);
    }

    public void remove(int key){
        map.remove(key);
    }
}
