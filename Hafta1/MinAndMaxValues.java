package Hafta1;

import java.util.Scanner;

public class MinAndMaxValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Kullanıcıdan numara alıyoruz
        System.out.println("Please enter a number");
        int number = scanner.nextInt();

        //ortalama almak için toplam değişkenlerini atıyoruz
        int sum = 0;
        int count = 0;

        // Girilen sayıya kadar denemesi için döngü ve koşulu giriyoruz
        for (int i = 0; i <= number; i++) {

            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count ++;
            }
        }

        // çıkan sonuca göre çıktı veriyoruz
        if (count > 1) {
            double avarage = (double) sum / count;
            System.out.println("Avarage number divisible by 3 and 4 is  " + avarage);
        } else {System.out.println("There are no numbers divisible by 3 and 4 in this range");
        }
    }
}
