package Hafta5.Records;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MainStudent {
    public static void main(String[] args) {


        Student student = new Student("Kemal", "Birinci", 152);

        System.out.println(student.name() + " -  " + student.surname() + " -  " + student.number());

        var student1 = new Student("Hasan", "Sonuncu", 155);

        System.out.println(student1.surname() + "  -  " + student1.name() + "  -  "+ student1.number());
    }
}
