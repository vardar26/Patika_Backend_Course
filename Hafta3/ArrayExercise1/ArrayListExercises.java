package Hafta3.ArrayExercise1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExercises {

        ArrayList<String> dogs = new ArrayList<>();



    public  void addDogs() {

        dogs.add("Golden Retriever");
        dogs.add("English Pointer");
        dogs.add("Kangal");
        dogs.add("Espanole Setter");
        dogs.add("Doberman");
        dogs.add("Doberman");


    }
    public void updateName(){
        dogs.set(0, "Irish Setter");

    }


    public void printDogs(){
        System.out.println(dogs);
    }

    public void removeSpecy (){
        dogs.remove(3);
    }

    public void printSize(){
        dogs.size();
        System.out.println(dogs.size());
    }

    public void checkBreed(){
        if(dogs.contains("Rot")) {
            System.out.println("Bu cins var");
        } else System.out.println("bu cins yok");

    }

    public void dogsSort () {
        Collections.sort(dogs);

    }

    public void dogsReverse () {
        Collections.reverse(dogs);
    }

    public void dogsGet () {
        System.out.println(dogs.get(2));
    }

    public  void  dogsFrequency(){

        int dobermanCount = Collections.frequency(dogs,"Doberman");

        System.out.println("Doberman " + dobermanCount + " kere listede yazılmış.");
    }

    public void dogsClear () {
        dogs.clear();

        System.out.println(dogs.size());
    }

    public static void main(String[] args) {
        ArrayListExercises dogsList = new ArrayListExercises();

        dogsList.addDogs();

        dogsList.printDogs();

        dogsList.updateName();

        dogsList.printDogs();

        dogsList.printSize();

        dogsList.checkBreed();

        dogsList.dogsSort();

        dogsList.printDogs();

        dogsList.dogsReverse();

        dogsList.printDogs();

        dogsList.dogsGet();

        dogsList.dogsFrequency();

        dogsList.dogsClear();

    }
}
