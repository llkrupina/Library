package org.example;

import org.example.Builder.Users;
import org.example.Builder.Person;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.util.*;
import org.example.AbstractFabric.Book;

public class Archive extends JFrame {
    private final Users users;

    private final Library library;

    public Archive() {
        setTitle("Список книг");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Инициализация полей класса Users и Library
        users = new Users();
        library = new Library();

        // Получение списка пользователей и списка книг
        ArrayList<Person> libraryUsers = users.getlibraryUsers();
        System.out.println(libraryUsers);

        // Распределение книг для каждого пользователя
        for (Person userr : libraryUsers) {
            users.distributeUserBooks(userr, library);
        }

        // Создание дерева книг
        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("Университет");
        addCategories(rootNode, libraryUsers);
        JTree tree = new JTree(rootNode);
        JScrollPane scrollPane = new JScrollPane(tree);
        add(scrollPane);

        setSize(400, 300);
        setLocationRelativeTo(null);
    }

    private void addCategories(DefaultMutableTreeNode parent, ArrayList<Person> libraryUsers) {
        // Добавляем категории "Преподаватели" и "Студенты"
        DefaultMutableTreeNode professorsNode = new DefaultMutableTreeNode("Преподаватели");
        DefaultMutableTreeNode studentsNode = new DefaultMutableTreeNode("Студенты");
        parent.add(professorsNode);
        parent.add(studentsNode);

        // Добавляем преподавателей и студентов в соответствующие категории
        for (Person userr : libraryUsers) {
            System.out.println(userr.getStatus());
            DefaultMutableTreeNode userNode = new DefaultMutableTreeNode(userr.getFullname());
            if (userr.getStatus().equals("Студент")){
                studentsNode.add(userNode);
            } else if (userr.getStatus().equals("Преподаватель")){
                professorsNode.add(userNode);
            }

            // Добавляем книги для каждого пользователя в узел пользователя
            ArrayList<Book> userBooks = userr.getUserListBook();
            for (Book book : userBooks) {
                DefaultMutableTreeNode bookNode = new DefaultMutableTreeNode(book.GetFullDiscription());
                userNode.add(bookNode);
            }
        }
    }
}