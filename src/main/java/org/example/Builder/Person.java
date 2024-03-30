package org.example.Builder;

import java.util.ArrayList;
import org.example.AbstractFabric.Book;

public class Person {
    String fullname;
    int deparment;
    int group;
    String status;
    ArrayList userListBook;

    public Person(){
        userListBook = new ArrayList<>();
    }
    public void setDeparment(int deparment){
        this.deparment = deparment;
    }
    public void setGroup(int group){
        this.group = group;
    }
    public void setName(String fullname){
        this.fullname = fullname;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFullDiscription() {
        String fulldidcription = fullname + " " + this.group + " " + this.deparment;
        return fulldidcription;
    }

    public ArrayList<Book> getUserListBook() {
        return userListBook;
    }

    public void addBook(Book book){
        userListBook.add(book);
    }

    public String getFullname() {
        return fullname;
    }

    public int getDeparment() {
        return deparment;
    }
    public int getGroup() {
        return group;
    }

    public String getStatus() {
        return status;
    }
}
