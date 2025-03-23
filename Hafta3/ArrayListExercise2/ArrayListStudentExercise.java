package Hafta3.ArrayListExercise2;

import java.util.ArrayList;

public class ArrayListStudentExercise {


static ArrayList<Student> students = new ArrayList<>();

    public void addStudent (){
        students.add(new Student("Mustafa",101));
        students.add(new Student("Hasan", 102));
        students.add(new Student("Ali", 103));
        students.add(new Student("Kemal",104));
    }

    public void printStudent (){
        for (Student s: students) {
            System.out.println(s);
        }
    }


    public static void main(String[] args) {
        ArrayListStudentExercise studentList = new ArrayListStudentExercise();

        studentList.addStudent();
        studentList.printStudent();



    }
}
