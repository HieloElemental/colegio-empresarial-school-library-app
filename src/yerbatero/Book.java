/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yerbatero;

/**
 *
 * @author Alejandro Gutierrez Muñoz; Samuel Betancur Diosa
 */
public class Book {
    private String name;
    private String author;
    
    public Book(String name, String author){
        this.name = name;
        this.author = author;
    }
    
    public String getBookname() {
        return name;
    }
    
    public String getBookauthor() {
        return author;
    }
    
    public static class Builder {
        private String name;
        private String author;
        
        public Builder setBookname (String name) {
            this.name = name;
            return this;
        }
        
        public Builder setBookAuthor (String author) {
            this.author = author;
            return this;
        }
        
        public Book build() {
            return new Book(name, author);
        }
    }
}
