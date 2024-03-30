package org.example.Builder;

import java.util.ArrayList;
import org.example.AbstractFabric.Book;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import org.example.Library;

public class Users {
    static ArrayList<Person> libraryUsers = new ArrayList<>();
    public Director dir;
    public static ArrayList getlibraryUsers() {
        return libraryUsers;
    }
    public Users(){
        this.dir = new Director();

        createPersons(new StudentBuilder(), 3);
        createPersons(new ProfessorBuilder(), 6);
    }

    public void createPersons(PersonBuilder builder, int amount) {
        dir.setPersonBuilder(builder);
        for (int i = 0; i < amount; i++) {
            libraryUsers.add(dir.constructPerson());
        }
    }

    public Set<Book> distributeUserBooks(Person user) {
        ArrayList<Book> libraryBooks = Library.getLibrary();
        // Генерация случайного числа книг от 3 до 10
        int numBooks = new Random().nextInt(8) + 3;
        Set<Book> userBooks = new HashSet<>();

        // Добавление уникальных книг пользователю
        while (userBooks.size() < numBooks) {
            int index = new Random().nextInt(libraryBooks.size());
            userBooks.add(libraryBooks.get(index));
        }
        return userBooks;
    }


}
