package Hafta1;

import java.util.Scanner;

public class CastingExercise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int intValue = scanner.nextInt();


        System.out.println("Enter a decimal number");
        double doubValue = scanner.nextDouble();


        double intToDouble = intValue;
        intValue =(int) doubValue;

        System.out.println("İnteger to decimal is= " + intToDouble);
        System.out.println("Decimal to integer is= " + intValue);

    }

}
