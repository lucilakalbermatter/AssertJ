package main.java;

import java.util.List;

public class Person {

    private String firstName;
    private final String lastName;
    private final int age;
    private final List<String> citiesVisited;
    private final boolean isMarried;

    public Person(String firstName, String lastName, int age, List<String> citiesVisited, boolean isMarried) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.citiesVisited = citiesVisited;
        this.isMarried = isMarried;
    }

    public void setFirstName(String firstName) throws IllegalArgumentException {
        if(firstName == null){
            throw new IllegalArgumentException("First Name can not be null");
        }
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public List<String> getCitiesVisited() {
        return citiesVisited;
    }

    public boolean isMarried() {
        return isMarried;
    }


}
