package Hafta5.Records;

import java.util.ArrayList;

public record Student(String name, String surname, int number) {



    static Student student = new Student("Hasan", "Taşan", 156);
    static Student student1 = new Student("Ali", "Koşan", 157);
    static Student student2 = new Student("Veli", "Uçan", 158);
    static Student student3 = new Student("Burak", "Bakan", 159);
    static Student student4 = new Student("Mert", "Yatan", 155);

}
