package org.example.Builder;

import java.util.ArrayList;

public class Users {
    static ArrayList<Person> libraryUsers = new ArrayList<>();
    public static ArrayList getlibraryUsers() {
        return libraryUsers;
    }
    public Users(){
        Director director = new Director();
        Director director2 = new Director();
        PersonBuilder proffesorBuilder = new ProfessorBuilder();
        PersonBuilder studentBuilder = new StudentBuilder();
        director2.setPersonBuilder(studentBuilder);
        director.setPersonBuilder(proffesorBuilder);
        for (int i = 0; i < 10; i += 2) {
           libraryUsers.add(director.constructPerson());
           libraryUsers.add(director2.constructPerson());
        }
    }

}
