package com.springbootmongodb.persons;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@ToString(exclude = {"id", "dateOfBirth"})
@Document(collection = "people")
public class Person {

    @Id
    private String id;
    private String firstName;
    private String secondName;
    private LocalDateTime dateOfBirth;
    private Address address;
    private String profession;
    private int salary;
    private List<Hobby> hobbies;

    public Person(
            final String firstName,
            final String secondName,
            final LocalDateTime dateOfBirth,
            final Address address,
            final String profession,
            final int salary,
            final List<Hobby> hobbies) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.profession = profession;
        this.salary = salary;
        this.hobbies = hobbies;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public List<Hobby> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<Hobby> hobbies) {
        this.hobbies = hobbies;
    }
}
