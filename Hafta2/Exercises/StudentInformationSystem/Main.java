package Exercises.StudentInformationSystem;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Teacher[] teachers = new Teacher[5];

        Teacher mathTeacher = new Teacher("Ali","Ak", "539867788");
        Teacher physicTeacher = new Teacher("Ayşe","Kara", "539867888");
        Teacher chemistryTeacher = new Teacher("Osman","Sarı", "539862788");
        Teacher biologyTeacher = new Teacher("Fadime","Mor", "537867788");
        Teacher turkishTeacher = new Teacher("Emrah","Yeşil", "535867788");

        teachers[0]=mathTeacher;
        teachers[1]=physicTeacher;
        teachers[2]=chemistryTeacher;
        teachers[3]=biologyTeacher;
        teachers[4]=turkishTeacher;


        Course mathCourse = new Course("Matematik", "MAT101", 8);
        Course physicCourse = new Course("Physic", "PYS101", 6);
        Course chemistryCourse = new Course("Kimya","CHE101", 6);
        Course biologyCourse = new Course("Biology", "BIO101", 6);
        Course turkishCourse = new Course("Turkish", "TUR101", 8);



        mathTeacher.setCourse(mathCourse);
        physicTeacher.setCourse(physicCourse);
        chemistryTeacher.setCourse(chemistryCourse);
        biologyTeacher.setCourse(biologyCourse);
        turkishTeacher.setCourse(turkishCourse);



        mathCourse.setTeacher(mathTeacher);
        physicCourse.setTeacher(physicTeacher);
        chemistryCourse.setTeacher(chemistryTeacher);
        biologyCourse.setTeacher(biologyTeacher);
        turkishCourse.setTeacher(turkishTeacher);


        Course [] courses = new Course[5];
        courses [0] = mathCourse;
        courses [1] = physicCourse;
        courses [2] = chemistryCourse;
        courses [3] = biologyCourse;
        courses [4] = turkishCourse;

        Student[] students = new Student[4];

        Student student1 = new Student("Hamza", "Kesik", LocalDate.of(1994,9,12), 101);
        Student student2 = new Student("Mustafa", "Kesik", LocalDate.of(1994,9,15), 102);
        Student student3 = new Student("Veli", "Kesik", LocalDate.of(1994,9,13), 103);
        Student student4 = new Student("Kadir", "Kesik", LocalDate.of(1994,9,17), 104);

        students[0]=student1;
        students[1]=student2;
        students[2]=student3;
        students[3]=student4;

        student1.setCourses(courses);
        student2.setCourses(courses);
        student3.setCourses(courses);
        student4.setCourses(courses);


        for (Teacher teacher: teachers){
            System.out.println(teacher);
        }

        for (Course course: courses){
            System.out.println(course);
        }

        for (Student student: students){
            System.out.println(student);
        }
        student1.addCourse(mathCourse,0);
        student1.addCourse(physicCourse,1);
        student1.addCourse(chemistryCourse,2);
        student1.addCourse(biologyCourse,3);
        student1.addCourse(turkishCourse,4);





    }

}
