package Hafta1;

import java.util.Scanner;

public class PerfectNumberCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to see if it's a perfect number:");
        int number = scanner.nextInt();


        int sum = 0;

        // 1'den girilen sayının yarısına kadar bölenleri bul
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i; // Böleni toplama ekle
            }
        }

        // Sayının mükemmel olup olmadığını kontrol et
        if (sum == number) {
            System.out.println(number + " is a perfect number!");
        } else {
            System.out.println(number + " is NOT a perfect number.");
        }


        scanner.close();
    }
}
