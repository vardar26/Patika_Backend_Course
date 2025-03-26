package Hafta3.GenericArray;

public class Homework5 {


    public <T> void printArray (T[] array){
        for(T element : array){

        System.out.println(element);
    }
    }

    public static void main(String[] args) {

        Homework5 test = new Homework5();

        Integer[] numbers = {1,2,3,4,5};

        String[] strArray = { "Java", "Generics", "Ödev"};


        test.printArray(numbers);
        test.printArray(strArray);

    }
}
