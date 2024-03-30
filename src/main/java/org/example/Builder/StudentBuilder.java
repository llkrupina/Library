package org.example.Builder;

import com.github.javafaker.Faker;

import java.util.Locale;

public class StudentBuilder extends PersonBuilder {
    private Faker faker;
    public void buildFullName(){
        faker = new Faker(new Locale("ru"));
        String[] parts;
        String name = faker.name().fullName();
        parts = name.split(" ");
        while (parts.length != 2) {
            name = faker.name().fullName();
            parts = name.split(" ");
        }
        person.setName(name);
    }
    @Override
    public void buildDeparment() {
    }

    @Override
    public void buildStatus() {
        person.setStatus("Студент");
    }
    public void buildCourse(){
        person.setGroup(2);
    }
}
