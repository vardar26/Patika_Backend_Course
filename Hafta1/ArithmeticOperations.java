package Hafta1;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //kullanıcıdan sayıları alıyoruz
        System.out.println("enter a value for number a");
        double numa = scanner.nextDouble();

        System.out.println("enter a value for number b");
        double numb = scanner.nextDouble();

        System.out.println("enter a value for number c");
        double numc = scanner.nextDouble();


        //sonucu hesaplayıp çıktı veriyoruz
        double result = numa+(numb*numc)-numb;
        System.out.println("The result of " + numa + " + " + numb + " * " + numc + " - " + numb + " = " + result);

    }
}
