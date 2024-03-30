package org.example.Builder;

import com.github.javafaker.Faker;

import java.util.Locale;

public class ProfessorBuilder extends PersonBuilder{
    private Faker faker;
    public void buildFullName(){
        faker = new Faker(new Locale("ru"));
        String[] parts;
        String name = faker.name().fullName();
        parts = name.split(" ");
        while (parts.length < 3) {
            name = faker.name().fullName();
            parts = name.split(" ");
        }
        person.setName(name);
    }

    @Override
    public void buildStatus() {
        person.setStatus("Преподаватель");
    }
    public void buildDeparment(){
        person.setDeparment(72);
    }
    @Override
    public void buildCourse() {
    }

}
