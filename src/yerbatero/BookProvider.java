/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yerbatero;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class BookProvider {
    private List<Book> books;
    
    public BookProvider(){
        books = new ArrayList<>();
        books.add(new Book.Builder()
            .setBookname("Canción de Fuego y Hielo")
            .setBookAuthor("R.R. Martin")
            .build());
        books.add(new Book.Builder()
            .setBookname("Un día con los robinsons")
            .setBookAuthor("William Joyce")
            .build());
        books.add(new Book.Builder()
            .setBookname("Harry Potter y la piedra filosofal")
            .setBookAuthor("J. K. Rowlin")
            .build());
    }
    
    public void addBook(String bookname, String author) {
        books.add(new Book.Builder()
            .setBookname(bookname)
            .setBookAuthor(author)
            .build());
    }
    
    public Book getBookByName(String bookname){
        for (Book book : books) {
            if (book.getBookname().equals(bookname)) {
                return book;
            }
        }
        return null;
    }
    
    public List<Book> getBooks() {
        return books;
    }
}
