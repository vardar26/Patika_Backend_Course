package Hafta1;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number of rows:");
        int number = scanner.nextInt();

        // Satır döngüsü
        for (int i = number; i >= 1; i--) {

            // Boşluk döngüsü
            for (int j = 0; j < number - i; j++) {
                System.out.print(" ");
            }

            // Yıldız döngüsü
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println(); // Satır tamamlanınca yeni satıra geç
        }


    }
}




