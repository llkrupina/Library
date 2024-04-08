package org.example;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.util.ArrayList;
import org.example.AbstractFabric.Book;
import org.example.Builder.Person;

public class ArchiveGUI extends JFrame {
    private Archive archive;
    public ArchiveGUI() {
        archive = new Archive();
        setTitle("Список книг");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Создание дерева книг
        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("Университет");
        addCategories(rootNode, archive.getLibraryUsers());
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
            if (user.getStatus().equals("Студент")) {
                studentsNode.add(userNode);
            } else if (user.getStatus().equals("Преподаватель")) {
                professorsNode.add(userNode);
            }

            // Добавляем книги для каждого пользователя в узел пользователя
            ArrayList<Book> userBooks = user.getUserListBook();
            for (Book book : userBooks) {
                DefaultMutableTreeNode bookNode = new DefaultMutableTreeNode(book.GetFullDiscription());
                userNode.add(bookNode);
            }
        }
    }
}
