package Hafta3.ArrayListExercise2;

public class Student  {

    String name;
    Integer number;

    public Student(String name, Integer number) {
        this.name = name;
        this.number = number;
    }





    @Override
    public String toString() {
        return "Student Information > " +"\n"+
                "Name= '" + name + "\n" +
                "Number= " + number ;
    }
}
