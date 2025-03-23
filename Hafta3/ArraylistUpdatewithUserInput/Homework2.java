package Hafta3.ArraylistUpdatewithUserInput;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework2 {

        //arraylist oluşturup harf ekliyoruz
    ArrayList<String> harfler = new ArrayList<>();

    public void harfEkle(){
        harfler.add("G");
        harfler.add("T");
        harfler.add("H");
        harfler.add("Y");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Homework2 sınıfından bir nesne oluşturuyoruz
        Homework2 homework = new Homework2();

        // Harfler listesine başlangıç harflerini ekliyoruz
        homework.harfEkle();



    for(int i = 0; i < 4; i++){
        System.out.println("Harf girin");
        String userInput = scanner.nextLine().toUpperCase();//büyük harfe çeviriyoruz
        if (homework.harfler.contains(userInput)) {
            int index = homework.harfler.indexOf(userInput);
            homework.harfler.set(index, "found");
            System.out.println("Harf bulundu ve güncellendi");
        }
        else {
            homework.harfler.add(userInput);
            System.out.println("Harf listeye eklendi");}



    }
        System.out.println("Güncel liste "+ homework.harfler);
}}
