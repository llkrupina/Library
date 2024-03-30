package org.example.AbstractFabric;

public abstract class Book {
    String title;
    String author;
    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public String GetFullDiscription() {
        return this.title;
    }
}
