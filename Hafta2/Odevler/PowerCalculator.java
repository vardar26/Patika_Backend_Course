package Odevler;

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Kullanıcıdan taban alıyoruz
        System.out.println("Enter base number");
        int base = scanner.nextInt();
        //üs alıyoruz
        System.out.println("Enter exponent number");
        int expo = scanner.nextInt();


        //metoda göre hesaplayıp yazdırıyoruz

        System.out.println(üsalma(base,expo));


    }

    public static int üsalma(int base, int expo){
        int result = 1;
        for (int i = 0;i < expo; i++) {
            result *=base;
        }
        return result;
    }
}
