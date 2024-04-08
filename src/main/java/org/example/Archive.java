package org.example;

import org.example.Builder.Users;
import org.example.Builder.Person;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.util.*;
import org.example.AbstractFabric.Book;

public class Archive {
    private  Users users;
    private  Library library;
    public  ArrayList<Person> libraryUsers;

    public ArrayList<Person> getLibraryUsers() {
        return libraryUsers;
    }

    public Archive() {
        // Инициализация полей класса Users и Library
        users = new Users();
        library = new Library();

        // Получение списка пользователей и списка книг
        libraryUsers = users.getlibraryUsers();
        System.out.println(libraryUsers);

        // Распределение книг для каждого пользователя
        for (Person userr : libraryUsers) {
            users.distributeUserBooks(userr, library);
        }

    }

}