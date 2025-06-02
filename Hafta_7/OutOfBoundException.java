package Hafta_7;

import java.lang.reflect.Array;
import java.util.Scanner;

public class OutOfBoundException {

    //🔹 **2\. Dizi Taşması** **Konu:** `ArrayIndexOutOfBoundsException` **Görev:** Sabit boyutlu bir dizi oluştur, kullanıcıdan indis al, geçersizse yakala.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {


            int[] numbers = {1, 2, 3, 4, 5};

            System.out.println("Enter an index to see the value from array");

            int index = scanner.nextInt();

            System.out.println("Value you have chosen is " + numbers[index]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(" The number you have chosen is not in array");
        }
        finally {
            scanner.close();
        }
    }
}
