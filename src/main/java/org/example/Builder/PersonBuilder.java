package org.example.Builder;

abstract class PersonBuilder {
    protected Person person;
    public Person getPerson(){
        return person;
    }
    public void createNewPerson(){
        person = new Person();
    }
    public abstract void buildDeparment();
    public abstract void buildCourse();
    public abstract void buildFullName();
    public abstract void buildStatus();

}
