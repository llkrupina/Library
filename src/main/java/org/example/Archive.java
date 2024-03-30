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
        ArrayList<Book> libraryBooks = library.getLibrary();
        System.out.println(libraryBooks);

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
        for (Person user : libraryUsers) {
            System.out.println(user.getStatus());
            DefaultMutableTreeNode userNode = new DefaultMutableTreeNode(user.getFullname());
            if (user.getStatus().equals("Студент")){
                studentsNode.add(userNode);
            } else if (user.getStatus().equals("Преподаватель")){
                professorsNode.add(userNode);
            }

            // Получаем книги для каждого пользователя и добавляем их в узел пользователя
            Set<Book> userBooks = users.distributeUserBooks(user);
            for (Book book : userBooks) {
                DefaultMutableTreeNode bookNode = new DefaultMutableTreeNode(book.GetFullDiscription());
                userNode.add(bookNode);
            }
        }
    }
}
