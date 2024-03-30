package org.example.Builder;

public class Director {
    PersonBuilder personBuilder;
    public void setPersonBuilder (PersonBuilder pb){
        personBuilder = pb;
    }

    public Person constructPerson(){
        personBuilder.createNewPerson();
        personBuilder.buildStatus();
        personBuilder.buildFullName();
        personBuilder.buildDeparment();
        personBuilder.buildCourse();
        return personBuilder.getPerson();
    }

}
