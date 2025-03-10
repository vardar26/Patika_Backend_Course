package Hafta1.ArrayExercises;

import java.util.Scanner;

public class MinMaxValueOfArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaç elemanlı bir dizi girmek istiyorsunuz?");
        int size = scanner.nextInt();

        int [] number = new int[size];

        System.out.println("Lütfen " + size + " adet sayı giriniz");

        for (int i = 0; i < size; i++) {
            System.out.println((i+1) + ". sayıyı giriniz");
            number [i] = scanner.nextInt();
        }

        int min = number[0];
        int max = 0;

        for (int i = 0; i < number.length; i++) {
            if (number [i] < min) {
                min = number[i];
            }
            if (number[i]>max) {
                max = number [i];
            }

        }
        System.out.println("En küçük sayı = " + min);
        System.out.println("En büyük sayı = " + max);





    }
}
