package org.example.Builder;

import java.util.ArrayList;
import java.util.Random;
import org.example.AbstractFabric.Book;
import org.example.Library;

public class Users {
    static ArrayList<Person> libraryUsers = new ArrayList<>();
    public Director director;

    public static ArrayList<Person> getlibraryUsers() {
        return libraryUsers;
    }

    public Users() {
        this.director = new Director();

        createPersons(new StudentBuilder(), 3);
        createPersons(new ProfessorBuilder(), 6);
    }

    public void createPersons(PersonBuilder builder, int amount) {
        director.setPersonBuilder(builder);
        for (int i = 0; i < amount; i++) {
            libraryUsers.add(director.constructPerson());
        }
    }

    public void distributeUserBooks(Person user, Library library) {
        // Генерация случайного числа книг от 3 до 10
        int numBooks = new Random().nextInt(8) + 3;

        // Добавление уникальных книг пользователю
        while (user.getUserListBook().size() < numBooks) {
            int index = new Random().nextInt(library.getLibrary().size());
            Book book = library.getLibrary().get(index);
            if (!user.getUserListBook().contains(book)) {
                user.getUserListBook().add(book);
            }
        }
    }
}