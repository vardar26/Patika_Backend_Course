package Hafta_7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MismatchException {

    //🔹 3. Tip Dönüşüm Hatası
    //Konu: NumberFormatException
    //Görev: Kullanıcıdan sayı al ama bir harf girerse hatayı yakala.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println(" Enter a number!");

            int num = scanner.nextInt();

            System.out.println("Number you chose is " + num);
        } catch (InputMismatchException e) {
            System.out.println(" You didn't enter a number");}
    }

}