package Hafta1.ArrayExercises;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayExercise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç elemanlı bir dizi girmek istiyorsunuz?");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("lütfen " + size + " adet sayı giriniz");

        for (int i = 0; i < size; i++) {
            System.out.println((i+1) + ". sayıyı giriniz");
            numbers[i] = scanner.nextInt();


        }

        Arrays.sort(numbers);

        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);

        }
    }
}
