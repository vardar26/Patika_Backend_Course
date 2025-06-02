package Hafta_7;

import java.util.Scanner;

public class DividingToZeroException {

    //🔹 1. Temel Try-Catch
    //Konu: ArithmeticException
    //Görev: Kullanıcıdan bir sayı al, 100’ü sayıya böl, sıfıra bölünürse hatayı yakala.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        try {
            System.out.println(" Enter a number ");

            int num = scanner.nextInt();

            int result = 100 / num ;

            System.out.println(" Result is " + result);

        } catch (ArithmeticException e) {
            System.out.println( " Can't be divided to zero!");
        } finally {
            scanner.close();
        }


    }
}
