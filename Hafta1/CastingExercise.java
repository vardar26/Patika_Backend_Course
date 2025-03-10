package Hafta1;

import java.util.Scanner;

public class CastingExercise {
    public static void main(String[] args) {


        //Kullanıcıdan tam sayı al
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int intValue = scanner.nextInt();

        // ondalıklı sayı al
        System.out.println("Enter a decimal number");
        double doubValue = scanner.nextDouble();

        // casting işlemini yap
        double intToDouble = intValue;
        intValue =(int) doubValue;

        //sonucu yazdır
        System.out.println("İnteger to decimal is= " + intToDouble);
        System.out.println("Decimal to integer is= " + intValue);

    }

}
