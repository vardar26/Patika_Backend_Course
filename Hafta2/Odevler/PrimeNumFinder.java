package Odevler;

import java.util.Scanner;

public class PrimeNumFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan numara alıyoruz
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        //metoda göre check ediyoruz

        if (isPrime(number,2)){
            System.out.println("Number " + (number) +" is prime");
        }
        else {
            System.out.println("Number " + (number) + " is not prime");
        }





/*metod tanımlıyoruz// recursive istiyormuş
}   public static boolean isPrime(int num) {
        if (num<=1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        } return true;
    }*/



        // recursive metod tanımlıyoruz
    } public static boolean isPrime(int num, int i) {
        if (num <= 1) return false;
        if (i > Math.sqrt(num)) return true; //
        if (num % i == 0) return false; //

        // Recursive çağrı (kendini çağırma)
        return isPrime(num, i + 1);


}}
