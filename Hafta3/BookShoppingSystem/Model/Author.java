package Hafta3.BookShoppingSystem.Model;

import Hafta3.BookShoppingSystem.Model.enums.Gender;

import java.time.LocalDate;

public class Author {

    private String name;

    private String surname;

    private Gender gender;

    private LocalDate birthdate;

    private String bio;

    public Author(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public String getBio() {
        return bio;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                '}';
    }
}
