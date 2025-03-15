package Exercises.StudentInformationSystem;

import java.time.LocalDate;
import java.util.Arrays;

public class Student {

    private String name;
    private String surname;
    private LocalDate birthdate;
    private Integer studentNo;

    private Course[] courses = new Course[5];


    public Student(String name, String surname, LocalDate birthdate, Integer studentNo) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.studentNo = studentNo;
    }

    public void addCourse(Course course, int index ){
        if (index<= courses.length && index>=0){
            courses[index] = course;
            System.out.println(course.getName() + " dersi başarıyla eklendi.");
        }else {
            System.out.println("Maximum ders sayısını aştınız");}
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Integer getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(Integer studentNo) {
        this.studentNo = studentNo;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthdate=" + birthdate +
                ", studentNo=" + studentNo +
                ", courses=" + Arrays.toString(courses) +
                '}';
    }
}

