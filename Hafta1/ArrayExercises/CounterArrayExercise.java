package Hafta1.ArrayExercises;

import java.util.Scanner;

public class CounterArrayExercise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç elemanlı bir dizi istiyorsunuz?");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        System.out.println(size + "adet elemanı giriniz");

        for (int i = 0; i < size; i++) {
            System.out.println((i+1) + ". elemanı giriniz");

            numbers[i] = scanner.nextInt();

        }

        System.out.println("Aramak istediğiniz sayıyı giriniz");
        int number = scanner.nextInt();

        int counter=0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]==number) {
                counter++;
            }
        }System.out.println("aradığınız sayı " + counter + " kere geçiyor." );
    }
}
