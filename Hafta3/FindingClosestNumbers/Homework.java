package Hafta3.FindingClosestNumbers;

import java.util.ArrayList;
import java.util.Collections;

public class Homework {

    ArrayList<Integer> numbers = new ArrayList<>();

    //rakamları rastgele ekliyoruz
    public void addNumber (){
        numbers.add(5988);
        numbers.add(3214);
        numbers.add(4984);
        numbers.add(6516);
        numbers.add(5685);
        numbers.add(5162);
        numbers.add(6268);
        numbers.add(9032);
        numbers.add(1521);
        numbers.add(1569);
    }

    //sıralıyoruz
    public void sortNumbers () {
        Collections.sort(numbers);
    }

    public void printNumbers () {
        System.out.println(numbers);
    }
        //aradaki farkı en küçük olanı yani en yakın iki sayıyı buluyoruz
    public void findingClosest () {
        int minFark = Integer.MAX_VALUE;
        int enYakınRakam1= 0;
        int enYakınRakam2 = 0;

        for (int i = 0 ; i <numbers.size() -1 ; i++) {
            int fark = Math.abs(numbers.get(i) - numbers.get(i +1));
            if (fark<minFark){
                minFark = fark ;
            enYakınRakam1 =numbers.get(i);
            enYakınRakam2 = numbers.get(i+1);
        }
        }
        System.out.println("En yakın 2 sayı => " + enYakınRakam1 + " ve " + enYakınRakam2);
        System.out.println("En yakın 2 sayı arasındaki fark " + minFark);
    }
    //yazdırıyoruz
    public static void main(String[] args) {
        Homework numlist = new Homework();
        numlist.addNumber();
        System.out.println("Sırasız numaralar");
        numlist.printNumbers();
        numlist.sortNumbers();
        System.out.println("Sıralı numaralar");
        numlist.printNumbers();
        numlist.findingClosest();

    }
}
